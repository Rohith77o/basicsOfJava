class Book{
    String title;
    float price;
    Book(){
        title = "Espresso";
        price = 50.0f;
    }
    void display(){
        System.out.println("The title of the book : "+title);
        System.out.println("the price of the book : "+"$"+price);
    }
    
    public static void main(String[]args){
        Book obj = new Book();
        obj.display();
    }
}