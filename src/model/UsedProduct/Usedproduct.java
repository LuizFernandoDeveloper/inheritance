package model.UsedProduct;

import java.time.LocalDate;

import model.product.Product;

public class Usedproduct  extends Product{

    private LocalDate manufactureDate;

    public Usedproduct(){
    }

    public Usedproduct(LocalDate manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    public Usedproduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate(){
        return manufactureDate; 
    }

    public void setManufactureDate(LocalDate manufactureDate){
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return  super.getName()+"(used) $ " + super.getPrice().toString() + " (manufacture date: "+  manufactureDate.toString().replaceAll("-", "/") +")";
    }
}
