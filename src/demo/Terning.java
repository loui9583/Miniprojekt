package demo;

import java.util.Random;

class Terning {
  int dots, roll;
  Random number = new Random();

  public Terning() {
    dots = number.nextInt(6) + 1;
  }

  public void roll() {
    roll = number.nextInt(dots) + 1;
  }

  public int getDots() {
    System.out.println("Der blev slået: " + roll);
    return roll;
  }


}




