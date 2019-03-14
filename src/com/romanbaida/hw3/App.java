package com.romanbaida.hw3;

public class App {

  public static void main(String[] args) {
    Person p1 = new Person("Roman", 1997);
    Person p2 = new Person();

    p2.input();

    System.out.println(p1);
    System.out.println(p2);
  }

}
