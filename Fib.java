import java.util.*;

class Fib{
    public static void main(String args[]){
        System.out.println("====Fib Series====");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        System.out.println("======");
        int F1=0;
        int F2=1;
       for(int i=1; i<=num; i=i+1){
        System.out.println(F1);

            int F3=F1+F2;
            F1=F2;
            F2=F3;
       }
       System.out.println("======");
       scan.close();
    }
}
