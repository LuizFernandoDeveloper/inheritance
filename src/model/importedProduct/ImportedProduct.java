package model.importedProduct;

import model.product.Product;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(Double customsFee){
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee(){
        return customsFee;
    }
    
    public void setCustomsFee(Double customsFee){
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag(){
        return  super.getName() +" $ "+ totalPrice().toString()+ "(Customs fee: $"+ customsFee.toString() +")";
    }

    public final Double totalPrice(){
        return super.getPrice() + customsFee;
    }

}
