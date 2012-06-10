//: control/Exircise003.java

public class Exircise003 {
  public static void main(String[] args) {
    int p = 0;
    int n = 0;
    while(true) {
		p = Math.round((int)(Math.random()*(double)Integer.MAX_VALUE));
        System.out.println("value: " + p);
        if ( p > n)
			System.out.println("(>) greate than before");
		else if ( p < n)
			System.out.println("(<) less than before");
		else 
			System.out.println("(=) equal");
        n = p;
	}
  }
} /* Output: (see on execution) *///:~
