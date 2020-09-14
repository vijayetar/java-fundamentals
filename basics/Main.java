import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(final String[] args){
    System.out.println("Main working!");
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    flipHeads(2);
    clock();
  }
  // function pluralize that take in word and a count, and will return a plural word if it is 0 or greater than 1
  public static String pluralize(String word, int num) {
    if (num < 0) {
      return "Please enter 0 or number greater than 0";
    } else {
      String statement;
      statement = num ==1? word:word + "s";
      return statement;
    } 
  }
  //function that takes in a number and will flip coints heads multiple number of times until n number of heads will fall in a row. Function uses a random number generator as import
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
  //function to generate time every second until ^C is pressed, using imports import java.time.LocalDateTime and java.time.format.DateTimeFormatter
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