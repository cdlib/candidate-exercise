package cdlib.exercise.accordions;

import java.util.Objects;

public class PianoAccordion {

  // the name of the manufacturer
  // our store carries only Pigini, Petosa, Giulietti, Weltmeister, and Victoria
  String make;

  // this is a value equal to 26, 34, 37, or 41
  Integer trebleKeys;

  // this is a value equal to 12, 24, 48, 60, 80, 96, or 120
  Integer bassKeys;

  Integer trebleReeds;

  // equal to "musette", "swing", "alpine", "concert", or "jazz"
  String tuning;

  // equal to one of "available", "out-of-stock", "on-order"
  String status;
  
  // these change all the time so we can't specify the set of possible values
  String model;
  
  public PianoAccordion() {
    
  }
  
  public PianoAccordion(String make, Integer trebleKeys, Integer bassKeys, Integer trebleReeds, String tuning, String status, String model) {
    this.make = make;
    this.trebleKeys = trebleKeys;
    this.bassKeys = bassKeys;
    this.trebleReeds = trebleReeds;
    this.tuning = tuning;
    this.status = status;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel() {
    this.model = model;
  }

  public Integer getTrebleKeys() {
    return trebleKeys;
  }

  public void setTrebleKeys(Integer trebleKeys) {
    this.trebleKeys = trebleKeys;
  }

  public Integer getBassKeys() {
    return bassKeys;
  }

  public void setBassKeys(Integer bassKeys) {
    this.bassKeys = bassKeys;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getTrebleReeds() {
    return trebleReeds;
  }

  public void setTrebleReeds(Integer trebleReeds) {
    this.trebleReeds = trebleReeds;
  }

  public String getTuning() {
    return tuning;
  }

  public void setTuning(String tuning) {
    this.tuning = tuning;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 61 * hash + Objects.hashCode(this.make);
    hash = 61 * hash + this.trebleKeys;
    hash = 61 * hash + this.bassKeys;
    hash = 61 * hash + this.trebleReeds;
    hash = 61 * hash + Objects.hashCode(this.tuning);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final PianoAccordion other = (PianoAccordion) obj;
    if (this.trebleKeys != other.trebleKeys) {
      return false;
    }
    if (this.bassKeys != other.bassKeys) {
      return false;
    }
    if (this.trebleReeds != other.trebleReeds) {
      return false;
    }
    if (!Objects.equals(this.make, other.make)) {
      return false;
    }
    if (!Objects.equals(this.tuning, other.tuning)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PianoAccordion{" + "make=" + make + ", trebleKeys=" + trebleKeys + ", bassKeys=" + bassKeys + ", trebleReeds=" + trebleReeds + ", tuning=" + tuning + '}';
  }

}
