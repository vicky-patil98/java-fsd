package com.assistedpract.practice1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10 {
   public static void main(String[] args) {
      // Method 1: one-liner matches()
      boolean isMatched1 = Pattern.matches("\\d{5}", "12345");
      System.out.println(isMatched1);

      // Method 2: compile(), matcher() and matches()
      Pattern p = Pattern.compile("\\d{5}");
      Matcher m = p.matcher("1234");
      boolean isMatched2 = m.matches();
      System.out.println(isMatched2);
      // or
      boolean isMatched3 = Pattern.compile("\\d{5}").matcher("99999").matches();
      System.out.println(isMatched3);
   }
}
