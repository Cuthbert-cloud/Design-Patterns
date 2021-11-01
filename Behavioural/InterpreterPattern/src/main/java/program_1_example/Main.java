package program_1_example;

public class Main {

  public static void main(String[] args) {
    String context = "boolean";
    FirstLetterNotUnderscore firstLetterNotUnderscore = new FirstLetterNotUnderscore();
    context = firstLetterNotUnderscore.interpret(context);
    System.out.println(context);
  }
}