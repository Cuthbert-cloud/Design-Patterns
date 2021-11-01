package program_2.challenge;

public class Main {

  public static void main(String[] args) {
    String context = "this is a a sentence";
    System.out.println(context);
    FirstLetterLowerCase firstLetterLowerCase = new FirstLetterLowerCase();
    context = firstLetterLowerCase.interpret(context);
    System.out.println(context);
  }
}