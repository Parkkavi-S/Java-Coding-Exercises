import java.util.*;
public class Factorial {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = scan.nextInt();
    int fact=1;
    for (int i=1; i<num+1; i=i+1){
        fact=fact*i;
    }
    System.out.println("The Factorial of "+num +" : "+ fact);
    scan.close();
    }
}
