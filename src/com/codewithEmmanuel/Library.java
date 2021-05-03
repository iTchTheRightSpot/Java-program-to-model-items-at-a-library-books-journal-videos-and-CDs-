//Emmanuel Uluabuike 0657464 Comp 2477 Ass3

/*
Using an inheritance hierarchy
Design a Java program to model items at a library (books, journal, videos and CDs)
It is a simplified library system with limited functionality.
Have an abstract superclass called Item and include common information that the library such as:
Unique identification number, and title
No actual objects of type Item will be created each actual item will be an object of a non-abstract subclass
Place item-type-specific behavior in subclasses (such as a video's year of release, a CD's musical genre, or a book's author)
 */


package com.codewithEmmanuel;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        System.out.println("""
                Choose from the the following options:
                option 1:AddNewItem
                option 2:BorrowItem
                option 3:ReturnItem
                option 4:DisplayAllLibraryItems
                option 5:exit""");
        options();
    }

    public static void options() {
        Scanner input = new Scanner(System.in);

        String mainMenu = """
                choose from the the following options:
                option 1:AddNewItem
                option 2:BorrowItem
                option 3:ReturnItem
                option 4:DisplayAllLibraryItems
                option 5:exit""";

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1001, "Learning object oriented programming", "", 2, "Dr. S. E. J. Uluabuike"));
        books.add(new Book(1002, "Journey on graduating from Lakehead University", "", 5, "Dr. S. E. J. Uluabuike"));
        books.add(new Book(1003, "Always emailing TA. Lisa Ewen about assignment questions", "",
                50, "Dr. S. E. J. Uluabuike"));



        ArrayList<Journal> journal = new ArrayList<>();
        journal.add(new Journal(2001, "Mr&Mrs Uluabuike", "", 10, "Mr James Uluabuike", "15/09/1997"));
        journal.add(new Journal(2002, "What's up", "", 15, "Mr James Uluabuike", "25/12/2021"));
        journal.add(new Journal(2003, "How to win games", "", 25, "Mr James Uluabuike", "7/5/2020"));


        ArrayList<Video> videos = new ArrayList<>();
        videos.add(new Video(3001, "Life of Somtochukwu Emmanuel James Uluabuike", "", 20, 60.5, "Letitia Munroe",
                "Biography", "28/02/2022"));
        videos.add(new Video(3002, "Don't breathe", "", 47, 88, "Fede Alvarez",
                "Horror, Crime film, Thriller", "16/9/2016"));


        ArrayList<CD> cds = new ArrayList<>();
        cds.add(new CD(4001, "Karma 3 Deluxe", "", 10, 24.5, "Dave East", "Rap"));
        cds.add(new CD(4002, "Life After Death", "", 50, 30.4, "Notorious B.I.G", "Rap"));


        System.out.print("Enter: ");
        loop:
        while (true) {

            int typing = input.nextInt();
            switch (typing) {
                //Creates AddItem for the user
                case 1:
                    System.out.println("Chose what NewItem to add:(a)book, (b)journal, (c)video or (d)cd" + "\nType back to go return to main menu");
                { run:
                    while (true) {
                        String enter = input.next().toLowerCase(Locale.ROOT);
                        switch (enter) {
                            case "back" -> {
                                System.out.println("Main menu " + mainMenu);
                                break run;
                            }
                            case "a" -> {
                                System.out.print("Enter the books identification number: ");
                                int id = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter the books title: ");
                                String title = input.nextLine();
                                System.out.print("Is this book available or not available? ");
                                String item = input.nextLine();
                                System.out.print("Enter number of available books: ");
                                int no_of_copies = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter the books author: ");
                                String author = input.nextLine();
                                books.add(new Book(id, title, item, no_of_copies, author));
                                System.out.println(books);
                                System.out.println("Chose what NewItem to add:(a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "b" -> {
                                System.out.print("Enter the journals identification number: ");
                                int id = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter name of the journal: ");
                                String title = input.nextLine();
                                System.out.print("Is the journal available or not available? ");
                                String item = input.nextLine();
                                System.out.print("Enter number of journals available: ");
                                int no_of_copies = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter the journals author: ");
                                String author = input.nextLine();
                                System.out.print("Enter the year journal was published: ");
                                String year = input.nextLine();
                                journal.add(new Journal(id, title, item, no_of_copies, author, year));
                                System.out.println(journal);
                                System.out.println("Chose what NewItem to add:(a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "c" -> {
                                System.out.print("Enter the videos identification number: ");
                                int id = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter name of the video: ");
                                String title = input.nextLine();
                                System.out.print("Is the video available or not available? ");
                                String item = input.nextLine();
                                System.out.print("Enter the number of available videos: ");
                                int no_of_copies = input.nextInt();
                                System.out.print("Enter the videos runtime: ");
                                double runtime = input.nextDouble();
                                input.nextLine();
                                System.out.print("Enter Director: ");
                                String director = input.nextLine();
                                System.out.print("Enter Genre: ");
                                String genre = input.nextLine();
                                System.out.print("Enter the year released: ");
                                String year = input.nextLine();
                                videos.add(new Video(id, title, item, no_of_copies, runtime, director, genre, year));
                                System.out.println(videos);
                                System.out.println("Chose what NewItem to add:(a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "d" -> {
                                System.out.print("Enter an the cds identification number: ");
                                int id = input.nextInt();
                                input.nextLine();
                                System.out.print("Enter name of the cd: ");
                                String title = input.nextLine();
                                System.out.print("Is this cd available or not available? ");
                                String item = input.nextLine();
                                System.out.print("Enter number of copies: ");
                                int no_of_copies = input.nextInt();
                                System.out.print("Enter Runtime: ");
                                double runtime = input.nextDouble();
                                input.nextLine();
                                System.out.print("Enter Artist: ");
                                String artist = input.nextLine();
                                System.out.print("Enter Genre: ");
                                String genre = input.nextLine();
                                cds.add(new CD(id, title, item, no_of_copies, runtime, artist, genre));
                                System.out.println(cds);
                                System.out.println("Chose what NewItem to add:(a)book, (b)journal, (c)video or (d)cd");
                            }
                            default -> System.out.print("Invalid option entered try again:");
                        }
                    }
                    }
                    break;
                //Allows User to choose an Item in the library to borrow
                case 2:
                    System.out.println("Borrow which of the following items: (a)book, (b)journal, (c)video or (d)cd" + "\nType back at anytime to go back to main menu");
                { loop1:
                    while (true) {
                        String user1 = input.next().toLowerCase(Locale.ROOT);
                        switch (user1) {
                            case "a" -> {
                                System.out.println("NOTE: Type the BOOK row you want to borrow starting from 0" + "\nBook(s) " + books);
                                System.out.print("Chose row: ");
                                //try catch exceptions is used in case the user inputs the wrong option
                                try {
                                    books.get(input.nextInt()).borrowed();
                                    System.out.println(books);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Borrow which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "b" -> {
                                System.out.println("NOTE: Type the JOURNAL row you want to borrow starting from 0" + "\nJournal(s) " + journal);
                                System.out.print("Chose row: ");
                                try {
                                    journal.get(input.nextInt()).borrowed();
                                    System.out.println(journal);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Borrow which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "c" -> {
                                System.out.println("NOTE: Type the VIDEO row you want to borrow starting from 0" + "\nVideo(s) " + videos);
                                System.out.print("Chose row: ");
                                try {
                                    videos.get(input.nextInt()).borrowed();
                                    System.out.println(videos);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Borrow which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "d" -> {
                                System.out.println("NOTE: Type the CD row you want to borrow starting from 0" + "\nCD(s) " + cds);
                                System.out.print("Chose row: ");
                                try {
                                    cds.get(input.nextInt()).borrowed();
                                    System.out.println(cds);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Borrow which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "back" -> {
                                System.out.println("Main menu " + mainMenu);
                                break loop1;
                            }
                            default -> System.out.print("Invalid option entered try again:");
                        }
                    }
                    }
                    break;
                //Allows User to return an Item in the library
                case 3:
                    System.out.println("Return which of the following items: (a)book, (b)journal, (c)video or (d)cd" + "\nAlso type back at anytime to go back to main menu");
                { loop2:
                    while (input.hasNext()) {
                        String ok1 = input.next();
                        switch (ok1) {
                            case "a" -> {
                                System.out.println("NOTE: Type the book row you want to return from starting from 0" + "\nBook(s) " + books);
                                System.out.print("Chose row: ");
                                try {
                                    books.get(input.nextInt()).returnedItem();
                                    System.out.println(books);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Return which of the following items: (a)book, (b)journal, (c)video or (d)cd??");
                            }
                            case "b" -> {
                                System.out.println("NOTE: Type the Journal row you want to return starting from 0" + "\nBook(s) " + journal);
                                System.out.print("Chose row: ");
                                try {
                                    journal.get(input.nextInt()).returnedItem();
                                    System.out.println(journal);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Return which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "c" -> {
                                System.out.println("NOTE: Type the VIDEO row you want to return starting from 0" + "\nBook(s) " + videos);
                                System.out.print("Chose row: ");
                                try {
                                    videos.get(input.nextInt()).returnedItem();
                                    System.out.println(videos);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Return which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "d" -> {
                                System.out.println("NOTE: Type the CD row you want to return starting from 0" + "\nBook(s) " + cds);
                                System.out.print("Chose row: ");
                                try {
                                    cds.get(input.nextInt()).returnedItem();
                                    System.out.println(cds);
                                } catch (Exception e) {
                                    System.out.println("Wrong row picked");
                                }
                                System.out.println("Return which of the following items: (a)book, (b)journal, (c)video or (d)cd");
                            }
                            case "back" -> {
                                System.out.println("Main menu " + mainMenu);
                                break loop2;
                            }
                            default -> System.out.println("Invalid option entered try again:");
                        }
                    }
                    }
                    break;
                //Displays all the contents in the library
                case 4:
                    System.out.println("BOOK\n" + books);
                    System.out.println("JOURNAL\n" + journal);
                    System.out.println("VIDEO\n" + videos);
                    System.out.println("CD's\n" + cds);
                    System.out.println("\n" + mainMenu);
                    break;
                case 5:
                    break loop;
                default:
                    System.out.print("Invalid number try again: ");
            }
        }
    }
}

