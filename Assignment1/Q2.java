import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter number of dict words: ");
        int n2 = scanner.nextInt();

        HashMap<String, Integer> dict= new HashMap<>();

        for(int i=0; i<=n2; i++){
            String temp = scanner.nextLine();
            dict.put(temp, 1);
        }

        String[] textArray = text.split(" ");

        StringBuffer result = new StringBuffer();

        for(String str : textArray){

            if(dict.containsKey(str)){

                String s1 = String.valueOf(str.charAt(0));

                StringBuffer s2 = new StringBuffer();

                for(int i=0; i<str.length()-1; i++){
                    s2.append('*');
                }

                result.append(s1+s2);
            }
            else{
                result.append(str);
            }

            result.append(" ");
        }

        System.out.println(result);

    }
}
