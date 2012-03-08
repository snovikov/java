//: operators/Exircise008.java
import static net.mindview.util.Print.*;

public class Exircise008 {
  public static void main(String[] args) {
    long l1 = 0x7fffffffffffffffL; // Hexadecimal (lowercase)
    print("l1: " + Long.toBinaryString(l1));
    long l2 = 0X7F123456789ABCDFL; // Hexadecimal (uppercase)
    print("l2: " + Long.toBinaryString(l2));
    long l3 = 01777777777777771234567L; // Octal (leading zero)
    print("l3: " + Long.toBinaryString(l3));
  }
} /* Output:
l1: 111111111111111111111111111111111111111111111111111111111111111
l2: 111111100010010001101000101011001111000100110101011110011011111
l3: 1111111111111111111111111111111111111111111001010011100101110111
*///:~
