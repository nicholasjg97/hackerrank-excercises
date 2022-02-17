import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

//    Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("1");
//        do
//            if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N >= 6 && N <= 20) {
//                System.out.println("Weird");
//            } else if (N > 20) {
//                System.out.println("Not Weird");
//            }
//
//        scanner.close();
//    }
}