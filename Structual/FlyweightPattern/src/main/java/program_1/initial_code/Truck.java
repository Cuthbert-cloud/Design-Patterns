package program_1.initial_code;

public class Truck implements Vehicle {

  private int[] location = new int[2];

  public String getType() {
    return "program_1.initial_code.Truck";
  }

  public void setLocation(int latitude, int longitude) {
    location[0] = latitude;
    location[1] = longitude;
  }

  public int[] getLocation() {
    return location;
  }
}
