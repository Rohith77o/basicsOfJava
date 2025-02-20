public class Movie{
    String director;
    String title;
    float price;
    Movie(String title,String director,float price){
        this.title=title;
        this.director=director;
        this.price = price;
    }
    void display(){
        System.out.println("Title : "+title);
        System.out.println("Director : "+ director);
        System.out.println("Ticket : "+price);
    }
    
    public static void main(String[]args){
        Movie obj = new Movie("John Wick","Chad Stahelski",50.0f);
        obj.display();
    }
}