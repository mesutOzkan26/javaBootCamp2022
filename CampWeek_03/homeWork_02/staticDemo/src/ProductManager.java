public class ProductManager {
    public void add(Product product){
        // ProductValidator validator = new ProductValidator();
        if(ProductValidator.isValid(product)) {
            System.out.println("Ürünler Eklendi...");
        }else {
            System.out.println("Ürün Bilgileri Eklenemedi...");
        }

        //  ProductValidator validator = new ProductValidator();
        // validator.bisey();
    }
}