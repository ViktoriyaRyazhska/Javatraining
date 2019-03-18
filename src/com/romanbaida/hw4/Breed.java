package com.romanbaida.hw4;

public enum Breed {

  AKITA("Akita"),
  BOXER("Boxer"),
  ROTTWEILER("Rottweiler"),
  ST_BERNARD("St. Bernard");

  private String description;

  Breed(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return description;
  }

}
