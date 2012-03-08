//: operators/Exircise012.java
import static net.mindview.util.Print.*;

public class Exircise012 {
  public static void main(String[] args) {
    short s = 0;
    int i = 0xffffffff;
    print("   i  : " + Integer.toBinaryString(i));
    for (s=1; s<9; s++)
    {
		i <<= 4;
		print("i<<" + s*4 + (s*4<10?" ":"") +" : " + Integer.toBinaryString(i));
	}
  }
} /* Output:
   i  : 11111111111111111111111111111111
i<<4  : 11111111111111111111111111110000
i<<8  : 11111111111111111111111100000000
i<<12 : 11111111111111111111000000000000
i<<16 : 11111111111111110000000000000000
i<<20 : 11111111111100000000000000000000
i<<24 : 11111111000000000000000000000000
i<<28 : 11110000000000000000000000000000
i<<32 : 0
*///:~
