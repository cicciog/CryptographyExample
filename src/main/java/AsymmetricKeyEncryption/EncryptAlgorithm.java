package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.security.PublicKey;

public class EncryptAlgorithm {
    private PublicKey publickey;
    private Cipher cipher;

    /*
     *
     *  Constructor @pPublicKey, @message
     *
     */
    public EncryptAlgorithm(PublicKey pPublicKey, Cipher pChiper)throws Exception{
        //Getting the public key from the key pair
        this.publickey = pPublicKey;

        //Creating a Cipher object
        this.cipher = pChiper;

        //Initializing a Cipher object
        this.cipher.init(Cipher.ENCRYPT_MODE,this.publickey);
    }

    //Encrypt Data by bytes array
    public byte[] doEncryptedDataByBytesArray(byte[] input) throws Exception{
        //Add data to the cipher
        cipher.update(input);

        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        //System.out.println( new String(cipherText, "UTF8"));
        return cipherText;

    }

    //Encrypt Data by string
    public byte[] doEncryptedDataByString(String data) throws Exception{
        //Add data to the cipher
        byte[] input = data.getBytes();
        cipher.update(input);

        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        //System.out.println( new String(cipherText, "UTF8"));
        return cipherText;
    }

}
