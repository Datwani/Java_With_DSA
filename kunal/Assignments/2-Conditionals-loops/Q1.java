import java.util.Scanner;

//Area Of Circle Java Program
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final var pi= 3.14F;
        System.out.println("Enter radius:");
        int ra=sc.nextInt();

        float Area= pi*(ra*ra);

        System.out.println(Area);

    }
}
