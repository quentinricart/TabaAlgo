import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read an array of Film objects from a file
        Film[] films = HelperMethod.readFilms(5);
        
        // Calculate the sum of lengths for films at even index
        double sumAllIndexEven = HelperMethod.sumLengthForEvenIndex(films, 0);
        System.out.println("The sum of all length from movie with an even index is " + sumAllIndexEven + "\n");

        // Find the minimum film length in the array of films.
        double minLengthValue = HelperMethod.minLengthValue(films);
        System.out.println("The minimum length value is: " + minLengthValue + "\n");

        // Flag to check if the user has made a valid attribute selection.
        boolean validChoice = false;
        String attribute = "";

        // Loop until the user makes a valid selection for sorting.
        while(!validChoice){
            System.out.println("Choose an attribute to sort the films, the full file will be print afterwards:"
                                + "\n1: Film ID"
                                + "\n2: Genre"
                                + "\n3: Director"
                                + "\n4: Title"
                                + "\n5: Length"
                                + "\n6: Rating");

            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    attribute = "filmId"; 
                    validChoice = true;
                    break;
                case "2":
                    attribute = "genre";
                    validChoice = true;
                    break;
                case "3":
                    attribute = "director";
                    validChoice = true;
                    break;
                case "4":
                    attribute = "title";
                    validChoice = true;
                    break;
                case "5":
                    attribute = "length";
                    validChoice = true;
                    break;
                case "6":
                    attribute = "rating"; 
                    validChoice = true;
                    break;
                default:
                //Wrong choice message
                    System.out.println("Invalid choice. Please select a valid option from 1 to 6.");
            }
        }

        // Perform the sorting operation based on the selected attribute
        SortingMethod.divide(attribute, films);

        // Print all films after sorting
        HelperMethod.printAllFilms(films);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}