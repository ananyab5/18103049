import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = scanner.next();
        System.out.println(mySort(str));
    }

    private static StringBuilder mySort(String str){

        int[] count = new int[256];

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }

        StringBuilder res = new StringBuilder();

        for(int i=0; i<256; i++){

            for(int j=0; j<count[i]; j++){

                char ch = (char) (i);
                res.append(ch);
            }
        }

        return res;
    }
}
