package BookDetails;

public class book1 {
    public String title;
    public String author;
    public int year;
    public String publisher;
    public int price;
    public book1(String title,String author,int year,String publisher,int price){
        this.title=title;
        this.author=author;
        this.year=year;
        this.publisher=publisher;
        this.price=price;
    }
    public void gettitle(){
        System.out.println("Title of book: "+title);
    }
    public void getauthor(){
        System.out.println("Author of book: "+author);
    }
    public void getyear(){
        System.out.println("Year: "+year);
    }
    public void getpublisher(){
        System.out.println("Publisher of book: "+publisher);
    }
    public void getprice(){
        System.out.println("Price of books: "+price);
    }
    public void settitle(String title){
        this.title=title;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void show(){
        gettitle();
        getauthor();
        getyear();
        getpublisher();
        getprice();
    }
}
