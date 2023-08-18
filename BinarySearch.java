public class BinarySearch {

  static int binarySearch(int[] A, int k, int n) {
	  int left = 0;
	  int right = n - 1;
	  while (left <= right) {
		  int mid = (left + right) / 2;
		  if (A[mid] == k) {
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
    
    int[] A = {1, 3, 5, 5, 7, 9, 11, 14, 15}; 
    int k = 15;
    int n = A.length;
    
    int result = binarySearch(A, k, n);
    System.out.println(result);
    
  }

}