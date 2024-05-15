
public class Film implements Comparable<Film>{

    // Member variables to hold film details.
    private int filmId;
    private String genre;
    private String directorName;
    private String title;
    private double length;
    private double rating;
    
    public Film(int filmId, String genre, String directorName, String title, double length, double rating) {
        this.filmId = filmId;
        this.genre = genre;
        this.directorName = directorName;
        this.title = title;
        this.length = length;
        this.rating = rating;
    }

    // Getters and setters for film ID.
    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    // Getters and setters for genre.
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getters and setters for director's name.
    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    // Getters and setters for title.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getters and setters for film length.
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getters and setters for rating.
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // This class implements Comparable and compare by FilmId
    @Override
    public int compareTo(Film film) {       
            return this.filmId - film.filmId;                  
    }

    //Override the toString method
    @Override
    public String toString() {
        return "Id: " + filmId +
               " - Genre: " + genre +
               " - Director: " + directorName +
               " - Title: " + title +
               " - Length: " + length + " hours" +
               " - Rating: " + String.format("%.2f", rating) + "/100";
    }
}