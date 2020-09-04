import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = scanner.next();
        System.out.println("Enter second string: ");
        String s2 = scanner.next();

        String temp;
        int res = compare(s1, s2);
        if(res == 1) temp = " is greater than ";
        else if(res == 0) temp = " is equal to ";
        else temp = " is lesser than ";

        System.out.println(s1 + temp + s2);
    }

    private static int compare(String s1, String s2){

        int n1 = s1.length();
        int n2 = s2.length();

        int i=0, j=0;

        while(i<n1 && j<n2){

            if(s1.charAt(i) > s2.charAt(j)) return 1;
            if(s1.charAt(i) < s2.charAt(j)) return -1;

            i++;
            j++;
        }

        if(i==n1 && j==n2) return 0;
        if(i<n1) return 1; //s1 has remaining characters
        return -1;
    }
}

