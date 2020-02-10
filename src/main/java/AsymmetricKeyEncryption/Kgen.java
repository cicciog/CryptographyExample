package AsymmetricKeyEncryption;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Kgen {
    private KeyPairGenerator keyPairGen;
    //Getting the public key from the key pair
    private PublicKey publicKey;
    //Getting the private key from the key pair
    private PrivateKey privateKey;
    //Keypair sk,pk
    private KeyPair pair;

    public Kgen() throws Exception{
        //Creating KeyPair generator object;
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        //Initializing the KeyPairGenerator, key size
        keyPairGen.initialize(2048);
        //Generate the pair of keys
        pair = keyPairGen.generateKeyPair();
    }

    public PublicKey getPublicKey(){
        publicKey = pair.getPublic();
        System.out.println("PubKey: "+publicKey);
        return publicKey;
    }

    public PrivateKey getPrivateKey(){
        privateKey = pair.getPrivate();
        System.out.println("PrivKey: "+privateKey);
        return privateKey;
    }


}
