package hw8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

  public static void main(String[] args) {
  }

  public static void first() {
    Scanner scanner = new Scanner(System.in);
    String[] words = scanner.nextLine().trim().split("\\s");
    String longestWord = words[0];

    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }

    System.out.println(String.format("Longest word is \"%s\" length of %d", longestWord, longestWord.length()));
    System.out.println(reverse(words[1]));
  }

  public static String reverse(String str) {
    char[] chars = str.toCharArray();
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      char tmp = chars[start];
      chars[start] = chars[end];
      chars[end] = tmp;
      start++;
      end--;
    }

    return String.valueOf(chars);
  }

  public static void second() {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine().trim();

    System.out.println(sentence.replaceAll("\\s+", " "));
  }

  public static void third() {
    Scanner scanner = new Scanner(System.in);
    String[] words = scanner.nextLine().trim().split("\\s+");
    Pattern p = Pattern.compile("\\$(0\\.\\d{1,2}|[1-9]\\d*(\\.\\d{1,2})?)");
    Matcher m;

    for (String word : words) {
      m = p.matcher(word);

      if (m.matches()) {
        System.out.println(word);
      }
    }
  }

}
