import java .util.Scanner;
class Student{
    String Name;
    String Id;
    
    public Student(String Name, String Id){
        this.Name=Name;
        this.Id= Id;
    }
    void report(){
        System.out.println(" Student : "+Name);
        System.out.println("Student Id : "+ Id);
    }
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Student[] StudentList= new Student[5];
        for(int i = 0; i< 5;i++){
            System.out.print("Enter the student's name("+(i+1)+") : ");
            String Name = in.nextLine();
            System.out.print("Enter the student's Id : ");
            String Id = in.nextLine();
            StudentList[i] = new Student(Name,Id);
        }
        for(int i = 0; i<5;i++){
            StudentList[i].report();
        }
    }
}