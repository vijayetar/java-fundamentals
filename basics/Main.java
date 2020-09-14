import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(final String[] args){
    System.out.println("Main working!");
    // pluralize("dog", 2);
    // flipHeads(2);
    clock();
  }
  // function pluralize that will make a word plural if it is 0 or greater than 1
  public static void pluralize(final String word, final int num) {
    if (num < 0) {
      System.out.println ("Please enter 0 or number greater than 0");
      return;
    } else {
      String statement;
      statement = num ==1? word:word + "s";
      System.out.println("I owe "+ num + " "+ statement +".");
    } 
  }
  public static void flipHeads(int n){
    System.out.println(n);
    int counter = 0;
    int headCount = 0;
    while (headCount != n) {
      float x = (float) (Math.random());
      if (x>0.5){
        counter ++;
        headCount++;
        System.out.println("Head");
      } else {
        counter ++;
        headCount = 0;
        System.out.println("Tail");
      }
    }
    String word = n==1? "head":"heads";
    String flip = counter==1? "flip":"flips";
    System.out.println("It took " + counter + " " + flip + " to flip "+ headCount + " " + word + " in a row.");
  }
  public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    System.out.println("this is the time: " + time);
    int i = 0;
    int second = now.getSecond();
    while (true){
      now = LocalDateTime.now();
      if (second != now.getSecond()){
        time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("this is the time: " + time);
        second=now.getSecond();
      }
    }
  }
}