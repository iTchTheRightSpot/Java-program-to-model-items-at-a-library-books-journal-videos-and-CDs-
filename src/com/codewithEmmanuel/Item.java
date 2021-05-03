package com.codewithEmmanuel;

    public abstract class Item {
    private int identification_number; private String title; private String itemAvailable; private int no_of_available_copies;

    public  Item (int id_number, String title, String itemAvailable, int no_of_available_copies){
        this.identification_number = id_number;
        this.title = title;
        this.itemAvailable = itemAvailable;
        this.no_of_available_copies = no_of_available_copies;
    }

    public void borrowed (){
        if (no_of_available_copies == 0){
            System.out.println("Not available");
        }   else
            no_of_available_copies--;
    }

    public void returnedItem(){
        no_of_available_copies++;
    }

    public void setIdentification_number(int identificationNumber) {
        this.identification_number = identificationNumber;
    }
    public int getIdentification_number() {
        return identification_number;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setItemAvailable(String itemAvailable) {
        this.itemAvailable = itemAvailable;
        }
    public String getItemAvailable() {
        if (no_of_available_copies <= 0){
            itemAvailable = "Not Available";
        }else {
            itemAvailable = "Available";
        }
        return itemAvailable;
    }

    public void setNo_of_available_copies(int no_of_available_copies) {
        this.no_of_available_copies = no_of_available_copies;
    }
    public int getNo_of_available_copies() {
        return no_of_available_copies;
    }

}

