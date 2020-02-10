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
        DecryptAlgorithm decryptAlgorithm = null;

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

        encryptAlgorithm = new EncryptAlgorithm(publickey,"Hey there, how are you?");
        String ciphertext = new String(encryptAlgorithm.doEncryptedData(),"UTF-8");
        System.out.println(ciphertext);



        /*********************************************************
         *                   Decryption                          *
         *********************************************************/
        System.out.println("*********** DENCRYPTION ***********");

        decryptAlgorithm = new DecryptAlgorithm(privatekey,ciphertext);
        System.out.println(decryptAlgorithm.doDecryptedData());

    }
}
