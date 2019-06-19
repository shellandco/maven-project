package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   *
   */

  private static final String MY_NAME_IS_NICO_H_HELLO_S = "My Name is NicoH. Hello, %s!";

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone my name
   * @return greeting string nicoh
   */
  public final String greet(final String someone) {
    return String.format(MY_NAME_IS_NICO_H_HELLO_S, someone);
  }
}
