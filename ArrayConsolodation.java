/*
 * Tyler Atkinson.
 * October
 * 22
 * 2015
 */

package array.consolodation;
import java.util.Scanner;
/**
 *
 * @author tyatk9075
 */
public class ArrayConsolodation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner keyedinput = new Scanner (System.in) ;
        //variable declaration
        int numMarks = 0;
        double[] marks;
        double sum = 0;
        double average;
        
        //get input of the number of marks
        System.out.println("Average Caculator/HonorRoll \n\nEnter the number of marks you wish to find the average of.");
        numMarks = keyedinput.nextInt();
        
        //initialize the array
        marks = new double[numMarks];
        
        //fill the array with user input 
        System.out.println("Enter your marks,press enter after every mark:");
        for(int i = 0; i < numMarks; i++){
            marks[i] = keyedinput.nextDouble();
            sum += marks[i];
        }
        
        System.out.println("\nThe numbers you entered are:");
        for(int i = 0; i < numMarks; i++){
            System.out.println(marks[i]);
        }
        
        //average caculations
        average = sum/numMarks;
        average = (int)(average*100);
        average/=100;
        
        // Final statements
        System.out.println("\n\nThe average is: %" + average);
        {if (average > 80)
            System.out.println("You have got made honor roll");}
        
        { if (average < 80)
            System.out.println ("You've failed to make honor roll");
        }
    
    

