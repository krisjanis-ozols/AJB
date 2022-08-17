import java.util.Scanner;

public class ajb21 {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a:");
        a=sc.nextInt();

        System.out.println("Enter value b:");
        b=sc.nextInt();

        System.out.println("is "+ a +" equal to "+ b +"? - "+(a==b));
        System.out.println("is "+ a +" less than "+ b +"? - "+(a<b));
        System.out.println("is "+ a +"  less or equal to "+ b +"? - "+(a<=b));
        System.out.println("is "+ a +" greater than "+ b +"? - "+(a>b));
        System.out.println("is "+ a +" greater or equal to "+ b +"? - "+(a>=b));

    }
}
