package SymmetricKeyEncryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class EncryptAlgorithm {
    private SecretKey secretKey;
    private byte[] cipherText;
    private Cipher cipher;

    private byte[] getCipherText() {
        //show cipher text
        return cipherText;
    }

    private void setCipherText(byte[] cipherText) {
        // assign value to cipher text
        this.cipherText = cipherText;
    }

    public EncryptAlgorithm() throws Exception{
        this.cipher = Cipher.getInstance("DESede");
    }

    public byte[] encrypt(byte[] pPlainText, SecretKey pSecretKey)throws Exception{
        //encrypt plain text
        this.cipher.init(Cipher.ENCRYPT_MODE,pSecretKey);
        this.setCipherText(this.cipher.doFinal(pPlainText));

        //obtain cipher text after encryption
        return getCipherText();
    }

    public Boolean compareTwoMessage(String pMessage1, String pMessage2){
        if(pMessage1.equals(pMessage2)){
            return true;
        }else{
            return false;
        }
    }
}
