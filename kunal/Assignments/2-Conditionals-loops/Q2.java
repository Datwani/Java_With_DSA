import java.util.Scanner;

//Area Of Triangle
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Base:");
        float base= sc.nextByte();

        System.out.println("Enter Height:");
        float height= sc.nextByte();

        float Area=1*base*height/2;
        System.out.println(Area);
    }
}
