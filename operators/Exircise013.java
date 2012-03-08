//: operators/Exircise013.java
import static net.mindview.util.Print.*;

public class Exircise013 {
  public static void main(String[] args) {
    short s = 0;
    char c = '1';
    print("   c : " + c);
    for (s=1; s<4; s++)
    {
		c <<= 1;
		print("c<<" + s + " : " + c);
	}
  }
} /* Output:
   c : 1
c<<1 : b
c<<2 : Ä
c<<3 : ƈ
*///:~
