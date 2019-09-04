package First;

import java.util.Scanner;

public class Cramer {
    public static void main(String[] args) {
        System.out.println("please enter the coefficient of x1, y1, x2, y2 : ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double c1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double c2 = input.nextDouble();
        double X, Y;
        X =  (c1 * y2 - x2 * c2) / (x1 * y2 - y1 * x2);
        Y = (x1 * c2 - c1 * x2) / (x1 * y2 - y1 * x2);
        System.out.println("The X and Y are : " + X + " " + Y);

    }



}
