/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1602_bankolas;

/**
 *
 * @author gabesz
 */
public class Bank {

    public BankKartya ujBankKartya(Ugyfel u) {
        
        if (u.getFizetes() < 150000) {
            return new BankKartya(u.getFizetes());
        }
        return new HitelKartya(u.getFizetes(), (u.getFizetes() * 2));
        
    }
}
