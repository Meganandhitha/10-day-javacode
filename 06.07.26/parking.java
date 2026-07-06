import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrs = sc. nextInt();
        int cost ;
        if(hrs<=2){
            cost = (hrs%20);
        }
        else if(hrs <= 5){
            cost = 40 +(hrs-2)*15;
        }
        else{
            cost = 40+45+(hrs-5)*10;
        }
        System.out.print(cost);
    }
}
