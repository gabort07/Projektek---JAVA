/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deepdive_31;

import java.util.Scanner;

/**
 *
 * @author borde
 */
public class TestCodeIOMain {
    public static void main(String[] args) {
        ShippingCostCalculator scc = new ShippingCostCalculator();
        
        int price = 15000;
        double weight = 6;
        
        int cost = scc.calculate(price, weight);
        System.out.println(cost);
    }
}
