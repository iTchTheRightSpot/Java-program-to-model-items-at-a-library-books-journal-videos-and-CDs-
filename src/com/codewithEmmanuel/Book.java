package com.codewithEmmanuel;

    public class Book extends WrittenItem  {
        public Book(int id_number, String title, String itemAvailable, int no_of_available_copies, String author) {
            super(id_number, title, itemAvailable, no_of_available_copies, author);
        }

        public String toString(){
            return  "\nIdentification number: " + getIdentification_number()+
                    ", Title: " +getTitle()+
                    ", Item(s): "+getItemAvailable()+
                    ", Available Copies: "+getNo_of_available_copies()+
                    ", Author: "+getAuthor();
        }
    }
