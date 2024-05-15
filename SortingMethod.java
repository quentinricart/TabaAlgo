public class SortingMethod {

    public static void divide(String choice, Film[] films){
        switch(choice){
            case "filmId":
                divideId(films);
            break;
            case "genre":
                divideGenre(films);
            break;
            case "director":
                divideDirector(films);
            break;
            case "title":
                divideTitle(films);
            break;
            case "length": 
                divideLength(films);
            break;
            case "rating":
                divideRating(films);
            break;
            default:
                throw new IllegalArgumentException("Wrong argument added for the sorting method");            

        }
    }

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



