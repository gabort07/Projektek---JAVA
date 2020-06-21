/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teglatest;

/**
 *
 * @author gabor
 */
public class TeglatestMain {

    public static void main(String[] args) {
        Teglatest kocka = new Teglatest(10);
        System.out.println(kocka.terfogat()); // 1000.0
        Teglatest negyzetesOszlop = new Teglatest(10, 20);
        System.out.println(negyzetesOszlop.terfogat()); // 2000.0
        Teglatest tegla = new Teglatest(10, 20, 30);
        System.out.println(tegla.terfogat()); // 6000.0
        System.out.println(tegla.getA()); // 10.0
        System.out.println(tegla.getB()); // 20.0
        System.out.println(tegla.getC()); // 30.0
    }
    

}
        Teglatest tegla = new Teglatest();
        tegla.a = 24.68;
        tegla.b = 12.34;
        tegla.c = 0.36;
        System.out.println(tegla.terfogat());
        System.out.println(tegla.felszin());