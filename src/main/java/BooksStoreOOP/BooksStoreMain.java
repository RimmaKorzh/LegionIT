package BooksStoreOOP;


public class BooksStoreMain {
    public static void main(String[] args) {



    AudioBook book1 = new AudioBook("Harry Potter", "Rowling", 1, 10.5, false, "mp3", 128, "Smith");
    EBook book2 = new EBook("Anna k", "L.Tolstoy", 2, 20, true, "http...");



   book1.setUsdPrice(1);
   book2.setUsdPrice(1);

    book1.printBookDetails();
    book2.printBookDetails();


    }
}
