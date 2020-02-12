package MessageAuthenticationCode;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class VerifyAlgorithm {
    private String message;
    private Key key;
    private byte[] tag;

    public VerifyAlgorithm(String pMessage, Key pKey, byte[] pTag) {
        this.message = pMessage;
        this.key = pKey;
        this.tag = pTag;
    }

    public String checkTagValidity(byte[] pTag) throws NoSuchAlgorithmException, InvalidKeyException {

        MacAlgorithm macAlgorithm = new MacAlgorithm(this.key, this.message);
        byte[] computedTag = macAlgorithm.MacOperation();

        if (Arrays.equals(pTag,computedTag)){
            return "authentic";
        }else{
            return "not authentic";
        }

    }
}
