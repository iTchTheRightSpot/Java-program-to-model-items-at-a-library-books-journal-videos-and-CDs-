JAVA HOMEWORK ASSIGNMENT 3 FOR COMP 2477 AT LAKEHEAD UNIVERISTY 
# Java-program-to-model-items-at-a-library-books-journal-videos-and-CDs-
Using an inheritance hierarchy, design a Java program to model items at a library (books, journal
articles, videos and CDs.) It is a simplified libray system with limited functionality. Have an
abstract superclass called Item and include common information that the library must have for
every item (such as unique identification number, and a title). No actual objects of type Item will
be created - each actual item will be an object of a (non-abstract) subclass. Place item-typespecific
behavior in subclasses (such as a video's year of release, a CD's musical genre, or a
book's author). A
Assume that titles are unique. Two different objects will have different titles.
More in detail:
1. Implement an abstract superclass called Item and define all common operations on this class
(constructors, getters, setters, borrowed, returned, toString, etc). Have private data for each
item: identification number, title, whether the item is available in the library or not, and the
number of available copies.
2. Implement an abstract subclass of Item named WrittenItem and define all common operations
on this class. Add private data for author.
3. Implement 2 subclasses of WrittenItem: Book and JournalPaper.
3.1. Class Book: no new private data. When needed, override/overload methods from the
3.2. Class JournalPaper: add private data for year published. When needed,
override/overload methods from the superclass.
4. Implement another abstract subclass of Item named MediaItem and define all common
operations on this class. Add private data for runtime (double).
5. Implement 2 subclasses of MediaItem: Video and CD.
5.1. Class Video: added private data for director, genre and year released. When needed,
override/overload methods from the superclass.
5.2. Class CD: added private data for artist and genre. When needed, override/overload
methods from the superclass.
Write the definitions of these classes and a client program showing them in use. Use an
ArrayList as the data structure holding the library's collection (for example, 3 books, 4 journal
articles, 2 videos and 3CDs). Interact with the user by providing a menu including different
options. For example:
Option 1:(AddNewItem),
Option 2: (BorrowItem),
Option 3: (ReturnItem),
Option 4: (DisplayAllLibraryItems),
Option 5: (exit).
For instance, ask the user to indicate which option they wish to perform, they can respond by
number, you read the number and ask questions to fill in the required fields. As an example, if
the option is 1, then you ask information on the item to be added (book, Cd, ..), followed by
questions to fill in the required fields of that item. Display the updated ArrayList after executing
each option.
