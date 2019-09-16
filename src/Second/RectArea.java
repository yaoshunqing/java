package Second;

import java.util.Scanner;


public class RectArea {
    public static void main(String[] args) {
        System.out.print("Please input the coordinate of point! ");
        System.out.print("(You can enter each x and y in sequence.) \n");
        double x1, y1, x2, y2, x3, y3;
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        double e1,e2,e3;
        e1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        e2 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        e3 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));

        double s = (e1+e2+e3)/2;
        double area = Math.sqrt(s*((s-e1)*(s-e2)*(s-e3)));
        System.out.print("The area of Rectangular is : " + area );


    }


}
