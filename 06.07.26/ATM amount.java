import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        int n500 = 0, n200 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0;

        if (amount >= 500) {
            n500 = amount / 500;
            amount = amount % 500;
        }

        if (amount >= 200) {
            n200 = amount / 200;
            amount = amount % 200;
        }

        if (amount >= 100) {
            n100 = amount / 100;
            amount = amount % 100;
        }

        if (amount >= 50) {
            n50 = amount / 50;
            amount = amount % 50;
        }

        if (amount >= 20) {
            n20 = amount / 20;
            amount = amount % 20;
        }

        if (amount >= 10) {
            n10 = amount / 10;
            amount = amount % 10;
        }

        System.out.println("500-" + n500);
        System.out.println("200-" + n200);
        System.out.println("100-" + n100);
        System.out.println("50-" + n50);
        System.out.println("20-" + n20);
        System.out.println("10-" + n10);

        sc.close();
    }
}

or 
import java.util.*;

class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(500 <= a){
            System.out.print("500 = "+( a / 500));
            a = a % 500;
        }
        else if(200 <= a){
            System.out.print("200= "+(a/ 200));
            a = a% 200;
        }
        else if(100 <= a){
            System.out.print("100 = "+( a/ 100));
            a = a% 100;
        }
        else if(50 <= a){
            System.out.print("50 = "+ (a / 50));
            a = a% 50;
        }
        else if(20 <= a){
            System.out.print("20 = "+( a/20));
            a= a%20;
        }
        else if(10 <= a){
            System.out.print("10 = "+ ( a/10));
            a = a%10;
        }
        else if(a>0){
            System.out.println(a);
        }
    }
}
