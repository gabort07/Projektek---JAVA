/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg131_adventure;

import java.util.Scanner;

/**
 *
 * @author Pasztuhov Dániel, StudiCore Kft.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Door d = new Door(true);
        System.out.println("Üdvözöllek kalandozó!");
        String command;
        do {
            System.out.println("Előtted egy ajtó van, ami "+(d.isOpen()?"nyitva van":"be van csukva")+". Mit csinálsz?");
            command = sc.nextLine();
            switch (command) {
                case "nyit": d.open(); break;
                case "csuk": d.close(); break;
                case "kizar": d.unlock(""); break;
                case "bezar": d.lock(""); break;
                case "kilep": System.out.println("Viszlát!"); break;
                default: System.out.println("Nem értem."); break;
            }
        } while (!command.equals("kilep"));
    }
}
