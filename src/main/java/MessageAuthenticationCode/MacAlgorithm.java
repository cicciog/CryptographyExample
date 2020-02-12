package MessageAuthenticationCode;

import javax.crypto.Mac;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class MacAlgorithm {
    private String message;
    private Key key;
    private Mac mac;

    public MacAlgorithm(Key pKey,String pMessage) throws NoSuchAlgorithmException {
        //obtain key and a message
        this.key = pKey;
        this.message = pMessage;
        //Creating a Mac object
        this.mac = Mac.getInstance("HmacSHA256");
    }

    public byte[] MacOperation() throws InvalidKeyException {
        //Initializing the Mac object
        mac.init(this.key);
        //Computing the Mac
        byte[] msg = this.message.getBytes();
        byte[] macResult = mac.doFinal(msg);
        return macResult;
    }
}
