import java.util.*;

public class PrimeAlgorithm {

  public static boolean isPrime(int n) {

    if (n < 2) {
      return false; 
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      		}
    	}
    return true;
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Nhập một số: ");
    int n = sc.nextInt();

    boolean prime = isPrime(n);

    if(prime) {
      System.out.println(n + " là số nguyên tố");
    }
    else {
      System.out.println(n + " không phải là số nguyên tố");
    }
  }
}