import java.util.*;

public class BubleSort {
	
	static void bulbleSort(int[] A, int n) {
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = ran.nextInt(100) + 1;
			System.out.print(A[i] + "\t"); 
		}
		System.out.println("\n");
		bulbleSort(A, n);
		System.out.println("Mảng sau khi sắp xếp: ");
	    for(int i=0; i<n; i++){
	      System.out.print(A[i] + "\t"); 
	    }

	}

}
