import java.util.Scanner;

public class EuclidClass {
    public static void main(String[] args) {
        System.out.print("Введите первое целое число: ");
        Scanner scan = new Scanner(System.in);
        long number3;
        long number1 = scan.nextLong();  //.nextInt();
        System.out.print("Введите второе целое число: ");
        long number2 = scan.nextLong();//считывает второе число и присваивает значение в number2
        if (number1 >= number2) {
            if ((number1 % number2) != 0) {
                while (number1 % number2 != 0) {
                    number3 = number1;
                    number1 = number2;
                    number2 = number3%number2;
                }
                System.out.println("Наибольший общий делитель равен " + number2);
            } else {
                if (number2 >= number1/number2) {
                    System.out.println("Наибольший общий делитель равен " + number2);
                } else {
                    System.out.println("Наибольший общий делитель равен " + number1/number2);
                }

            }
        } else {
            if ((number2 % number1) != 0) {
                while (number2 % number1 != 0) {
                    number3 = number2;
                    number2 = number1;
                    number1 = number3%number1;
                }
                System.out.println("Наибольший общий делитель равен " + number1);
            } else {
                if (number2 >= number2/number1) {
                    System.out.println("Наибольший общий делитель равен " + number1);
                } else {
                    System.out.println("Наибольший общий делитель равен " + number2/number1);
                }

            }
        }

    }
}
