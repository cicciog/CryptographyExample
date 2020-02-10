package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.security.PublicKey;

public class EncryptAlgorithm {
    private Cipher cipher = null;
    final String algorithm = "RSA/ECB/PKCS1Padding";
    private PublicKey publicKey;
    byte[] input;

    /*
     *
     *  Constructor @pPublicKey, @message
     *
     */
    public EncryptAlgorithm(PublicKey pPublicKey, String message)throws Exception{
        //Creating a Cipher object
        cipher = Cipher.getInstance(algorithm);

        //retrieve public key
        publicKey = pPublicKey;

        //get input message
        input = message.getBytes();

    }

    //Encrypt Data
    public byte[] doEncryptedData() throws Exception{
        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        cipher.update(input);
        //encrypting the data
        byte[] cipherText = cipher.doFinal();

        return cipherText;
    }

}
