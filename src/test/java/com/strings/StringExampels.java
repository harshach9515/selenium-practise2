package com.strings;



public class StringExampels {
    public static void main(String[] args) {

        String str  = "Harsha";
        String str1 = "Harsha vardhan Reddy";

//        System.out.println(str);
//        System.out.println(str1);
//
//        System.out.println(str.equalsIgnoreCase(str1));
//
//        System.out.println(str1.contains(str));
//
//        System.out.println(str.length());
//
//        String st = "VAMSHI";
//        System.out.println(st.toLowerCase());
//
//        String st1 = "vamshi";
//        System.out.println(st1.toUpperCase());

        char ch = 's';

        //Replace character in string
        String st = "VAMSHI";
        String st1 = st.replace('V', 'B');
        System.out.println(st1);

        // Remove leading and trailing spaces
        String str2 = "   Harsha Vardhan Reddy    ";
        System.out.println(str2.trim());

        System.out.println(st.charAt(2));
        System.out.println(st.concat(" Reddy"));










    }
}
