import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
       int temp=num;
       int sum=0;
       
       while(temp>0){
        int digit=temp % 10;
        sum=sum+ (digit*digit*digit);
        temp=temp/10;
       }
       System.out.println(sum);
       System.out.println(num);
       if (sum==num){
        System.out.println(num+" is ARMSTRONG number");
       }
       else{
        System.out.println(num+ " is not ARMSTRONG number");
       }
       scan.close();
    }
}

