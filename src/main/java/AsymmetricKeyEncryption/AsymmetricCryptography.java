import AsymmetricKeyEncryption.DecryptAlgorithm;
import AsymmetricKeyEncryption.EncryptAlgorithm;
import AsymmetricKeyEncryption.Kgen;

import javax.crypto.Cipher;
import java.security.Signature;

public class AsymmetricCryptography {

    public static void main(String[] args) throws Exception {
        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");

        /*********************************************************
         *                   Key Generator                       *
         *********************************************************/
        System.out.println("*********** KEYGENERATOR ***********\n\n");

        //Generate the pair of keys
        Kgen kgen = new Kgen();
        System.out.println("Private key:"+kgen.getPrivateKey());
        System.out.println("Public key: "+kgen.getPublicKey());



        /*********************************************************
         *                   Encryption                          *
         *********************************************************/
        System.out.println("*********** ENCRYPTION ***********\n\n");

        //Encrypting the data
        EncryptAlgorithm encryptAlgorithm = new EncryptAlgorithm(kgen.getPublicKey(),Cipher.getInstance("RSA/ECB/PKCS1Padding"));
        byte[] ciphertext1 = encryptAlgorithm.doEncryptedDataByString("Hello Bob, today is a wonderful day!");
        byte[] ciphertext2 = encryptAlgorithm.doEncryptedDataByBytesArray("Hello Bob, today is a wonderful day!".getBytes());
        System.out.println("Chipertext 1: ");
        System.out.println(new String(ciphertext1, "UTF-8"));
        System.out.println("Chipertext 2: ");
        System.out.println(new String(ciphertext2, "UTF8"));


        /*********************************************************
         *                   Decryption                          *
         *********************************************************/
        System.out.println("*********** DENCRYPTION ***********");

        //Decrypting the text
        DecryptAlgorithm decryptAlgorithm = new DecryptAlgorithm(kgen.getPrivateKey(),Cipher.getInstance("RSA/ECB/PKCS1Padding"));
        byte[] plaintext1 = decryptAlgorithm.doDecryptedDataByBytesArray(ciphertext1);
        System.out.println("Plaintext 1: "+ new String(plaintext1, "UTF8"));
        byte[] plaintext2 = decryptAlgorithm.doDecryptedDataByBytesArray(ciphertext2);
        System.out.println("Plaintext 2: "+ new String(plaintext2, "UTF8"));
    }
}