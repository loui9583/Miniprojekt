package demo;

import java.util.Random;
import java.util.Scanner;

public class GameflowP2 {

  public static void gameflowP2() {
    Terning terning = new Terning();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String chars = "AFT";

    terning.roll();
    System.out.println("COMPUTERS TUR: ");
    char input = chars.charAt(random.nextInt(chars.length()));
    System.out.println(input);
    if (input == 'A') {
      System.out.println("ANGREB!");
      switch (terning.getDots()) {
        case 1:
          Træk.firepower2 = Træk.firepower2 - 100;
          System.out.println("Computeren brugte 100 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
          break;
        case 2:
          Træk.firepower2 = Træk.firepower2 - 200;
          System.out.println("Computeren brugte 200 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
          break;
        case 3:
          Træk.firepower2 = Træk.firepower2 - 300;
          System.out.println("Computeren brugte 200 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
          break;
        case 4:
          Træk.firepower2 = Træk.firepower2 - 400;
          System.out.println("Computeren brugte 200 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
          break;
        case 5:
          Træk.firepower2 = Træk.firepower2 - 500;
          System.out.println("Computeren brugte 200 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
          break;
        case 6:
          Træk.firepower2 = Træk.firepower2 - 600;
          System.out.println("Computeren brugte 200 firepower! Computeren har nu " + Træk.firepower2 + " tilbage!");
      }
      switch (Math.abs(Træk.position1 - Træk.position2)) {
        case 0:
          System.out.println("Computeren dræbte 6 soldater!");
          Træk.soliders1 = Træk.soliders1 - 6;
          break;
        case 1:
          System.out.println("Computeren dræbte 5 soldater!");
          Træk.soliders1 = Træk.soliders1 - 5;
          break;
        case 2:
          System.out.println("Computeren dræbte 4 soldater!");
          Træk.soliders1 = Træk.soliders1 - 4;
          break;
        case 3:
          System.out.println("Computeren dræbte 3 soldater!");
          Træk.soliders1 = Træk.soliders1 - 3;
          break;
        case 4:
          System.out.println("Computeren dræbte 2 soldater!");
          Træk.soliders1 = Træk.soliders1 - 2;
          break;
        case 5:
          System.out.println("Computeren dræbte 1 soldater!");
          Træk.soliders1 = Træk.soliders1 - 1;
          break;
        default:
          System.out.println("For stor afstand til fjendens soldater. Computeren dræbte 0 soldater");
          break;
      }
      System.out.println("Du har nu "+Træk.soliders1+" soldater tilbage.");
    }

    if (input == 'F') {

      System.out.println("COMPUTEREN RYKKEDE FREM");
      switch (terning.getDots()) {
        case 1:
          System.out.println("Computeren rykkede 1 felt frem");
          Træk.position2 = Træk.position2 - 1;
          break;
        case 2:
          System.out.println("Computeren rykkede 2 felter frem");
          Træk.position2 = Træk.position2 - 2;
          break;
        case 3:
          System.out.println("Computeren rykkede 1 felt frem");
          Træk.position2 = Træk.position2 - 1;
          break;
        case 4:
          System.out.println("Computeren rykkede 2 felter frem");
          Træk.position2 = Træk.position2 - 2;
          break;
        case 5:
          System.out.println("Computeren rykkede 1 felt frem");
          Træk.position2 = Træk.position2 - 1;
          break;
        case 6:
          System.out.println("Computeren rykkede 2 felter frem");
          Træk.position2 = Træk.position2 - 2;
          break;

      }
    }

    if (input == 'T') {
      System.out.println("TILBAGETRÆKNING!");
      Træk.firepower2=Træk.firepower2+250;
      if (Træk.firepower2>2500) Træk.firepower2=2500;
      switch (terning.getDots()) {
        case 1:
          System.out.println("Computeren rykkede 1 felt tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 1;
          else System.out.println("Computer, du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 2:
          System.out.println("Computeren rykkede 1 felt tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 1;
          else System.out.println("Computer, du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 3:
          System.out.println("Computeren rykkede 2 felter tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 2;
          else System.out.println("Computer, du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 4:
          System.out.println("Computeren rykkede 2 felter tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 2;
          else System.out.println("Computer, Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 5:
          System.out.println("Computeren rykkede 3 felter tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 3;
          else System.out.println("Computer,du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 6:
          System.out.println("Computeren rykkede 3 felter tilbage");
          if (Træk.position2 < 20) Træk.position2 = Træk.position2 + 3;
          else System.out.println("Computer. du kan ikke rykke ud af banen. Bliv hvor du er!");

          break;
      }
      System.out.println("Ekstra firepower ved tilbagetrækning! Computeren har nu : "+Træk.firepower2+"     (maks 2500)");
    }



  }

}
