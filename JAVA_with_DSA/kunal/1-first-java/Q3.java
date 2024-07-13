import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float Si,P,R,T;

        System.out.print(" Enter principal:");
        P=sc.nextInt();

        System.out.print(" Enter Rate:");
        R=sc.nextInt();

        System.out.print(" Enter time:");
        T=sc.nextInt();


Si=P*R*T/100;
System.out.println("Simple Interest:"+Si);
    }
}
