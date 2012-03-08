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
    i  : 1000000000000000000000000000
i>4  : 100000000000000000000000
i>>>8  : 10000000000000000000
i>>>12 : 1000000000000000
i>>>16 : 100000000000
i>>>20 : 10000000
i>>>24 : 1000
i>>>28 : 0
*///:~
