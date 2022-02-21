/**
 * Encrypt AES simple
 * 
 * ECB (Electronic Codebook) is essentially the first generation of the AES.
 * It is the most basic form of block cipher encryption.
 */
package com.minte9.io.encrypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptApp {
    public static void main(String[] args) {

        String key = "YXZyYHNaWA=";
        String plainText = "mypassword";

        String encrypted = AES.encrypt(plainText, key);
        String decrypted = AES.decrypt(encrypted, key);

        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}

class AES {

    public static String encrypt(String plainText, String key) {

        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, getKey(key));

            return Base64.getEncoder().encodeToString(
                    cipher.doFinal(plainText.getBytes("UTF-8")));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String encryptedText, String key) {
        
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, getKey(key));

            return new String(cipher.doFinal(
                Base64.getDecoder().decode(encryptedText)
            ));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SecretKeySpec getKey(String myKey) {

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] key;

            key = myKey.getBytes("UTF-8");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);

            return new SecretKeySpec(key, "AES");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}