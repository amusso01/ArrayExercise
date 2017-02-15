
/**
 * Write a description of class ArrayExercise here.
 * 
 * @author Andrea Musso     
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercise
{
    public static void main (String[] args){
        final int SIZE=5;
        int[] anArray = new int[SIZE];
        Scanner scan = new Scanner(System.in);
        int input, result;
        for (int i = 0 ; i <anArray.length;i++){
            System.out.println("Please enter whole number for the array position " + i+":");
            input= scan.nextInt();
            anArray[i]=input;
        }
        
        printArray("You input the following array", anArray);
        printArray("The reverse of the input array is", reverseArray(anArray));
    }
    public static void printArray(String message, int[] arrayToPrint){
        System.out.println(message+" "+ Arrays.toString(arrayToPrint));
    }
    public static int[] reverseArray(int[] incomingArray){
       int[] inverse = new int [incomingArray.length];
       int d = 0;
       for(int i=(incomingArray.length-1); i>=0 ;i--){
           inverse[d]=incomingArray[i];
           d++;
        }
        return inverse;
    }
}
