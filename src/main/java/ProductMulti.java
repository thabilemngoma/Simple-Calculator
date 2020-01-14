public class ProductMulti {
    public static void main(String[] args) {
        System.out.println("Multiply: " +  Product(1, 3, 5));

    }
    public static  int Product(int ... x) {
        int product = 1;
        for (int a: x){
            product = product * a;
        }
        return  product;
    }

}










