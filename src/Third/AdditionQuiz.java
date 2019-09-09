package Third;

import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " ?\n");

        int e = 0;
        while(e == 0){
            int answer = input.nextInt();
            if (answer == number1 + number2)
            {
                System.out.println("You are right !");
                e = 1;
            }
            else
            {
                System.out.println("You are wrong ! Please do again ！");
            }

        }


    }

}
