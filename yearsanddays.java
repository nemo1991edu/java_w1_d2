import java.util.Scanner;

public class yearsanddays {
    public static void main(String [] args){   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();
        int years = min / 525600;
        int days = (min % 525600) / 1440;
        System.out.println(" years: " + years + " days: " + days);
    
        }
}
