/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ASUS
 */
public class FoodItem extends FoodComponent {
    String item; 
    double price;
    public FoodItem(String item, double price){
        this.item=item; 
        this.price=price;
    }
    @Override
    public double getPrice(){
        return price;
    }
    public String getItem(){
        return item;
    }
    @Override
    public void print(int level){
    String t= "";
    for(int i=0; i<level; i++){
        t+= "\t";
    }
    System.out.println(t + "FoodItem: " + this.getItem() + ", " + this.getPrice());
    
    }
}