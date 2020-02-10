package MessageAuthenticationCode;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Kgen {

    private KeyGenerator keyGenerator;
    private SecureRandom secureRandom;
    private Key key;

    public Kgen() throws Exception {

        //Creating a KeyGenerator object
        keyGenerator = KeyGenerator.getInstance("DESede");
        //Creating a SecureRandom object
        secureRandom = new SecureRandom();
        //Initializing the KeyGenerator
        keyGenerator.init(secureRandom);
    }

    public Key generatesKey(){
        key = keyGenerator.generateKey();
        return key;
    }


}
