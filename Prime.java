import java.util.*;
class Prime{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = scan.nextInt();
    if (num>1){
        if (num==2){
            System.out.println(num+" is a even prime number");
        }
        else if(num%2==0){
            System.out.println(num+" is not a prime.");
        }
        else{
            System.out.println(num+" is prime");
        }
    }
    else{
        System.out.println(num+" is not prime");
    }
scan.close();
    }
}