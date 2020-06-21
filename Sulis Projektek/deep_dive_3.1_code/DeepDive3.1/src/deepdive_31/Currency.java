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
public class Currency {
    
    private String sign;
    private String name;
    
    public Currency(String name, String sign) {
        this.sign = sign;
        this.name = name;
    }
    
    public String getSign() {
        return sign;
    }
    
}
