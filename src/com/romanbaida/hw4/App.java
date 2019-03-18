package com.romanbaida.hw4;

import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
  }

  public static void first() {
    // call .useLocale to enable dot in numbers with decimal part
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    boolean belongToRange = true;
    String result;

    for (int i = 0; i < 3; i++) {
      System.out.print("Input number #" + (i + 1) + ": ");
      double number = scanner.nextDouble();

      if (belongToRange && !(number >= -5 && number <= 5)) {
        belongToRange = false;
      }
    }

    result = belongToRange ?
      "All numbers belong to range [-5,5]" :
      "Not all numbers belong to range [-5,5]";

    System.out.println(result);
  }

  public static void second() {
    Scanner scanner = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 3; i++) {
      System.out.print("Input number #" + (i + 1) + ": ");
      int number = scanner.nextInt();

      if (number > max) {
        max = number;
      }

      if (number < min) {
        min = number;
      }
    }

    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
  }

  public static void third() {
    System.out.println(HTTPError.getErrorByCode(401));
  }

  public static void fourth() {
    Dog[] dogs = {
      new Dog("name1", 5, Breed.AKITA),
      new Dog("name1", 6, Breed.BOXER),
      new Dog("name3", 7, Breed.ST_BERNARD)
    };
    Dog oldestDog = dogs[0];

    for (Dog dog : dogs) {
      if (dog.getAge() > oldestDog.getAge()) {
        oldestDog = dog;
      }
    }

    System.out.println(oldestDog);
  }

}
