package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;

public class DecryptAlgorithm {
    private Cipher cipher;
    final String algorithm = "RSA/ECB/PKCS1Padding";
    private PrivateKey privatekey;
    private byte[] input;

    //Construct
    public DecryptAlgorithm(PrivateKey pPrivateKey, String ciphertext) throws Exception{

        //Creating a Cipher object
        cipher = Cipher.getInstance(algorithm);

        //retrieve public key
        privatekey = pPrivateKey;

        //get input message
        input = ciphertext.getBytes();

    }

    //Dencrypt Data
    public byte[] doDecryptedData() throws Exception{

        //Initializing a Cipher object
        cipher.init(Cipher.DECRYPT_MODE,privatekey);
        //dencrypting the data
        byte[] plainText = cipher.doFinal(input);
        String text = new String(plainText, StandardCharsets.UTF_8);
        return plainText;
    }
}
