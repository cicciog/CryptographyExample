package ShiftCipher;

import java.util.Scanner;

public class ShiftCipherTest {
    public static void main(String args[]) throws Exception {

        //create a key
        Kgen k = new Kgen();
        int key = k.getKey();

        //intsantiate the alphabet
        Alphabet alphabet = new Alphabet();

        //get input by line
        String input = new String();

        try {
            //create an input scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a message: ");
            input = scanner.nextLine();
            System.out.println("message: " + input);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        //Encrypt the input message
        System.out.println("\n\n"+"Key: "+key);
        Encryption enc = new Encryption(key,input);
        String ciphertext = enc.encryptionAlgorithm();
        System.out.println("Ciphertext: "+ciphertext+"\n\n");

        //Decrypt the ciphertext
        System.out.println("Key: "+key);
        Decryption dec = new Decryption(key,ciphertext);
        String plaintext = dec.dencryptionAlgorithm();
        System.out.println("Plaintext: "+plaintext);

    }
}
