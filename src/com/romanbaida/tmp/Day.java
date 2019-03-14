package com.romanbaida.tmp;

public enum Day {
  SUNDAY(0, "Sunday", "Неділя"),
  MONDAY(1, "Monday", "Понеділок"),
  TUESDAY(2, "Tuesday", "Вівторок"),
  WEDNESDAY(3, "Wednesday", "Середа"),
  THURSDAY(4, "Thursday", "Четвер"),
  FRIDAY(5, "Friday", "П'ятниця"),
  SATURDAY(6, "Saturday", "Субота");
  
  private int dayNumber;
  private String en;
  private String ua;

  Day(int dayNumber, String en, String ua) {
    this.dayNumber = dayNumber;
    this.en = en;
    this.ua = ua;
  }

  @Override
  public String toString() {
    return en + " -> " + ua;
  }

  public static Day getDayByDayNumber(int dayNumber) {
    for (Day day : Day.values()) {
      if (day.dayNumber == dayNumber) {
        return day;
      }
    }

    return null;
  }

}
