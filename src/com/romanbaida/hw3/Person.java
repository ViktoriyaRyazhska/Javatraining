package com.romanbaida.hw3;

import java.time.Year;
import java.util.Scanner;

public class Person {

  private String name;
  private int birthYear;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public Person() {
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  @Override
  public String toString() {
    return name + " is " + age() + " years old";
  }

  public int age() {
    return Year.now().getValue() - birthYear;
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input person name: ");
    name = scanner.nextLine();
    System.out.print("Input person birth year: ");
    birthYear = scanner.nextInt();
  }

  public void output() {
    System.out.println(toString());
  }

  public void changeName(String name) {
    setName(name);
  }

}
