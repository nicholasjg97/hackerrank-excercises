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
//       if(N%2==1)
//        {
//            System.out.println("Weird");
//        }
//        else if(N>=2 && N<=5){
//            System.out.println("Not Weird");
//        }
//        else if(N>=6 && N<=20)
//        {
//            System.out.println("Weird");
//        }
//        else
//        {
//            System.out.println("Not Weird");
//        }
//    }

//    There are three lines of output:
//
//    On the first line, print String: followed by the unaltered String read from stdin.
//    On the second line, print Double: followed by the unaltered double read from stdin.
//    On the third line, print Int: followed by the unaltered integer read from stdin.

//    Scanner scanner = new Scanner(System.in);
//
//    int i = scanner.nextInt();
//    double d = scanner.nextDouble();
//            scanner.nextLine();
//    String s = scanner.nextLine();
//
//            System.out.println("String: "+s);
//            System.out.println("Double: "+d);
//            System.out.println("Int: "+i);



//        Input Format
//
//      Every line of input will contain a String followed by an integer.
//      Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
//
//      Output Format
//
//      In each line of output there should be two columns:
//      The first column contains the String and is left justified using exactly  characters.
//      The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("================================");
//        for (int x = 0; x < 3; x++) {
//            String s = scan.next();
//            int i = scan.nextInt();
//
//            System.out.printf("%-14s %03d\n", s, i);
//        }
//
//        System.out.println("================================");
    }
}