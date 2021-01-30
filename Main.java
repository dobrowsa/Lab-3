import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.print.attribute.standard.NumberUpSupported;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to count down or up from");

    int number = s.nextInt();
    int countdown;
    int countup;

    if (number >= 0){
    for (countdown = number; countdown>=0; countdown--) {
      System.out.println(countdown);
      if (countdown == 0){
        System.out.println("Blast Off!");
      }
    }
    }
    if (number <= 0){
    for (countup = number; countup <= 0; countup++){
      System.out.println(countup);
    if (countup == 0){
      System.out.println("Blast Off!");
      }
      }
    }
    }
  }

