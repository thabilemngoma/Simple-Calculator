import java.util.Scanner;

public class ProductC {
    public static void main (String[] args){
        int product;
        int numA;
        int numB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        numA = sc.nextInt();

        System.out.println("Enter Second Number: ");
        numB = sc.nextInt();

        sc.close();
        product = numA * numB;
        System.out.println("Product of these numbers: "+product);
    }
}
