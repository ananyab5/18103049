import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

        long n; // input

        while(true){

            n = scanner.nextLong();

            if(n <= 0) System.out.println("Invalid Negative Number");

            else break;
        }

        hailStoneSeq(n);
    }

    private static void hailStoneSeq(long n){

        while(n != 1 && n <= Integer.MAX_VALUE){

            System.out.println(n);

            if(n%2 == 0) n /= 2;
            else n = n*3 + 1;
        }

        if(n == 1) System.out.println(n);
        else System.out.println("Integer Overflow\nEnter A Smaller Input");
    }
}
