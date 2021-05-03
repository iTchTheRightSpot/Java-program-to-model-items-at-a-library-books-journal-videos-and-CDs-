package com.codewithEmmanuel;

public abstract class WrittenItem  extends Item {
    private String author;
    public WrittenItem(int id_number, String title, String itemAvailable, int no_of_available_copies, String author){
       super(id_number, title, itemAvailable, no_of_available_copies);
       this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
