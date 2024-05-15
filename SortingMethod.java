// This class provides methods to sort arrays of Film objects based on various attributes
//  Each sorting method implements a recursive merge sort algorithm tailored to a specific attribute

public class SortingMethod {

    //Each specific merge sort method is private but are called in this public method taking a string argument for the choice
    public static void divide(String choice, Film[] films){
        switch(choice){
            case "filmId":
                // Call right method
                divideId(films);
            break;
            case "genre":
                // Call right method
                divideGenre(films);
            break;
            case "director":
                // Call right method
                divideDirector(films);
            break;
            case "title":
                // Call right method
                divideTitle(films);
            break;
            case "length": 
                // Call right method
                divideLength(films);
            break;
            case "rating":
                // Call right method
                divideRating(films);
            break;
            default:
                // If the argument is incorrect throw Exception
                throw new IllegalArgumentException("Wrong argument added for the sorting method");            

        }
    }
    // Sorts an array of films based on film ID using merge sort
    private static void divideId(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideId(leftHalf);
        divideId(rightHalf);

	   mergeId(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by film ID
    private static void mergeId (Film[] films, Film[] leftHalf, Film[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getFilmId() <= rightHalf[j].getFilmId()) {
                films[k] = leftHalf[i];
                i++;
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }
    }

    // Sorts an array of films based on genre using merge sort
    private static void divideGenre(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideGenre(leftHalf);
        divideGenre(rightHalf);

	   mergeGenre(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by genre
    private static void mergeGenre (Film[] films, Film[] leftHalf, Film[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getGenre().compareTo(rightHalf[j].getGenre()) < 0) {
                films[k] = leftHalf[i];
                i++;
            }

            else if(leftHalf[i].getGenre().compareTo(rightHalf[j].getGenre()) == 0) {
                if(leftHalf[i].compareTo(rightHalf[j]) <= 0 ){
                    films[k] = leftHalf[i];
                    i++;
                }
                else{
                    films[k] = rightHalf[j];
                    j++; 
                }
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }


    }

    // Sorts an array of films based on director using merge sort
    private static void divideDirector(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideDirector(leftHalf);
        divideDirector(rightHalf);

	   mergeDirector(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by director
    private static void mergeDirector (Film[] films, Film[] leftHalf, Film[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getDirectorName().compareTo(rightHalf[j].getDirectorName()) < 0) {
                films[k] = leftHalf[i];
                i++;
            }

            else if(leftHalf[i].getDirectorName().compareTo(rightHalf[j].getDirectorName()) == 0) {
                if(leftHalf[i].compareTo(rightHalf[j]) <= 0 ){
                    films[k] = leftHalf[i];
                    i++;
                }
                else{
                    films[k] = rightHalf[j];
                    j++; 
                }
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }


    }

    // Sorts an array of films based on title using merge sort
    private static void divideTitle(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideTitle(leftHalf);
        divideTitle(rightHalf);

	   mergeTitle(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by title
    private static void mergeTitle(Film[] films, Film[] leftHalf, Film[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getTitle().compareTo(rightHalf[j].getTitle()) < 0) {
                films[k] = leftHalf[i];
                i++;
            }

            else if(leftHalf[i].getTitle().compareTo(rightHalf[j].getTitle()) == 0) {
                if(leftHalf[i].compareTo(rightHalf[j]) <= 0 ){
                    films[k] = leftHalf[i];
                    i++;
                }
                else{
                    films[k] = rightHalf[j];
                    j++; 
                }
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }


    }

    // Sorts an array of films based on length using merge sort
    private static void divideLength(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideLength(leftHalf);
        divideLength(rightHalf);

	   mergeLength(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by length
    private static void mergeLength(Film[] films, Film[] leftHalf, Film[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getLength() < rightHalf[j].getLength()) {
                films[k] = leftHalf[i];
                i++;
            }

            else if(leftHalf[i].getLength() == rightHalf[j].getLength()) {
                if(leftHalf[i].compareTo(rightHalf[j]) <= 0 ){
                    films[k] = leftHalf[i];
                    i++;
                }
                else{
                    films[k] = rightHalf[j];
                    j++; 
                }
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }


    }

    // Sorts an array of films based on rating using merge sort
    private static void divideRating(Film[] films) {
        int len = films.length;

        if (len <=1) {
          return;
        }

        int midIndex = len / 2;
        Film[] leftHalf = new Film[midIndex];
        Film[] rightHalf = new Film[len - midIndex];

        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = films[i];
        }
        for (int i = midIndex; i < len; i++) {
          rightHalf[i - midIndex] = films[i];
        }


        divideRating(leftHalf);
        divideRating(rightHalf);

	   mergeRating(films, leftHalf, rightHalf);
    }

    // Merges two halves of a film array sorted by rating
    private static void mergeRating(Film[] films, Film[] leftHalf, Film[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
    
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].getRating() < rightHalf[j].getRating()) {
                films[k] = leftHalf[i];
                i++;
            }

            else if(leftHalf[i].getRating() == rightHalf[j].getRating()) {
                if(leftHalf[i].compareTo(rightHalf[j]) <= 0 ){
                    films[k] = leftHalf[i];
                    i++;
                }
                else{
                    films[k] = rightHalf[j];
                    j++; 
                }
            }
            else {
                films[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            films[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            films[k] = rightHalf[j];
            j++;
            k++;
      }


    }
}



