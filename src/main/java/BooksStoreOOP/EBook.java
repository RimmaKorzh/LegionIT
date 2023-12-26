package BooksStoreOOP;

public class EBook extends Book {
    public EBook(String bookName, String authorName, int id, double price, boolean isAvailable, String url) {
        super(bookName, authorName, id, price, isAvailable);
        this.downLoadURL=url;
    }

    public String getDownLoadURL() {
        return downLoadURL;
    }

    public void setDownLoadURL(String downLoadURL) {
        this.downLoadURL = downLoadURL;
    }

    String downLoadURL;

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("URL:" +downLoadURL);
    }


    }

