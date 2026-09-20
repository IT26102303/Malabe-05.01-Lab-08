import java.util.Scanner;

public class IT26102303Lab8Q4 {
    public static void main(String[] args) {
        
        Scanner input;
        int[] studentsArray;
        int count;
        int idInput;
        int searchId;
        boolean found;
        int i;

      
        input = new Scanner(System.in);
        studentsArray = new int[8];
        count = 0;

        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            idInput = input.nextInt();

            if (idInput <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = idInput;
                count++;
            }
        }

        
        System.out.print("\nEnter a Student ID to Search: ");
        searchId = input.nextInt();

        
        found = false;
        for (i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

    }
}
