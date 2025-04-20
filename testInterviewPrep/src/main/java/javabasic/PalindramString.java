package javabasic;

public class PalindramString {
    String str ="abbaa";
    public static void main(String[] args) {
       // PalindramString ab = new PalindramString();
        System.out.println(ispalindrome("abba"));
    }

    public static boolean ispalindrome(String str){
        if(str==null)
            return false;
        StringBuilder strbuilder = new StringBuilder(str);
        strbuilder.reverse();
        return strbuilder.toString().equals(str);
    }

}
