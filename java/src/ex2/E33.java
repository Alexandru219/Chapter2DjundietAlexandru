package ex2;
import java.util.Scanner;
public class E33 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        int w;
        int h;
        int bMI;

        System.out.print ("Enter  weight in Pounds: ");
        w = input.nextInt();
        System.out.print ("Enter height in Inches: ");
        h = input.nextInt();
        bMI = (w * 703) / (h * h);
        System.out.printf ("Your Body Mass Index (BMI) is %d\n\n", bMI);

        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");

    }
}

