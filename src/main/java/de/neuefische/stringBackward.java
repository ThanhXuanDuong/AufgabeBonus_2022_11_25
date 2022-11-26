package de.neuefische;

public class stringBackward {
    public static String flipString(String someString){
        char[] chars = someString.toCharArray();
        for (int i=0; i<chars.length/2;i++){
            char aChar = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = aChar;
        }
        return String.valueOf(chars);
    }
}
