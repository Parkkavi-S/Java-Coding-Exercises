import java.util.*;
public class ReverseDigit {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
       int temp=num;
       int rev=0;
       
       while(temp>0){
        int digit=temp % 10;
        rev=rev*10+ digit;
        temp=temp/10;
       }
       System.out.println("The reverse of "+num+" : "+rev);
       scan.close();
    }
}
