/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1401_amoba;

/**
 *
 * @author Dániel
 */
public class Tabla {

    public static final int JATEKOS_1 = 1;
    public static final int JATEKOS_2 = 2;
    public static final int URES = 0;
    public static final int ROSSZ = -1;
    private int[][] tabla = new int[3][3];
   

    public Tabla() {
    }

    public int[][] getTabla() {
        return tabla;
    }

    public boolean helyes(Pozicio lepes) {
        if(tabla[lepes.getSor()][lepes.getOszlop()] ==URES)
            return true;
        return lepes.getSor() >= 0
                && lepes.getSor() <3
                && lepes.getOszlop() >= 0
                && lepes.getOszlop() <3;
                
    }

    /**
     * a Pozicioból kiolvasott koordináták helyére elhelyezi a játékos számát
     *
     * @param lepes
     * @param jatekos
     */
    public void feltesz(Pozicio lepes, int jatekos) {
        
        if (jatekos>2)
            jatekos=URES;
        tabla[lepes.getSor()][lepes.getOszlop()] = jatekos;
    }

    public boolean nyert(int jatekos) {
        for (int sor = 0; sor < this.tabla.length; sor++) {
            for (int oszlop = 0; oszlop < this.tabla[sor].length; oszlop++) {
                if (this.tabla[sor][0] == jatekos && this.tabla[sor][1] == jatekos && this.tabla[sor][2] == jatekos
                        || this.tabla[0][oszlop] == jatekos && this.tabla[1][oszlop] == jatekos && this.tabla[2][oszlop] == jatekos) {
                    return true;
                }
            }
        }
        if (this.tabla[0][0] == jatekos && this.tabla[1][1] == jatekos && this.tabla[2][2] == jatekos) {
            return true;
        }

        if (this.tabla[2][0] == jatekos && this.tabla[1][1] == jatekos && this.tabla[0][2] == jatekos) {
            return true;
        }
        return false;
    }

    public boolean dontetlen() {
        for (int sor = 0; sor < this.tabla.length; sor++) {
            if (this.tabla[sor][0] == URES || this.tabla[sor][1] == URES || this.tabla[sor][2] == URES) {
                    return false;
                }
            }
        
        return true;
    }

    public int getMezo(Pozicio lepes) {
        if(!helyes(lepes))
            return ROSSZ;
        
        return tabla[lepes.getSor()][lepes.getOszlop()];
    }
}
