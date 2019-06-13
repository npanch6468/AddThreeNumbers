import java.util.Scanner;
public class threeNumbers {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type num1: ");
        int num1 = scan.nextInt();
        System.out.println("Type num2: ");
        int num2 = scan.nextInt();
        System.out.println("Type num3: ");
        int num3 = scan.nextInt();

        System.out.println("The total is : " + (num1 + num2 + num3));
    }
}
