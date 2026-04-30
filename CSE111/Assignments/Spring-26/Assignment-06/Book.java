public class Book extends Product{
    public String ISBN;
    public String Publisher;

    public Book(int id,String title,int price,String isbn,String Publisher){
        super(id,title,price);
        this.ISBN=isbn;
        this.Publisher=Publisher;
    }
    public String printDetail(){
        return getIdTitlePrice()+" ISBN: "+ISBN+" Publisher: "+Publisher;
    }
}
