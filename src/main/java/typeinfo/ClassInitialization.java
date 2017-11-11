package typeinfo;
//: typeinfo/ClassInitialization.java
import java.util.*;

class Initable {
  static final int staticFinal  = 47;
  static final int staticFinal2 =  ClassInitialization.rand.nextInt(1000);
  static {System.out.println("Initializing Initable");}
}

class Initable2 {
  static int staticNonFinal = 147;
  static { System.out.println("Initializing Initable2"); }
}

class Initable3 {
  static int staticNonFinal = 74;
  static { System.out.println("Initializing Initable3"); }
}
/*
 * 类的初始化：如果一个static final 值是编译器常量，那么这个值不需要对类初始化就可以读取，
 * 但是Initable.staticFinal2的访问将强制进行类初始化，因为他不是一个编译器常量。
 * 如果一个static域不是final的，那么在对它访问时，总是要求在它被读取之前，要先进行链接（为这个域分配存储空间）和初始化（初始化该存储空间）。
 */
public class ClassInitialization {
  public static Random rand = new Random(47);
  public static void main(String[] args) throws Exception {
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    // Does not trigger initialization:
    System.out.println(Initable.staticFinal);
    // Does trigger initialization:
    System.out.println(Initable.staticFinal2);
    // Does trigger initialization:
    System.out.println(Initable2.staticNonFinal);
    //Class initable3 = Class.forName("Initable3");
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFinal);
  }
} /* Output:
After creating Initable ref
47
Initializing Initable
258
Initializing Initable2
147
Initializing Initable3
After creating Initable3 ref
74
*///:~
