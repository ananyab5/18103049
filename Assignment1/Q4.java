import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("String 1: ");
        String s1 = scanner.next();

        System.out.println("String 2: ");
        String s2 = scanner.next();

        if(s1.length() != s2.length()){
            System.out.println("Strings are not Anagram");
            return;
        }

        if(isAnagram(s1, s2)) System.out.println("Strings are Anagram");
        else System.out.println("Strings are not Anagram");
    }

    public static Boolean isAnagram(String s1, String s2){

        int[] count = new int[256];

        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
        }

        for(int i=0; i<s2.length(); i++){
            count[s2.charAt(i)]--;
        }

        for(int x : count){
            if(x != 0) return false;
        }

        return true;
    }
}
