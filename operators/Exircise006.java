//: operators/Exircise006.java
class Dog {
	String name;
	String say;
}

public class Exircise006 {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog();
	Dog rd = d1;
	System.out.println("d1 == d2 : " + (d1 == d2));
	System.out.println("d1 == rd : " + (d1 == rd));
	System.out.println("d2 == rd : " + (d2 == rd));
	System.out.println("d1 equals d2 : " + d1.equals(d2));
	System.out.println("d1 equals rd : " + d1.equals(rd));
	System.out.println("d2 equals rd : " + d2.equals(rd));
  }
} /* Output:
d1 == d2 : false
d1 == rd : true
d2 == rd : false
d1 equals d2 : false
d1 equals rd : true
d2 equals rd : false
*///:~
