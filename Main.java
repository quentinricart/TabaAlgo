import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Film[] films = HelperMethod.readFilms(10000);
        boolean validChoice = false;
        String attribute = "";

        double sumAllIndexEven = HelperMethod.sumLengthForEvenRow(films, 0);
        System.out.println("The sum of all length from movie with an even index is " + sumAllIndexEven + "\n");

        double minLengthValue = HelperMethod.minLengthValue(films);
        System.out.println("The minimum length value is: " + minLengthValue + "\n");

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
                    System.out.println("Invalid choice. Please select a valid option from 1 to 6.");
            }
        }

        SortingMethod.divide(attribute, films);

        HelperMethod.printAllFilms(films);

        scanner.close();

        


        





    }


    
}
