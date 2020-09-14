public class Main {
  public static void main(final String[] args){
    System.out.println("Main working!");
    pluralize("dog", 2);
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
}