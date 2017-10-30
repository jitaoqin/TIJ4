package reusing;
//: reusing/Car.java
// Composition with public objects.
/*
 * 尽管可以创建protected域，但是最好的方式还是将域保持为private，应当一直保留“更改底层实现”的权利，
 * 然后通过protected方法来控制类的继承者的访问权限。
 * 
 * 向上转型：有导出类转型成为基类，在继承图上实现向上移动的。向上转型是从一个较专用类型向通用类型转换。总是安全的。
 */
class Engine {
  public void start() {}
  public void rev() {}
  public void stop() {}
}

class Wheel {
  public void inflate(int psi) {}
}

class Window {
  public void rollup() {}
  public void rolldown() {}
}

class Door {
  public Window window = new Window();
  public void open() {}
  public void close() {}
}

public class Car {
  public Engine engine = new Engine();
  public Wheel[] wheel = new Wheel[4];
  public Door
    left = new Door(),
    right = new Door(); // 2-door
  public Car() {
    for(int i = 0; i < 4; i++)
      wheel[i] = new Wheel();
  }
  public static void main(String[] args) {
    Car car = new Car();
    car.left.window.rollup();
    car.wheel[0].inflate(72);
  }
} ///:~
