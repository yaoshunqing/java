package Second;

import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径： ");
        double r = input.nextDouble();
        double area = r * r * 3.14159;
        System.out.println("这个圆的面积为： " + area);



    }
}
