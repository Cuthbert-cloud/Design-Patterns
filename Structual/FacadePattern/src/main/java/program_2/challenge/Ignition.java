package program_2.challenge;

public class Ignition {

  private boolean isOn = false;

  public void turnOn() {
    System.out.println("Turning ignition on");
    isOn = true;
  }

  public void turnOff() {
    System.out.println("Turning ignition off");
    isOn = false;
  }
}
