package SymmetricKeyEncryption;

import javax.crypto.SecretKey;

public class SymmetricKeySchemeTest {
    public static void main(String args[])throws Exception {

        //Generate secret key
        Kgen keyGen = new Kgen();
        SecretKey key = keyGen.getKey();
        System.out.println("key: "+key);

        //Alice would like to send a message to Bob
        String plainText = "Hello Bob, how are you?";
        System.out.println("Plain Text: " + plainText);
        byte[] plainTextByte = plainText.getBytes("UTF8");

        //Alice oracle
        EncryptAlgorithm encAlgorithm = new EncryptAlgorithm();
        byte[] message = encAlgorithm.encrypt(plainTextByte,key);

        //Bob oracle
        DecryptAlgorithm decryptAlgorithm = new DecryptAlgorithm();
        byte[] messageReceived = decryptAlgorithm.Decrypt(message,key);
        String encodedMessage = new String(messageReceived);
        System.out.println("The message sent from Alice to Bob is: "+encodedMessage);

        System.out.println("The Alice's message is equal to the message received from Bob? "+
                                decryptAlgorithm.compareTwoMessage(plainText,encodedMessage));

    }
}