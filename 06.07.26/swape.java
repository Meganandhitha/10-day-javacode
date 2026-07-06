import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] temp =  new int[a];
        for (int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int r = sc.nextInt();
        for(int i=0; i<a;i++){
            temp[i]=arr[(i+r)%a];
        }
        for(int i =0;i<a;i++){
            System.out.print(temp[i]);
        }
        
    }
}
