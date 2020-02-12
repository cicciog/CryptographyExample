package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.security.PrivateKey;


public class DecryptAlgorithm {
    private PrivateKey privatekey;
    private Cipher cipher;

    //Construct
    public DecryptAlgorithm(PrivateKey pPrivateKey, Cipher pCipher) throws Exception{

        //retrieve private key
        this.privatekey = pPrivateKey;

        //Creating a Cipher object
        this.cipher = pCipher;

        //Initializing a Cipher object
        this.cipher.init(Cipher.DECRYPT_MODE,this.privatekey);


    }

    //Decrypt Data by bytes array
    public byte[] doDecryptedDataByBytesArray(byte[] input) throws Exception{
        //Add data to the cipher
        cipher.update(input);

        //encrypting the data
        byte[] plainText = cipher.doFinal();
        //System.out.println( new String(plainText, "UTF8"));
        return plainText;

    }

    //Encrypt Data by string
    public byte[] doDecryptedDataByString(String data) throws Exception{
        //Add data to the cipher
        byte[] input = data.getBytes();
        cipher.update(input);

        //encrypting the data
        byte[] plainText = cipher.doFinal();
        //System.out.println( new String(plainText, "UTF8"));
        return plainText;
    }


}
