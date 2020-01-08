package SymmetricKeyEncryption;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Kgen {

    private KeyGenerator keyGenerator;
    private SecretKey secretKey;

    public Kgen() throws Exception {
        keyGenerator = KeyGenerator.getInstance("DESede");
        // key size must be equal to 112 or 168 for this provider
        keyGenerator.init(168);
    }

    public SecretKey getKey(){
        return secretKey = keyGenerator.generateKey();
    }

}
