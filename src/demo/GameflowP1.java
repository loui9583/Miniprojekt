package demo;

import java.util.Scanner;

public class GameflowP1 {

  public static void gameflowP1() {
    Terning terning = new Terning();
    Scanner scanner = new Scanner(System.in);


    terning.roll();
    System.out.println("SPILLER 1's TUR! Tryk A for at ANGRIBE. Tryk F for at rykke FREM. Tryk T for at rykke TILBAGE");
    char input = scanner.nextLine().charAt(0);
    if (input == 'A') {
      System.out.println("ANGREB!");
      switch (terning.getDots()) {
        case 1:
          Træk.firepower1 = Træk.firepower1 - 100;
          System.out.println("Du brugte 100 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
          break;
        case 2:
          Træk.firepower1 = Træk.firepower1 - 200;
          System.out.println("Du brugte 200 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
          break;
        case 3:
          Træk.firepower1 = Træk.firepower1 - 300;
          System.out.println("Du brugte 200 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
          break;
        case 4:
          Træk.firepower1 = Træk.firepower1 - 400;
          System.out.println("Du brugte 200 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
          break;
        case 5:
          Træk.firepower1 = Træk.firepower1 - 500;
          System.out.println("Du brugte 200 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
          break;
        case 6:
          Træk.firepower1 = Træk.firepower1 - 600;
          System.out.println("Du brugte 200 firepower! Du har nu " + Træk.firepower1 + " tilbage!");
      }
      switch (Math.abs(Træk.position1 - Træk.position2)) {
        case 0:
          System.out.println("Du dræbte 6 soldater!");
          Træk.soliders2 = Træk.soliders2 - 6;
          break;
        case 1:
          System.out.println("Du dræbte 5 soldater!");
          Træk.soliders2 = Træk.soliders2 - 5;
          break;
        case 2:
          System.out.println("Du dræbte 4 soldater!");
          Træk.soliders2 = Træk.soliders2 - 4;
          break;
        case 3:
          System.out.println("Du dræbte 3 soldater!");
          Træk.soliders2 = Træk.soliders2 - 3;
          break;
        case 4:
          System.out.println("Du dræbte 2 soldater!");
          Træk.soliders2 = Træk.soliders2 - 2;
          break;
        case 5:
          System.out.println("Du dræbte 1 soldater!");
          Træk.soliders2 = Træk.soliders2 - 1;
          break;
        default:
          System.out.println("For stor afstand til fjendens soldater. Du dræbte 0 soldater");
          break;
      }
      System.out.println("Computeren har nu "+Træk.soliders2+" soldater tilbage.");
    }

    if (input == 'F') {

      System.out.println("DU RYKKEDE FREM");
      switch (terning.getDots()) {
        case 1:
          System.out.println("Du rykkede 1 felt frem");
          Træk.position1 = Træk.position1 + 1;
          break;
        case 2:
          System.out.println("Du rykkede 2 felter frem");
          Træk.position1 = Træk.position1 + 2;
          break;
        case 3:
          System.out.println("Du rykkede 1 felt frem");
          Træk.position1 = Træk.position1 + 1;
          break;
        case 4:
          System.out.println("Du rykkede 2 felter frem");
          Træk.position1 = Træk.position1 + 2;
          break;
        case 5:
          System.out.println("Du rykkede 1 felt frem");
          Træk.position1 = Træk.position1 + 1;
          break;
        case 6:
          System.out.println("Du rykkede 2 felter frem");
          Træk.position1 = Træk.position1 + 2;
          break;

      }

    }

    if (input == 'T') {
      System.out.println("TILBAGETRÆKNING!");
      Træk.firepower1=Træk.firepower1+250;
      if (Træk.firepower1>2500) Træk.firepower1=2500;
      switch (terning.getDots()) {
        case 1:
          System.out.println("Du rykkede 1 felt tilbage");
          if (Træk.position1 > 0) Træk.position1 = Træk.position1 - 1;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 2:
          System.out.println("Du rykkede 1 felt tilbage");
          if (Træk.position1 > 0) Træk.position1 = Træk.position1 - 1;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 3:
          System.out.println("Du rykkede 2 felter tilbage");
          if (Træk.position1 > 1) Træk.position1 = Træk.position1 - 2;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 4:
          System.out.println("Du rykkede 2 felter tilbage");
          if (Træk.position1 > 1) Træk.position1 = Træk.position1 - 2;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 5:
          System.out.println("Du rykkede 3 felter tilbage");
          if (Træk.position1 > 2) Træk.position1 = Træk.position1 - 3;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");
          break;
        case 6:
          System.out.println("Du rykkede 3 felter tilbage");
          if (Træk.position1 > 2) Træk.position1 = Træk.position1 - 3;
          else System.out.println("Du kan ikke rykke ud af banen. Bliv hvor du er!");

          break;
      }
      System.out.println("Ekstra firepower ved tilbagetrækning! Du har nu : "+Træk.firepower1+"     (maks 2500)");
    }

  }

}
