import java.util.Scanner;
public class Repition{
    public static String withoudBuiltIn(String input){
        String outputstr = "";
        String currentsection = "";
        for(int i =0;i<input.length();i++){
            char currentchar = input.charAt(i);
            if(currentchar>='a'&&currentchar<='z'){
                currentsection+=input.charAt(i);
            }
            if(currentchar>='0'&&currentchar<='9'){
                int repeatcount = currentchar-'0';
                for(int j =0;j<repeatcount;j++){
                    outputstr+=currentsection;
                }
                currentsection="";
            }
            
        }
        outputstr+=currentsection;
        return outputstr;
    }
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Without builtin : ");
        System.out.println("Enter the input : ");
        String input = in.nextLine();
        String result = withoudBuiltIn(input);
        System.out.println("Result : "+result);
    }
}