package EpamModule_task3;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args)
{
    Calculate cc= new Calculate();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int operand1= sc.nextInt();
    int operand2= sc.nextInt();
    System.out.println("enter opertion to be performed");
    char operation = sc.next().charAt(0);
    float result = cc.operation(operation, operand1,operand2);
    System.out.println(result);
}
}
