package SymmetricKeyEncryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class DecryptAlgorithm {
    private SecretKey secretKey;
    private byte[] plainText;
    private Cipher cipher;


    public byte[] getPlainText() {
        //show plain text
        return plainText;
    }

    private void setPlainText(byte[] plainText) {
        //set plain text
        this.plainText = plainText;
    }

    public DecryptAlgorithm()throws Exception{
        this.cipher = Cipher.getInstance("DESede");
    }

    public byte[] Decrypt(byte[] pCipherText, SecretKey pSecretKey)throws Exception{
        //Decrypt cipher text
        this.cipher.init(Cipher.DECRYPT_MODE,pSecretKey);
        this.setPlainText(this.cipher.doFinal(pCipherText));

        //obtain plain text after decryption
        return getPlainText();
    }

    public Boolean compareTwoMessage(String pMessage1, String pMessage2){
        if(pMessage1.equals(pMessage2)){
            return true;
        }else{
            return false;
        }
    }
}
