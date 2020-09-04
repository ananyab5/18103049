import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of set A:");
        int nA = scanner.nextInt();
        int[] setA = new int[nA];

        System.out.println("Enter elements of set A:");
        for(int i=0; i<nA; i++){
            setA[i] = validInput(); //validate input
        }

        System.out.println("Enter size of set B:");
        int nB = scanner.nextInt();
        int[] setB = new int[nB];

        System.out.println("Enter elements of set B");
        for(int i=0; i<nB; i++){
            setB[i] = validInput(); //validate input
        }

        long start = System.currentTimeMillis();

        //USING ARRAYS
        //start time
        printUnion(setA, setB);
        System.out.println();
        printIntersection(setA, setB);
        System.out.println();
        printComplement(setA);
        System.out.println();
        printComplement(setB);
        //end time

        // ending time
        long end = System.currentTimeMillis();
        System.out.println("\nTime taken using arrays: " + (end - start) + "ms");

        start = System.currentTimeMillis();

        //USING SETS
        //start time
        printUnion1(setA, setB);
        System.out.println();
        printIntersection1(setA, setB);
        System.out.println();
        printComplement1(setA);
        System.out.println();
        printComplement1(setB);
        //end time

        // ending time
        end = System.currentTimeMillis();
        System.out.println("\nTime taken using sets: " +
                (end - start) + "ms");
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

            if(temp < 0 || temp > 10)
                System.out.println("Number out of range");

            else break;
        }

        return temp;
    }

    private static void printUnion(int[] setA, int[] setB){

        int[] union = new int[11];

        for(int x : setA){
            union[x]++;
        }

        for(int x : setB){
            union[x]++;
        }

        System.out.println("Union: ");
        for(int i=0; i<11; i++){
            if(union[i] > 0) System.out.print(i + " ");
        }
    }

    private static void printIntersection(int[] setA, int[] setB){

        int[] intersection = new int[11];

        for(int x : setA){
            intersection[x]++;
        }

        for(int x : setB){
            intersection[x]++;
        }

        System.out.println("Intersection: ");
        for(int i=0; i<11; i++){
            if(intersection[i] >= 2) System.out.print(i + " ");
        }
    }

    private static void printComplement(int[] set){

        int[] comp = new int[11];

        for(int x : set){
            comp[x]++;
        }

        System.out.println("Complement: ");

        for(int i=0; i<11; i++){

            if(comp[i] == 0) System.out.print(i + " ");
        }
    }

    private static void printUnion1(int[] setA, int[] setB){

        Set<Integer> union = new HashSet<>();

        for(int x : setA){
            union.add(x);
        }

        for(int x : setB){
            union.add(x);
        }

        System.out.println("Union: ");

        for(int x : union){
            System.out.print(x + " ");
        }
    }

    private static void printIntersection1(int[] setA, int[] setB){

        Set<Integer> intersection = new HashSet<>();

        for(int x : setA){
            intersection.add(x);
        }

        System.out.println("Intersection: ");

        for(int x : setB){
            if(intersection.contains(x))
                System.out.print(x + " ");
        }
    }

    private static void printComplement1(int[] set){

        int[] comp = new int[11];

        for(int x : set){
            comp[x]++;
        }

        System.out.println("Complement: ");

        for(int i=0; i<11; i++){

            if(comp[i] == 0) System.out.print(i + " ");
        }
    }
}
