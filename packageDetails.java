import BookDetails.book1;

public class packageDetails {
    public static void main(String args[]) {
        book1 b1 = new book1("ML", "Lokesh", 2020, "Disha", 1000);
        b1.show();
        book1 b2 = new book1("English", "Kartik", 2008, "Disha", 500);
        b2.show();
    }
}
