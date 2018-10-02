package java_;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-md5/problem
public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(s.getBytes());
        byte[] digest = md5.digest();
        String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(myHash);
    }
}
