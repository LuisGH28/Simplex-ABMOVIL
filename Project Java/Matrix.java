import java.util.Scanner;

public class Matrix {

    //Create Scanner's Method
	private static Scanner entry = new Scanner(System.in);

    public static void printMatrix(int variables, int restrictions, int numbers [][]){
        System.out.print("\n\n");
        //Print name of columns
        System.out.print("Var");
        for(int j = 0; j < (variables + restrictions  + 1); j++){
            if(j < variables){
                System.out.print("\tX" + (j + 1));
            }
        }
 
        for(int j = 0; j < (variables + restrictions + 1); j++){
             if(j < restrictions){
                 System.out.print("\tS" + (j + 1));
             }
        }
        
        System.out.println("\tResult");
        System.out.println("\n");

        //Print name of rows
        for(int i = 0; i<(restrictions + 1); i++){
            if(i<restrictions){
                System.out.print("S" + (i+1) + " ");
            }else{
                System.out.print("Z" + " ");
            }
            for(int j = 0; j < numbers.length; j++){
                System.out.print("|");
                for(int k = 0; k < numbers[j].length; k++){
                    System.out.print(numbers[j][k]);
                    if (k!=numbers[j].length+1) System.out.print("\t");
                }
                System.out.println("|");
            }
        }
    }
}