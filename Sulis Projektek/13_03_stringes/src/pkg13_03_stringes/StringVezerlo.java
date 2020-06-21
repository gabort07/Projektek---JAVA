/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_03_stringes;

import java.util.Arrays;

/**
 *
 * @author Dániel
 */
public class StringVezerlo {
    
    public static void main(String[] args) {
        System.out.println("[1] == ------------------------------------------------");
        String s = "Java"; // új stringet hozunk létre.
        String t = "Java"; // másik konstans stringet hozunk létre
        String u = "Ja";
        u += "va";
        System.out.print("s és t ");
        if (s == t) {
            System.out.println("azonosak.");
        } else {
            System.out.println("nem azonosak.");
        }
        System.out.print("s és u ");
        if (s == u) {
            System.out.println("azonosak.");
        } else {
            System.out.println("nem azonosak.");
        }
        s += "";
        System.out.print("s és t ");
        if (s == t) {
            System.out.println("azonosak.");
        } else {
            System.out.println("nem azonosak.");
        }
        System.out.println("pedig...: s="+s+" t="+t+" u="+u+"");
        System.out.println();
        System.out.println("[2] equals() ------------------------------------------");
        System.out.println("Tartalmi egyezést az equals() segítségével vizsgálhatunk:");
        System.out.println("s.equals(t)="+s.equals(t)+" s.equals(u)="+s.equals(u)+" s.equals(\"Java\")="+s.equals("Java")+" \"Java\".equals(s)="+"Java".equals(s));
        
        System.out.println();
        System.out.println("[3] + -------------------------------------------------");
        String v = "Ez " + 1 + 2 + " összefűzött " + "string.";
        System.out.println(v);

        System.out.println();
        System.out.println("[4] metódusok -----------------------------------------");
        System.out.println("v=" + v);
        System.out.println("t=" + t);
        u = "java";
        System.out.println("u=" + u);
        System.out.println("v.charAt(6)='"+v.charAt(6)+"'");
        System.out.println("v.compareTo(t)="+v.compareTo(t));
        System.out.println("u.compareToIgnoreCase(t)="+u.compareToIgnoreCase(t));
        System.out.println("v.equals(t)="+v.equals(t));
        System.out.println("u.equalsIgnoreCase(t)="+u.equalsIgnoreCase(t));
        s = "A csapat színe-java itt volt.";
        System.out.println("s="+s);
        System.out.println("s.contains(u)="+s.contains(u));
        System.out.println("s.endsWith(\"volt.\")="+s.endsWith("volt."));
        System.out.println("s.startsWith(\"A Csap\")="+s.startsWith("A Csap"));
        System.out.println("s.indexOf(\"t\")="+s.indexOf("t"));
        System.out.println("s.lastIndexOf(\"t\")="+s.lastIndexOf("t"));
        System.out.println("s.substring(4)="+s.substring(4));
        System.out.println("s.substring(4,10)="+s.substring(4,10));
        System.out.println("\"\".isEmpty()="+("".isEmpty()));
        s.length();
        System.out.println("t.length()="+t.length()+" u.length()="+u.length());
        System.out.println("s.replace(\"csapat\", \"csoport\")="+s.replace("csapat", "csoport"));
        System.out.println("s.split(\" \")="+Arrays.toString(s.split(" ")));
        System.out.println("Integer.parseInt(\"123\")="+Integer.parseInt("123"));
        System.out.println();
        System.out.println("[5] Továbbiak ------------------------------------------------");
        System.out.println("http://docs.oracle.com/javase/8/docs/api/java/lang/String.html");
        String s2 = "4E"; // megadjuk 16-os számrendszerben.
        int szam = Integer.parseInt(s2, 16); 
        System.out.println("16-os számrendszerben "+s2+" 10-esben: "+szam);
        System.out.println("binárisban: " + Integer.toBinaryString(szam));
    }
    
}

