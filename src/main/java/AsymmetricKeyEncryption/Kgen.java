package AsymmetricKeyEncryption;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Kgen {

    private KeyPairGenerator keyPairGen;
    //Keypair sk,pk
    private KeyPair pair;

    public Kgen() throws Exception{
        //Creating KeyPair generator object;
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        //Initializing the KeyPairGenerator, key size
        keyPairGen.initialize(2048);
        //Generate the pair of keys
        this.pair = keyPairGen.generateKeyPair();
    }

    //Getting the public key from the key pair
    public PublicKey getPublicKey(){
        return pair.getPublic();
    }
    //Getting the private key from the key pair
    public PrivateKey getPrivateKey(){
        return pair.getPrivate();
    }



}
