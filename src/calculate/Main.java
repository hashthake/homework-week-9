package calculate;

import java.util.Scanner;

public class Main extends Calculator{

    public static void main(String[] args) {
        int a;
        int b;
        char c = 0;
        char select;
        do{
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter First Number");
             a = scan2.nextInt();
            System.out.println("Enter Second Number");
             b = scan2.nextInt();
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose symbol +,-,/,* to perform result: ");
            char symbol = scan.nextLine().charAt(0);

            Calculator obj = new Calculator();
            obj.calculateResult(a,b,symbol);
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Do you like more calculation, select 'Y' or 'N' : ");
            select = scan1.nextLine().charAt(0);

        }
        while (select =='Y' || select =='y');
    }
}
