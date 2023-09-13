import java.util.*;

public class BinarySearch {
	static int binarySearch(int[] A, int k, int n  ) {
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if(A[mid] == k) {
				return mid;
			}
			else if (A[mid] < k) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
		
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int b = sc.nextInt();
		int[] A = new int[b];
		for (int i = 0; i <  b; i++) {
			A[i] = ran.nextInt(100) + 1;
			System.out.print(A[i] + "\t"); 
		}
		System.out.println("\nNhập số cần tìm: ");
		int k = sc.nextInt();
		int n = A.length;
		int result = binarySearch(A, k, n);
		if(result == -1) {
			System.out.println("Số " + k +  " không có trong mảng");
		}
		else {
			System.out.println("Vị trí của " + k +  " là " + result);
		}
	}
}