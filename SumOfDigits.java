import java.util.*;
public class SumOfDigits {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
       int temp=num;
       int sum=0;
       
       while(temp>0){
        int digit=temp % 10;
        sum=sum+digit;
        temp=temp/10;
       }
       System.out.println("The sum of "+num+" : "+sum);
       scan.close();
    }
}
