package javabasic;

public class StringToChar {
    String str = "Testing is fun";
    public static void main(String[] args) {
        StringToChar stringToChar = new StringToChar();
        stringToChar.StrToChar();
    }

    public void StrToChar(){
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        char c=str.charAt(7);
        //System.out.println(c);
        //String bi = new String(byte);
        String a = "abc";
        String b = "bc";
        String b1= new String("abc");
        b="abc";
        System.out.println("result");
        System.out.println(a==b);
    }
}
