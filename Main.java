import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Setting Up Scanner to read User Input
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to count down or up from");

    //Setting up variables
    int number = s.nextInt();
    int countdown;
    int countup;

    //Countdown from a positive Input
    if (number >= 0){
    for (countdown = number; countdown>=0; countdown--) {
      System.out.println(countdown);
      if (countdown == 0){
        System.out.println("Blast Off!");
      }
    }
    }
    //Countup from a Negative Input
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

