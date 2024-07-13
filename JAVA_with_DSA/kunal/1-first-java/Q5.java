import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;

        System.out.print("Enter First Number:");
        num1=sc.nextInt();

        System.out.print("Enter second Number:");
        num2=sc.nextInt();

        if (num1>num2)
        {
            System.out.println(num1+" Bigger than "+num2);
        }else
        {
            System.out.println(num2+" Bigger than "+num1);
        }
    }
}
