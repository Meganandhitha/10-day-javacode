import java.util.Scanner;

class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr= new int[a];
        int max=arr[0];
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<a;i++){
            if(arr[i]>max){
                sec=max;
                max=arr[i];
                
            }
            else if(arr[i]>sec && arr[i]!=max){
                sec=arr[i];
            }
            
        }
        System.out.println("Second Number:");
        System.out.print(sec);
        sc.close();
    }
}
