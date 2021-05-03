package com.codewithEmmanuel;

public class Journal extends WrittenItem {

    private String year_published;

    public Journal(int id_number, String title, String itemAvailable, int no_of_available_copies, String author, String year_published) {
        super(id_number, title, itemAvailable, no_of_available_copies, author);
        this.year_published = year_published;
    }

    public void setYear_published(String year_published) {
        this.year_published = year_published;
    }
    public String getYear_published() {
        return year_published;
    }

    public String toString(){
        return  "\nIdentification number: " + getIdentification_number() +
                ", Title: " +getTitle()+
                ", Item(s): "+getItemAvailable()+
                ", Available copies: "+getNo_of_available_copies()+
                ", Author: "+getAuthor()+ "" +
                ", Year Published: "+getYear_published();
    }





}
