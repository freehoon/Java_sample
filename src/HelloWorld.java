public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Product p1 = new Product.ProductBuilder("상품명", 10000).setIsSell(true).build();
        System.out.println("P1 : " + p1.getName());
    }
}
