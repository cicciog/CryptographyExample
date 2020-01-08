package MessageDigest;

import java.util.Scanner;

public class MessageDigestTest {
    public static void main(String args[])throws Exception {
        //Reading data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");
        String message = sc.nextLine();

        //Creating the MessageDigest object
        MessageHashDigest mhd = new MessageHashDigest("SHA-256");

        //Passing data to the created MessageDigest Object
        mhd.updateMessageDigest(message);

        //Compute the message digest
        byte[] digest = mhd.computeDigest();
        System.out.println(digest);

        //Converting the byte array in to HexString format
        System.out.println("Hex format : " + mhd.convertByteArraytoHexStringFormat().toString());
    }
}