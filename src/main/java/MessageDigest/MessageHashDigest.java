package MessageDigest;


import  java.security.*;

public class MessageHashDigest {
    private MessageDigest md;
    private byte[] digest;


    public MessageHashDigest(String pName)throws Exception{
        this.md = MessageDigest.getInstance(pName);
    }

    public byte[] computeDigest(){
        //Compute the message digest
        this.digest = this.md.digest();
        return digest;
    }


    public void updateMessageDigest(String pMessage){
        //Passing data to the created MessageDigest Object
        this.md.update(pMessage.getBytes());
    }

    public StringBuffer convertByteArraytoHexStringFormat(){
        //Converting the byte array in to HexString format
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        return hexString;
    }

}