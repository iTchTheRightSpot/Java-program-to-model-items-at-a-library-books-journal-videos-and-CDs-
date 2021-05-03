package com.codewithEmmanuel;

public class Video extends MediaItem{
    private String director; private String genre; private String year_released;

    public Video(int id_number, String title, String ItemAvailable, int available_copies, double runtime, String director, String genre, String year_released) {

        super(id_number, title, ItemAvailable, available_copies, runtime);
        this.director = director;
        this.genre = genre;
        this.year_released = year_released;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getDirector() {
        return director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public void setYear_released(String year_released) {
        this.year_released = year_released;
    }
    public String getYear_released() {
        return year_released;
    }

    public String toString(){
        return  "\nIdentification Number:" + getIdentification_number() +
                ", Title: " +getTitle()+
                ", Item(s): "+getItemAvailable()+
                ", Available Copies: "+getNo_of_available_copies()+
                ", Runtime: "+getRuntime()+
                ", Director: "+getDirector()+
                ", Genre: "+getGenre()+
                ", Year Released: "+getYear_released();
    }


}
