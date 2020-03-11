package ShiftCipher;

public class Alphabet {
    private static final int sizeAlphabet = 26;
    private char letters [];

    //letters of the alphabet
    public Alphabet() {

        letters =  new char[sizeAlphabet];

        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';
        letters[3] = 'd';
        letters[4] = 'e';
        letters[5] = 'f';
        letters[6] = 'g';
        letters[7] = 'h';
        letters[8] = 'i';
        letters[9] = 'j';
        letters[10] = 'k';
        letters[11] = 'l';
        letters[12] = 'm';
        letters[13] = 'n';
        letters[14] = 'o';
        letters[15] = 'p';
        letters[16] = 'q';
        letters[17] = 'r';
        letters[18] = 's';
        letters[19] = 't';
        letters[20] = 'u';
        letters[21] = 'v';
        letters[22] = 'w';
        letters[23] = 'x';
        letters[24] = 'y';
        letters[25] = 'z';

    }

    //get a char at the index value position
    public char getCharacterAt(int index){
        return letters[index];
    }

    //get the position of a character in the array alphabet, if the charcater is not found return -1
    public int getIndexByCharacter(char pSearch){
        int counter = 0;
        for(char letter : letters) {
            if(letter == pSearch) {
                return counter;
            }
            counter++;
        }
        return -1;
    }
}
