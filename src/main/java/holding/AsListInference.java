package holding;
//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
    List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
    List<Snow> snow3 = new ArrayList<Snow>();   Collections.addAll(snow3, new Light(), new Heavy());
    List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    System.out.println(snow1);
    System.out.println(snow2);
    System.out.println(snow3);
    System.out.println(snow4);
  }
} ///:~
