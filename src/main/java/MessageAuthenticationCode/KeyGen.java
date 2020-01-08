package MessageAuthenticationCode;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

public class KeyGen {
    private KeyGenerator keyGenerator;
    private SecureRandom secRandom;

    public KeyGen() throws Exception {
        //Creating a KeyGenerator object
        keyGenerator = KeyGenerator.getInstance("DES");

        //Creating a SecureRandom object
        secRandom = new SecureRandom();

        //Initializing the KeyGenerator
        keyGenerator.init(secRandom);
    }

    public Key getKey(){
        return keyGenerator.generateKey();
    }
}
