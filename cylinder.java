import java.util.Scanner;

public class cylinder {
    public static void main(String [] args){   
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("insert the radius of a cylinder: ");
        double rad = input.nextDouble();
        System.out.print("insert the length of a cylinder: ");
        double len = input.nextDouble();
        double area = rad * rad * PI;
        double vol = area * len;
        System.out.println(" area: " + area + " volume: " + vol);
    }
}
