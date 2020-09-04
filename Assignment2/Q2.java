package A2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in range 0 to 20");

        for(int i=0; i<n; i++){

            arr[i] = validInput(); //validate input
        }

        int[] count = new int[21];

        for(int i=0; i<n; i++){

            count[arr[i]]++;
        }

        int k = 0;

        for(int i=0; i<21; i++){

            for(int j=0; j<count[i]; j++){

                arr[k++] = i;
            }
        }

        System.out.println("Sorted array: ");

        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    private static int validInput(){

        Scanner scanner = new Scanner(System.in);

        int temp; //input

        while(true){

            while(!scanner.hasNextInt()){

                String input = scanner.next();
                System.out.println("Invalid number");
            }

            temp = scanner.nextInt();

            if(temp < 0 || temp > 20)
                System.out.println("Number out of range");

            else break;
        }

        return temp;
    }
}
