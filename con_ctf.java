import java.util.Scanner;
public class con_ctf {    
    public static void main(String [] args){        
        Scanner input = new Scanner(System.in);        
        float cel;        
        System.out.print("Enter a Number of Celcius:");        
        cel = input.nextFloat();        
        float res = (((cel / 5)*9)+32);        
        System.out.println(res + " F");
}
}