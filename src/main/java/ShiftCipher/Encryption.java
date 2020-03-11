package ShiftCipher;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    private Alphabet alphabet;
    private int key;
    private String plainText;
    private String cipherText;

    //Constructor
    public Encryption(int pKey, String pPlainText) {
       this.alphabet = new Alphabet();
       this.key = pKey;
       this.plainText = pPlainText;
    }

    //the character position in a string shift right of a fixed value called index
    private char shiftAlphabetsletter(int index){
        //System.out.println("value: "+((index+key)%26));
        return alphabet.getCharacterAt(((index+key)%26));
    }

    //get the ciphertext by the plaintext
    public String encryptionAlgorithm(){
        List encryptingString = new ArrayList();
        //System.out.println(this.plainText.charAt(1)+" "+this.plainText.toCharArray().length);

        //Shift plaintext to a shifted sting with the key
        for(int i = 0; i < this.plainText.length(); i++){
            encryptingString.add(this.shiftAlphabetsletter(this.alphabet.getIndexByCharacter(this.plainText.charAt(i))));
        }

        this.cipherText = createStringFromArray(encryptingString);
        return cipherText;
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
