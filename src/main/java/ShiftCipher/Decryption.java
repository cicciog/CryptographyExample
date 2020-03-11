package ShiftCipher;

import java.util.ArrayList;
import java.util.List;

public class Decryption {
    private Alphabet alphabet;
    private int key;
    private String plainText;
    private String cipherText;

    //Constructor
    public Decryption(int pKey, String pCipherText) {
        this.alphabet = new Alphabet();
        this.key = pKey;
        this.cipherText = pCipherText;
    }

    //the character position in a string shift left of a fixed value called index
    private char shiftAlphabetsletter(int index){
        //System.out.println("value: "+((26-key+index)%26));
        return alphabet.getCharacterAt(((26-key+index)%26));
    }

    //get the plaintext by the ciphertext
    public String dencryptionAlgorithm(){
        List encryptingString = new ArrayList();
        //System.out.println(this.cipherText.charAt(1)+" "+this.cipherText.toCharArray().length);

        //Shift cipherntext to a shifted sting with the key
        for(int i = 0; i < this.cipherText.length(); i++){
            encryptingString.add(this.shiftAlphabetsletter(this.alphabet.getIndexByCharacter(this.cipherText.charAt(i))));
        }

        this.plainText = createStringFromArray(encryptingString);
        return plainText;
    }

    //create a string from an array list
    private String createStringFromArray(List pString){
        int length = pString.size();
        String stringConverted = new String();

        for(int i = 0; i < length; i++){
            stringConverted += String.valueOf(pString.get(i));
        }

        return stringConverted;
    }


}
