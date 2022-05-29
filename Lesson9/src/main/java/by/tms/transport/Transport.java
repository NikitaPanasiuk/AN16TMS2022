package by.tms.transport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Transport {
   private int power;
   private int maxSpeed;
   private int mass;
   private String model;
}
