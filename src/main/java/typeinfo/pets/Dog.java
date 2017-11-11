//: typeinfo/pets/Dog.java
package typeinfo.pets;

import java.io.Serializable;

public class Dog extends Pet implements Serializable {
  public Dog(String name) { super(name); }
  public Dog() { super(); }
} ///:~
