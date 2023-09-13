import java.util.*;
import java.lang.Math;

public class SoChinhPhuong {
	static boolean soChinhPhuong(int n) {
		double sqr = Math.sqrt(n);
		if (sqr*sqr == n) {
			return true;
		}
		else {
		return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\t \t \t THUẬT TOÁN KIỂM TRA SỐ CHÍNH PHƯƠNG");
		System.out.println("Nhập số cần kiểm tra: ");
		int n = sc.nextInt();
		if(soChinhPhuong(n)) {
			System.out.println(n + " là số chính phương");
		}
		else {
			System.out.println(n + " không phải là số chính phương");
		}
	}

}
