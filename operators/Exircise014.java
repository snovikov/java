//: operators/Exircise014.java
import static net.mindview.util.Print.*;

public class Exircise014 {
  static void strCompare(String s1, String s2){
	print("s1: '" + s1 + "', s2: '" + s2 + "'");
	print("s1 == s2: " + (s1 == s2));
	print("s1 != s2: " + (s1 != s2));
	print("s1.equals(s2): " + s1.equals(s2));
	print("s2.equals(s1): " + s2.equals(s1));
 }
  public static void main(String[] args) {
	strCompare("a","a");
	strCompare("b","c");
	strCompare("string1","string2");
  }
} /* Output:
s1: 'a', s2: 'a'
s1 == s2: true
s1 != s2: false
s1.equals(s2): true
s2.equals(s1): true
s1: 'b', s2: 'c'
s1 == s2: false
s1 != s2: true
s1.equals(s2): false
s2.equals(s1): false
s1: 'string1', s2: 'string2'
s1 == s2: false
s1 != s2: true
s1.equals(s2): false
s2.equals(s1): false
*///:~
