import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelperMethod {

    public static Film[] readFilms(int numberOfFilms){
        if(numberOfFilms > 10000 || numberOfFilms < 0){
			throw new IllegalArgumentException("The number of stock required has to be between 0 and 10000");
		}
        Film[] films = new Film[numberOfFilms];
        File file = new File("Film.csv");
        String line;
        String[] data;
        int index = 0;

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
        

            br.readLine();
            for( int i = 0; i < numberOfFilms; i++ ){
                line = br.readLine();
                data = line.split(",");
                films[index++] = new Film(Integer.parseInt(data[0]),data[1], data[2], data[3], Double.parseDouble(data[4]), Double.parseDouble(data[5]));
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return films;
    }

    public static double sumLengthEvenID(Film[] films, int index){
        double currentLength;
        if(index >= films.length){
            return 0;
        }
        else{
            if(films[index].getFilmId() % 2 == 0){
                currentLength = films[index].getLength();
                return currentLength + sumLengthEvenID(films, index + 1);
                
            }
            else{
                
                return sumLengthEvenID(films, index + 1);               

            }
        }          
    }

    public static double sumLengthForEvenRow(Film[] films, int index){
        if(index >= films.length){
            return 0;
        }
        else{
            return films[index].getLength() + sumLengthForEvenRow(films, index + 2);
        }
    }

    public static void printAllFilms(Film[] films){
        for(Film f: films){
            System.out.println(f);
        }
    }

    public static double minLengthValue(Film[] films){
        double minValue = films[0].getLength();
        for(Film f: films){
            if(f.getLength() < minValue){
                minValue = f.getLength();
            }
        }
        return minValue;
    }

    public static void createFile(String fileName, Film[] films){
        File file = new File(fileName);

        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)){
            
            bw.write("film_id,genre,director_name,title,length,rating\n");
            for(Film f: films){
                bw.write(f.getFilmId() + "," + f.getGenre() + "," 
                + f.getDirectorName() + "," + f.getTitle() + "," 
                + f.getLength() + "," + f.getRating() + "\n");
            }
        }
        catch(IOException e){
            System.out.println("Error writing this file: " + e.getMessage());
        }

    }
}
