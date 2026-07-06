import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    int mul = 1;
    while(n !=0){
        int r = n%10;
        sum = sum +r;
        mul = mul* r;
        n = n/10;
    }
    int a =  sum+mul;
    if(a == temp){
        System.out.print("Special Number");
    }
    else{
        System.out.println("Not Special Number");
    }
}    
}
