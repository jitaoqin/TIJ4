package initialization;
//: initialization/PrimitiveOverloading.java
// Promotion of primitives and overloading.
import static net.mindview.util.Print.*;
/*
 * 如果传入的数据类型（实际参数类型）小于方法中声明的形参类型，实参类型就会被提升。
 * char型略有不同，如果无法找到恰好接受参数的方法，就会直接提升至int型
 */
public class PrimitiveOverloading {
  void f1(char x) { printnb("f1(char)\t"); }
  void f1(byte x) { printnb("f1(byte)\t"); }
  void f1(short x) { printnb("f1(short)\t"); }
  void f1(int x) { printnb("f1(int)  \t"); }
  void f1(long x) { printnb("f1(long)\t"); }
  void f1(float x) { printnb("f1(float)\t"); }
  void f1(double x) { printnb("f1(double)\t"); }

  void f2(byte x) { printnb("f2(byte)\t"); }
  void f2(short x) { printnb("f2(short)\t"); }
  void f2(int x) { printnb("f2(int)  \t"); }
  void f2(long x) { printnb("f2(long)\t"); }
  void f2(float x) { printnb("f2(float)\t"); }
  void f2(double x) { printnb("f2(double)\t"); }

  void f3(short x) { printnb("f3(short)\t"); }
  void f3(int x) { printnb("f3(int)  \t"); }
  void f3(long x) { printnb("f3(long)\t"); }
  void f3(float x) { printnb("f3(float)\t"); }
  void f3(double x) { printnb("f3(double)\t"); }

  void f4(int x) { printnb("f4(int)  \t"); }
  void f4(long x) { printnb("f4(long)\t"); }
  void f4(float x) { printnb("f4(float)\t"); }
  void f4(double x) { printnb("f4(double)\t"); }

  void f5(long x) { printnb("f5(long)\t"); }
  void f5(float x) { printnb("f5(float)\t"); }
  void f5(double x) { printnb("f5(double)\t"); }

  void f6(float x) { printnb("f6(float)\t"); }
  void f6(double x) { printnb("f6(double)\t"); }

  void f7(double x) { printnb("f7(double)\t"); }

  void testConstVal() {
    printnb("5:\t");
    f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5); print();
  }
  void testChar() {
    char x = 'x';
    printnb("char:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testByte() {
    byte x = 0;
    printnb("byte:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testShort() {
    short x = 0;
    printnb("short:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testInt() {
    int x = 0;
    printnb("int:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testLong() {
    long x = 0;
    printnb("long:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testFloat() {
    float x = 0;
    printnb("float:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  void testDouble() {
    double x = 0;
    printnb("double:\t");
    f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x); print();
  }
  
  public static void main(String[] args) {
    PrimitiveOverloading p = new PrimitiveOverloading();
    p.testConstVal();
    p.testChar();
    p.testByte();
    p.testShort();
    p.testInt();
    p.testLong();
    p.testFloat();
    p.testDouble();
  }
} /* Output:
5:		f1(int)  	f2(int)  	f3(int)  	f4(int)  	f5(long)	f6(float)	f7(double)	
char:	f1(char)	f2(int)  	f3(int)  	f4(int)  	f5(long)	f6(float)	f7(double)	
byte:	f1(byte)	f2(byte)	f3(short)	f4(int)  	f5(long)	f6(float)	f7(double)	
short:	f1(short)	f2(short)	f3(short)	f4(int)  	f5(long)	f6(float)	f7(double)	
int:	f1(int)  	f2(int)  	f3(int)  	f4(int)  	f5(long)	f6(float)	f7(double)	
long:	f1(long)	f2(long)	f3(long)	f4(long)	f5(long)	f6(float)	f7(double)	
float:	f1(float)	f2(float)	f3(float)	f4(float)	f5(float)	f6(float)	f7(double)	
double:	f1(double)	f2(double)	f3(double)	f4(double)	f5(double)	f6(double)	f7(double)	

*///:~
