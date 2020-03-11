package ShiftCipher;

import java.util.Random;


public class Kgen {
    private static final int min = 0;
    private static final int max = 26;
    private int key;

    //get a random value in a min max range
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        int randomNumber = r.nextInt((max - min) + 1) + min;

        return randomNumber;
    }

    //get key generated
    public int getKey(){
        key = getRandomNumberInRange(min,max);
        return key;
    }
}
