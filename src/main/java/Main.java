import MessageAuthenticationCode.KeyGen;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import java.security.Key;
import java.security.SecureRandom;

public class Main {
    public static void main(String args[])throws Exception {
        KeyGen keyGen = new KeyGen();

        Key key = keyGen.getKey();
        System.out.println("key: "+key);

        //Creating a Mac object
        Mac mac = Mac.getInstance("HmacSHA256");

        //Initializing the Mac object
        mac.init(key);

        //Computing the Mac
        String msg = new String("Hi how are you");
        System.out.println("message: "+msg);
        byte[] bytes = msg.getBytes();
        byte[] macResult = mac.doFinal(bytes);

        System.out.println("Mac result:");
        System.out.println(new String(macResult));
    }
}
