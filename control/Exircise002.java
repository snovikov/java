//: control/Exircise002.java

public class Exircise002 {
  public static void main(String[] args) {
    int p = 0;
    int n = 0;
    for(int c = 1; c <= 25; c++) {
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
