public class Film implements Comparable<Film>{

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

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Film film) {		
	
			return this.filmId - film.filmId;					
	}

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