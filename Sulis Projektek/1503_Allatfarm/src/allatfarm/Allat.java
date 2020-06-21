package allatfarm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabesz
 */
public abstract class Allat {

    protected int kor;

    public Allat() {
    }

    public Allat(int kor) {
        this.kor = kor;
    }

    public abstract String hang();

    public abstract String bemutatkozas();

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

}
