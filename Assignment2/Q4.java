import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        long n = scanner.nextInt();
        long res = compute(n);

        if(res == -1) System.out.println("Does not exist!");
        else System.out.println(res);
    }

    private static long compute(long n){

        long sum = 0;

        for(long i=1; i<=n; i++){

            sum += i;

            if(sum == i*i && sum > Integer.MAX_VALUE)
                return i;
        }

        return -1;
    }
}
