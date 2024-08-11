package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Initial part of program");
        int a = sc.nextInt();
        try{
            int ans = 10/a;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println("I have catch the Arithmetic Exception"+e.getMessage());
            System.out.println("Dont use 0");
        }


        System.out.println("Later part of program");
    }
}
