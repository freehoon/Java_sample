public class Product {
    private String name;
    private int price;
    boolean isSell;

    private Product(ProductBuilder productBuilder){
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.isSell = productBuilder.isSell;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSell() {
        return isSell;
    }

    public static class ProductBuilder{
        private String name;
        private int price;
        boolean isSell;

        public ProductBuilder(String name, int price){
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setIsSell(boolean isSell){
            this.isSell = isSell;
            return this;
        }

        public Product build(){
            return new Product(this);
        }

    }
}
