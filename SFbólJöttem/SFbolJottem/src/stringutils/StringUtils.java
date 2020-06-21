/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringutils;

/**
 *
 * @author gabor
 */
public class StringUtils {
    
    public static String reverse(String source) {
        if (source == null) {
            return null;
        }
        String rev = new StringBuilder(source).reverse().toString();
        return rev;
    }
    
    public static String reverseWords(String source) {
        if (source == null) {
            return null;
        }
        String[] revArray = source.split(" ");
        String rev = "";
        for (int i = revArray.length - 1; i >= 0; i--) {
            rev += revArray[i] + " ";
        }
    return rev.substring(0, rev.lastIndexOf(" "));
    }
    
    public static boolean isValidEmail(String email) {
        return email != null && email.contains(".") && email.contains("@");
    }
    
    public static boolean isValidGmail(String email) {
        return email != null && email.endsWith("@gmail.com");
    }
    
    public static boolean isValidEmail(String email, String[] tlds) {
        if (email != null && tlds != null && email.contains(".")
                && email.contains("@")) {
            for (int i = 0; i < tlds.length; i++) {
                if (email.endsWith("." + tlds[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
