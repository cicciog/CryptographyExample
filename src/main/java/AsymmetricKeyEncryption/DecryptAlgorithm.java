package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.security.PrivateKey;

public class DecryptAlgorithm {
    Cipher cipher;
    final String algorithm = "RSA/ECB/PKCS1Padding";
    PrivateKey receiverPrivateKey;
    byte[] message;

    //Construct
    public DecryptAlgorithm(PrivateKey pReceiverPrivateKey){
        try{
            cipher = Cipher.getInstance(algorithm);
            //Initializing a Cipher object
            cipher.init(Cipher.ENCRYPT_MODE, pReceiverPrivateKey);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    //Dencrypt Data
    public byte[] getDecryptedData(byte[] pCiphertext){
        byte[] plaintext = null;
        //compute cipherText
        if(pCiphertext != null){
            try{
               plaintext = cipher.doFinal();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return plaintext;
        }else{
            throw new NullPointerException();
        }
    }
}
