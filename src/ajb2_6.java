import java.util.Scanner;

public class ajb2_6 {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a:");
        a=sc.nextInt();

        System.out.println("Enter value b:");
        b=sc.nextInt();

        System.out.println(a==b||a<0&&b>0||a>100&&b>100);
    }
}
