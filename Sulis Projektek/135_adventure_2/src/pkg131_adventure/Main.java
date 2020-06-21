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
        Scene startScene = new Scene("Kezdőpont");
        Scene otherScene = new Scene("Másik helyszín");
        Door d = new Door(startScene, otherScene, true);
        startScene.setDoor(d);
        otherScene.setDoor(d);
        Scene currentScene = startScene;
        System.out.println("Üdvözöllek kalandozó!");
        String command;
        do {
            System.out.println("\n"+currentScene.getDescription()+".\nMit csinálsz?");
            command = sc.nextLine();
            switch (command) {
                case "nyit": d.open(); break;
                case "csuk": d.close(); break;
                case "kizar":
                    if (d.unlock("")) {
                        System.out.println("Kinyitod az ajtón a zárat.");
                    } else {
                        System.out.println("Nem tudod kinyitni az ajtót.");
                    }
                    break;
                case "bezar":
                    if (d.lock("")) {
                        System.out.println("Bezárod az ajtót.");
                    } else {
                        System.out.println("Nem tudod bezárni az ajtót.");
                    }
                    break;

                case "atmegy": 
                    Scene newScene = currentScene.goThrough();
                    if (newScene != currentScene) {
                        System.out.println("Átmentél a másik szobába.");
                        currentScene = newScene;
                    } else {
                        System.out.println("Nem tudsz átmenni a másik szobába.");
                    }
                    break;
                case "kilep": System.out.println("Viszlát!"); break;
                default: System.out.println("Nem értem."); break;
            }
        } while (!command.equals("kilep"));
    }
}
