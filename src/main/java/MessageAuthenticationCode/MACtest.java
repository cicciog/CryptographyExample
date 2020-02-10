package MessageAuthenticationCode;

import javax.crypto.Mac;

public class MACtest {
    public static void main(String args[]) throws Exception {
        Kgen kgen = new Kgen();

        //Creating a Mac object
        Mac mac = Mac.getInstance("HmacSHA256");

        //Initializing the Mac object
        mac.init(kgen.generatesKey());

        //Computing the Mac
        String msg = new String("Hi how are you");

        System.out.println(msg);
        byte[] bytes = msg.getBytes();
        byte[] macResult = mac.doFinal(bytes);

        System.out.println("Mac result:");
        System.out.println(new String(macResult));



    }
}
