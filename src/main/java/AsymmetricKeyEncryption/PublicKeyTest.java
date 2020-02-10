package AsymmetricKeyEncryption;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class PublicKeyTest {
    public static void main(String args[]) throws Exception {

        /*
         * kGEN
         *
         */
        Kgen kgen = null;
        PublicKey publickey = null;
        PrivateKey privatekey = null;
        EncryptAlgorithm encryptAlgorithm = null;

        try{
            kgen = new Kgen();
            //Getting the public key from the key pair
            publickey = kgen.getPublicKey();
            //Getting the private key from the key pair
            privatekey = kgen.getPrivateKey();
            System.out.println("public key: "+publickey+" , private key: "+privatekey);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*********************************************************
         *                   Encryption                          *
         *********************************************************/

        System.out.println("*********** ENCRYPTION ***********");

        encryptAlgorithm = new EncryptAlgorithm(publickey,"oggi sono in biblioteca");
        System.out.println( new String(encryptAlgorithm.doEncryptedData(), "UTF8"));



        /*********************************************************
         *                   Decryption                          *
         *********************************************************/
        System.out.println("*********** DENCRYPTION ***********");

        //Initializing the same cipher for decryption
        //cipher.init(Cipher.DECRYPT_MODE, privatekey);

        //Decrypting the text
        //byte[] decipheredText = cipher.doFinal(cipherText);
        //System.out.println(new String(decipheredText));

    }
}
