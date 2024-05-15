public class ThreadMain {
    public static void main (String[] args){
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

class Thread1 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("filmId", films);
        HelperMethod.createFile("sortedFilms_C1.csv", films);
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("genre", films);
        HelperMethod.createFile("sortedFilms_C2.csv", films);
    }
}

class Thread3 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("director", films);
        HelperMethod.createFile("sortedFilms_C3.csv", films);
    }
}

class Thread4 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("title", films);
        HelperMethod.createFile("sortedFilms_C4.csv", films);
    }
}

class Thread5 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("length", films);
        HelperMethod.createFile("sortedFilms_C5.csv", films);
    }
}
class Thread6 extends Thread{
    @Override
    public void run(){
        Film[] films = HelperMethod.readFilms(10000);
        SortingMethod.divide("rating", films);
        HelperMethod.createFile("sortedFilms_C6.csv", films);
    }
}

