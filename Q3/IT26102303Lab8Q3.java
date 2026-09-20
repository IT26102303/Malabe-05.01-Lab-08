import java.util.Scanner;

public class IT26102303Lab8Q3 {
    public static void main(String[] args) {
      
        Scanner input;
        int[] myArray;
        int count;
        int numInput;
        int max;
        int i;

        input = new Scanner(System.in);
        myArray = new int[6];
        count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            numInput = input.nextInt();

            if (numInput <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                myArray[count] = numInput;
                count++;
            }
        }

        System.out.println("\nArray Contents:");
        for (i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        max = myArray[0];
        for (i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + max);
		
    }
}
