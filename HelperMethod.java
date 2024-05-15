import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//This class contains all the method asked but the one for sorting
public class HelperMethod {

    //Method to read all the film from the CSV file
    public static Film[] readFilms(int numberOfFilms){

        //As the file contains 1000 records, we are throwing an exception if the input is wrong
        if(numberOfFilms > 10000 || numberOfFilms < 0){
            throw new IllegalArgumentException("The number of films required has to be between 0 and 10000");
        }

        Film[] films = new Film[numberOfFilms];
        File file = new File("Film.csv");
        String line;
        String[] data;
        int index = 0;

        //Try with ressource so they are automatically closed
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            
            // Skip the header line to process actual film data.
            br.readLine(); 

            //While loop to create the insatnce of Film for each line
            //The loop stops when the index is bigger than the number of films asked
            while ((line = br.readLine()) != null && index < numberOfFilms) {
                data = line.split(",");
                films[index++] = new Film(Integer.parseInt(data[0]), data[1], data[2], data[3], Double.parseDouble(data[4]), Double.parseDouble(data[5]));
            }
        } 

        //Exception handling as both FileReader and BufferedReader throws some checked IOException
        catch(IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return films;
    }

    //Recursive method to add all length with an even index 
    //As we called start the method with index 0 and we keep adding 2 the index are always even
    public static double sumLengthForEvenIndex(Film[] films, int index){
        if(index >= films.length){
            return 0;
        } else {
            return films[index].getLength() + sumLengthForEvenIndex(films, index + 2);
        }
    }

    // Method to print all the Film instance from the array
    public static void printAllFilms(Film[] films){
        for(Film f : films){
            System.out.println(f);
        }
    }

    //Iterative method to find the minimum value
    public static double minLengthValue(Film[] films){
        double minValue = Double.MAX_VALUE;

        for(int i = 1; i < films.length; i += 2){
            if(films[i].getLength() < minValue){
                minValue = films[i].getLength();
            }
        }
        return minValue;
    }

    // Method to create a file
    public static void createFile(String fileName, Film[] films){
        File file = new File(fileName);

        // Try with ressource
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            //First line for the headers
            bw.write("film_id,genre,director_name,title,length,rating\n");

            // Loop to go through each Film in the array
            for(Film f: films){

                //Print each line
                bw.write(f.getFilmId() + "," + f.getGenre() + "," 
                + f.getDirectorName() + "," + f.getTitle() + "," 
                + f.getLength() + "," + f.getRating() + "\n");
            }
        }

        //Exception handling
        catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}