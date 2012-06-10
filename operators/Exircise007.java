//: operators/Exircise007.java
// Relational and logical operators.
import java.util.*;
import static net.mindview.util.Print.*;

public class Exircise007 {
  public static void main(String[] args) {
    Random rand = new Random(42);
    int c1 = rand.nextInt(2);
    int c2 = rand.nextInt(2);
    print("Coin #1 : " + (c1==1?"орел":"решка"));
    print("Coin #2 : " + (c1==2?"орел":"решка"));
  }
} /* Output:
Coin #1 : орел
Coin #2 : решка
*///:~
