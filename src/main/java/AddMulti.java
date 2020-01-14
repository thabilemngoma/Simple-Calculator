import java.util.Scanner;

public class AddMulti {
    public static void main(String[] args) {
        System.out.println("Addition : " + Add(1, 8, 5));

    }
    public static  int Add(int ... x) {
        int sum = 0;
        for (int i = 0 ; i < x.length; i++){
            sum = sum + x[i];
        }
    return  sum;
    }

}
