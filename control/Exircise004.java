//: control/Exircise004.java

public class Exircise004 {
  public static void main(String[] args) {
    int p = 1;
    while(true) {
		p++;
		int d = 0;
		for(int n = (int)Math.sqrt(p); n>0; n--) {
			if ( p % n == 0)
				d++;
		}
		if(d == 1)
			System.out.println("prime: " + p);
	}
  }
} /* Output: (see on execution) *///:~
