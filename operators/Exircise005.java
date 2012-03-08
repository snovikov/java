//: operators/Exircise005.java
class Dog {
	String name;
	String say;
}

public class Exircise005 {
  public static void main(String[] args) {
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    d1.name = "spot";
    d1.say = "Ruff!";
    d2.name = "scruffy";
    d2.say = "Wurf!";
    System.out.println("Dog1's name is '" + d1.name + "' and it says '" + d1.say + "'");
    System.out.println("Dog2's name is '" + d2.name + "' and it says '" + d2.say + "'");
  }
} /* Output:
Dog1's name is 'spot' and it says 'Ruff!'
Dog2's name is 'scruffy' and it says 'Wurf!'
*///:~
