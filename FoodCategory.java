/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class FoodCategory extends FoodComponent {
    String category;
    public ArrayList<FoodComponent> foods;     
    int level;
    public FoodCategory(String category){
        this.category=category;
        this.foods = new ArrayList<FoodComponent>();
        this.foods=foods;
    }

    
    public void add(FoodComponent n){
        foods.add(n);
    }
    public void remove(FoodComponent n){
        foods.add(n);
    }

    @Override
    public double getPrice(){
        double price=0;
        for (FoodComponent food : foods){
            price+= food.getPrice();
        }
        return price;
    }

    @Override
    public void print(int level){
        
        String t= "";
        for(int i=0; i<level; i++){
            t+= "\t";
    }
        System.out.println(t+"FoodCategory ("+category+", "+getPrice()+") contains:");
        level++;
    
    for(FoodComponent food :foods )    {
            food.print(level);
        }
}

}
