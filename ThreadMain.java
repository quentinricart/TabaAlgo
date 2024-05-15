public class ThreadMain {
    public static void main (String[] args){

        //Create all threads instance
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        Thread thread3 = new Thread3();
        Thread thread4 = new Thread4();
        Thread thread5 = new Thread5();
        Thread thread6 = new Thread6();

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}


//To make it easier to read I created all the class in one file only
//Each thread with number extends Thread and override teh run method with right logic
class Thread1 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by Id
        SortingMethod.divide("filmId", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C1.csv", films);
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by genre
        SortingMethod.divide("genre", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C2.csv", films);
    }
}

class Thread3 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by director
        SortingMethod.divide("director", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C3.csv", films);
    }
}

class Thread4 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by title
        SortingMethod.divide("title", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C4.csv", films);
    }
}

class Thread5 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by length
        SortingMethod.divide("length", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C5.csv", films);
    }
}
class Thread6 extends Thread{
    @Override
    public void run(){

        //Read the file
        Film[] films = HelperMethod.readFilms(10000);

        //Sort by rating
        SortingMethod.divide("rating", films);

        // Create file with right name
        HelperMethod.createFile("sortedFilms_C6.csv", films);
    }
}

