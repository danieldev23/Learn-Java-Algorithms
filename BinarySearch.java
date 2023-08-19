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
		int[] A = {21, 32, 45, 65 ,76, 79, 90, 101, 120, 135};
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần tìm: ");
		int k = sc.nextInt();
		int n = A.length;
		int result = binarySearch(A, k, n);
		System.out.println("Vị trí của " (String)k + result);
	}
}