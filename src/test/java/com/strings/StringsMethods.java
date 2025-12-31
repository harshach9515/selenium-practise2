package com.strings;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringsMethods {
    public static void main(String[] args) {

        //Length
        String name="Vamsi";
        System.out.println(name.length());

        //toLowerCase
        String word="VAMSI";
        System.out.println(word.toLowerCase());

        //toUpperCase
        String letter="vamsi";
        System.out.println(letter.toUpperCase());

        //chatAt
        String names="Vamsi";
        System.out.println(names.charAt(2));

        //equals
        String st="Vamsi";
        String st1="Vamsi";
        System.out.println(st.equals(st1));

        //equalsignore
        String a="vamsi";
        String b="vamsi";
        System.out.println(a.equalsIgnoreCase(b));

        //contains
        String sentence = "I love Vamsi";
        System.out.println(sentence.contains("Vamsi"));

        //replace
        String text = "I am Vamsi";
        System.out.println(text.replace("Vamsi", "Harsha"));


    }
}
