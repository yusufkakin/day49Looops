import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int inputNumber = scanner.nextInt();
        int incrementer = 1;
        while(incrementer <= 10){
            System.out.println(inputNumber +" x " +incrementer +" = "+(inputNumber * incrementer++));
        }
    }
}
