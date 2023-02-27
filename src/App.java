
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.UsedProduct.Usedproduct;
import model.importedProduct.ImportedProduct;
import model.product.Product;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> products = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products:");
        Integer numberOfProducts = sc.nextInt();

        for(int i = 0 ; i < numberOfProducts; i++){

            System.out.println("Product #"+i+" data");
            System.out.print("Common, used or imported(c/u/i)");
            char typeProduct = (char) sc.next().charAt(0);
            sc.nextLine();

            if(typeProduct == 'c'){

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product product = new Product(name, price);
                products.add(product);
            }
            else if(typeProduct == 'u'){

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manukfacture date (DD/ MM/ YYYY): ");
                LocalDate date  = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new Usedproduct(name, price, date);
                products.add(product);
            }
            else{
                
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee:");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }
        }

        System.out.println("PRICE TAGS:");

        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        
        sc.close();
    }
}
