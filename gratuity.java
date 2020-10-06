import java.util.Scanner;

public class gratuity {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);        
        double stotal, tip;        
        System.out.print("Please enter your bill: ");        
        stotal = input.nextDouble();
        tip = (stotal * .15);        
        double res = (stotal + tip);        
        System.out.println(tip + " as gratuity and " + res + " as total");    
    }
}
