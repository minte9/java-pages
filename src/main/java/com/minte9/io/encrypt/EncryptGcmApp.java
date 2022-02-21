/**
 * Encrypt AES GCM
 * 
 * The ECB can leak information about the plaintext.
 * 
 * GCM is proven secure in the concrete security model.
 * The use of shorter authentication tags with GCM is discouraged.
 */
package com.minte9.io.encrypt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptGcmApp {
    public static void main(String[] args) throws Exception {

        String key = "7+yiPzdGfziX86hAKLVPu1iM6CjHdsnuKNlguueUH8Y=";
        String plainText = "mypassword";
            //System.out.println(AES_GCM.getKey(256));

        byte[] iv = new byte[12];
        new SecureRandom().nextBytes(iv);

        String encrypted = AES_GCM.encrypt(plainText, key, iv);
        String decrypted = AES_GCM.decrypt(encrypted, key, iv);

        System.out.println(encrypted); // KElnr/KLZle16HwtmQ6vMFE2N/a1OmI3GlU=
        System.out.println(decrypted); // mypassword
    }
}

class AES_GCM {

    public static String encrypt(String plainText, String key, byte[] iv)
            throws Exception {
        
        SecretKey secretKey = AES_GCM.getSecretKey(key);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(
            Cipher.ENCRYPT_MODE, secretKey, new GCMParameterSpec(128, iv)
        );

        return Base64.getEncoder().encodeToString(
            cipher.doFinal(plainText.getBytes("UTF-8"))
        );
    }

    public static String decrypt(String encryptedText, String key, byte[] iv)
            throws Exception {
        
        SecretKey secretKey = AES_GCM.getSecretKey(key);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(
            Cipher.DECRYPT_MODE, secretKey, new GCMParameterSpec(128, iv)
        );

        return new String(cipher.doFinal(
            Base64.getDecoder().decode(encryptedText)
        ));
    }

    public static String getKey(int size)
            throws NoSuchAlgorithmException {

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

    public static SecretKey getSecretKey(String key) {

        byte[] decoded = Base64.getDecoder().decode(key);
        return new SecretKeySpec(decoded, 0, decoded.length, "AES");
    }

}