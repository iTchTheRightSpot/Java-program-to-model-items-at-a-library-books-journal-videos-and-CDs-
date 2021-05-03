package com.codewithEmmanuel;

public class CD extends MediaItem {
    private String artist; private String genre;

    public CD(int id_number, String title, String ItemAvailable, int available_copies, double runtime, String artist, String genre) {
        super(id_number, title, ItemAvailable, available_copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }

    public String toString(){
        return  "\nIdentification Number: " + getIdentification_number() +
                ", Title: " +getTitle()+
                ", Item(s): "+getItemAvailable()+
                ", Runtime: "+getRuntime()+
                ", Available Copies: "+getNo_of_available_copies()+
                ", The Artist: "+getArtist()+
                ", Genre: "+getGenre();
    }

}
