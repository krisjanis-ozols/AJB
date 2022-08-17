import java.util.Scanner;

public class ajb2_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean b1, b2;

        System.out.println("Enter b1:");
        b1=sc.nextBoolean();

        System.out.println("Enter b2:");
        b2=sc.nextBoolean();

        System.out.println( " Is b1 and b2 equal? - "+ (b1==b2));
    }
}
