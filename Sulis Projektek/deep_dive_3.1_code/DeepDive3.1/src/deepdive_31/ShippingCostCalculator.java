/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepdive_31;

/**
 *
 * @author borde
 */
public class ShippingCostCalculator {
    
    
    public int calculate(int price, double weight) {
        int cost = 0;
        if (weight <= 2){
            cost = 2000;
        } else if (weight <= 5) {
            cost = 3000;
        } else {
            cost = (int)weight*1000;
        }
        
        if (price >= 15000) {
            cost = 0;
        }
        
        return cost;
    }
    
    public String costToString(int cost, Currency c) {
        return cost + " " + c.getSign();
    }
    
}
