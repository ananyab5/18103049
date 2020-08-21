import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String text = scanner.nextLine();

        System.out.print("Pattern: ");
        String pat = scanner.next();

        System.out.print(findCount(text, pat));
    }

    public static int findCount(String text, String pat){

        int[] freq = new int[256];

        for(int i=0; i<pat.length(); i++){
            freq[pat.charAt(i)]++;
        }

        for(int i=0; i<pat.length(); i++){
            freq[text.charAt(i)]--;
        }

        int count = 0;

        //check if first substr is anagram
        if(isAnagram(freq)) count++;

        //check for remaining substr
        for(int i=pat.length(); i<text.length(); i++){

            freq[text.charAt(i - pat.length())]++;
            freq[text.charAt(i)]--;

            if(isAnagram(freq)) count++;
        }

        return count;
    }

    public static boolean isAnagram(int[] freq){

        for(int x : freq){
            if(x != 0) return false;
        }
        return true;
    }
}
