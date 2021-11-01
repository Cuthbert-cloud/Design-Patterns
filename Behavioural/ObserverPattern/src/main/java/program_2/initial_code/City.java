package program_2.initial_code;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

  private String trafficUpdate = "";
  private PropertyChangeSupport support = new PropertyChangeSupport(this);

  public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
    support.addPropertyChangeListener(propertyChangeListener);
  }

  public void updateTraffic(String trafficUpdate) {
    support.firePropertyChange("trafficUpdate", this.support, trafficUpdate);
    this.trafficUpdate = trafficUpdate;
  }
}