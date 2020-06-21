/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2001_ehetoe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author gaborT
 */
public class Aru {

    private LocalDateTime lejarat;
    private LocalDateTime felbontas;

    public LocalDateTime lejaratControll(String lejarat) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.");
        LocalDateTime time = null;
        try {
            LocalDate date = LocalDate.parse(lejarat, dtf);
            time = date.atTime(LocalTime.MIN);
        } catch (DateTimeParseException ex) {
            System.out.println("Nem megfelelő formátum.");
            System.exit(0);
        }
        return time;
    }

    public LocalDateTime felbontasControll(String felbontas) {
        if (felbontas.equalsIgnoreCase("-")) {
            return null;
        } else {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm");
            LocalDateTime time = null;
            try {
                LocalDateTime date = LocalDateTime.parse(felbontas, dtf);
                time = date;
            } catch (DateTimeParseException ex) {
                System.out.println("Nem megfelelő formátum.");
                System.exit(0);
            }
            return time;
        }
    }

    public boolean eheto(LocalDateTime vizsgalat) {
        if (felbontas == null) {
            if (vizsgalat.isBefore(lejarat.plusDays(10))) {
                return true;
            }
        } else {
            if (!vizsgalat.isAfter(lejarat.plusDays(10))
                    && !vizsgalat.isAfter(felbontas.plusHours(72))) {
                return true;
            }
        }
        return false;
    }

    public Aru() {
    }

    public Aru(LocalDateTime lejarat) {
        this.lejarat = lejarat.withHour(23).withMinute(59).withSecond(0).withNano(0);
    }

    public void setFelbontas(LocalDateTime felbontas) {
        if (felbontas != null) {
            this.felbontas = felbontas.withSecond(0).withNano(0);
        } else {
            this.felbontas = null;
        }
    }

    public void setLejarat(LocalDateTime lejarat) {

        this.lejarat = lejarat.withHour(23).withMinute(59).withSecond(0).withNano(0);
    }

    public LocalDateTime getLejarat() {
        return this.lejarat;
    }

    public LocalDateTime getFelbontas() {
        return this.felbontas;
    }

}
