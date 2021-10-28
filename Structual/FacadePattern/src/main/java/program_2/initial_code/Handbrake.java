package program_2.initial_code;

public class Handbrake {

  private boolean isUp = true;

  public void pushDown() {
    System.out.println("Pushing down handbrake");
    isUp = false;
  }

  public void liftUp() {
    System.out.println("Lifting up handbrake");
    isUp = true;
  }


}
