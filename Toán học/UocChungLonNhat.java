import java.util.*;
public class UocChungLonNhat {
    static int UocChungLonNhat(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UocChungLonNhat(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(UocChungLonNhat(a, b));
    }
}
