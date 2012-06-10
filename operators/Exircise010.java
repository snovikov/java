//: operators/Exircise010.java
import static net.mindview.util.Print.*;

public class Exircise010 {
  public static void main(String[] args) {
    int i1 = 0x8fff0000;
    print("i1 : " + Integer.toBinaryString(i1));
    int i2 = 0X80010010;
    print("i2 : " + Integer.toBinaryString(i2));
    print("&  : " + Integer.toBinaryString(i1&i2));
    print("|  : " + Integer.toBinaryString(i1|i2));
    print("^  : " + Integer.toBinaryString(i1^i2));
    print("~i1: " + Integer.toBinaryString(~i1));
    print("~i2: " + Integer.toBinaryString(~i2));
  }
} /* Output:
i1 : 10001111111111110000000000000000
i2 : 10000000000000010000000000010000
&  : 10000000000000010000000000000000
|  : 10001111111111110000000000010000
^  : 1111111111100000000000010000
~i1: 1110000000000001111111111111111
~i2: 1111111111111101111111111101111
*///:~
