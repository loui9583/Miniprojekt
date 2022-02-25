package demo;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    GameflowP1 gameflowp1 = new GameflowP1();
    GameflowP2 gameflowp2 = new GameflowP2();
    boolean spilletkører = true;

    while (spilletkører == true) {
      GameflowP1.gameflowP1();
      System.out.println("\n");
      GameflowP2.gameflowP2();
      System.out.println("\n\nDin position er nu: " + Træk.position1 + "\nComputerens position er nu: " + Træk.position2);
      System.out.println("\n");
      switch (Træk.position1){
        case 21:
          System.out.println("BOOOM! Du spræng en bombe i fjendens base. DU VANDT!");
          spilletkører=false;
        case 22:
          System.out.println("BOOOM! Du spræng en bombe i fjendens base. DU VANDT!");
          spilletkører=false;
        default:
      }
      switch (Træk.position2){
        case 0:
          System.out.println("BOOOM! Computeren sprang en bombe i din base. DU VANDT!");
          spilletkører=false;
        case -1:
          System.out.println("BOOOM! Computeren sprang en bombe i din base. COMPUTEREN VANDT!");
          spilletkører=false;
        default:
      }
      if (Træk.soliders1<1)  {
        System.out.println("COMPUTEREN DRÆBTE ALLE DINE SOLDATER! COMPUTEREN VANDT!");
        spilletkører=false;
      }
      if (Træk.soliders2<1)  {
        System.out.println("DU DRÆBTE ALLE COMPUTERENS SOLDATER! DU VANDT!");
        spilletkører=false;
      }


    }
  }
}
