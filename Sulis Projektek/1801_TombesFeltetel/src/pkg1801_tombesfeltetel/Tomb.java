package pkg1801_tombesfeltetel;

/**
 *
 * @author gabesz
 */
public class Tomb {

    private double[] tomb;

    public Tomb(double[] tomb) {
        if (tomb == null) {
            this.tomb = new double[0];
        } else {
            this.tomb = tomb;
        }
    }

    public int getElemszam() {
        return this.tomb.length;
    }

    public double getOsszeg() {
        double osszeg = 0;
        for (double i : this.tomb) {
            osszeg += i;
        }
        return osszeg;
    }

    public String toString() {
        String numb = "";
        if (this.tomb.length == 0) {
            return numb;
        } else {
            for (double i : this.tomb) {
                numb += i + " ";
            }
        }
        return numb.substring(0, numb.lastIndexOf(" "));
    }

    public void kivalogat(Feltetel f) {
        if (this.tomb.length == 0) {
            System.out.print("");
        } else {
            for (double numb : this.tomb) {
                if (f.vizsgalat(numb)) {
                    System.out.print(numb + " ");
                }
            }
        }
    }

    public double getAtlag() {
        double osszeg = 0;
        for (double i : this.tomb) {
            osszeg += i;
        }
        return osszeg / this.tomb.length;
    }

    public int megszamlal(Feltetel f) {
        int counter = 0;
        for (double i : this.tomb) {
            if (f.vizsgalat(i)) {
                counter++;
            }
        }
        return counter;
    }

    public int minIndex() {
        if (this.tomb.length == 0) {
            return -1;
        }
        int minIndex = 0;
        double min = this.tomb[0];
        for (int i = 0; i < this.tomb.length; i++) {
            if (this.tomb[i] < min) {
                min = this.tomb[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int maxIndex() {
        if (this.tomb.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        double max = this.tomb[0];
        for (int i = 0; i < this.tomb.length; i++) {
            if (this.tomb[i] > max) {
                max = this.tomb[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public double min() {
        double min = 0;
        if (this.tomb.length == 0) {
            return min;
        } else {
            min = this.tomb[0];
            for (double numb : this.tomb) {
                if (numb < min) {
                    min = numb;
                }
            }
        }
        return min;
    }

    public double max() {
        double max = 0;
        if (this.tomb.length == 0) {
            return max;
        } else {
            max = this.tomb[0];
            for (double numb : this.tomb) {
                if (numb > max) {
                    max = numb;
                }
            }
        }
        return max;
    }

    public boolean vanIlyen(Feltetel f) {
        boolean whatIs = false;
        for (double numb : this.tomb) {
            if (f.vizsgalat(numb)) {
                whatIs = true;
            }
        }
        return whatIs;
    }

    public boolean mindIlyen(Feltetel f) {
        boolean whatIs = true;
        if (this.tomb.length == 0) {
            whatIs = false;
        }
        for (double numb : this.tomb) {
            if (!f.vizsgalat(numb)) {
                whatIs = false;
            }
        }
        return whatIs;
    }

    public int elsoIlyenSzam(double keresett) {
        int index = -1;
        for (int i = 0; i < this.tomb.length; i++) {
            if (this.tomb[i] == keresett) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int utolsoIlyenSzam(double keresett) {
        int index = -1;
        for (int i = this.tomb.length - 1; i >= 0; i--) {
            if (this.tomb[i] == keresett) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int elsoIlyen(Feltetel f) {
        int index = -1;
        for (int i = 0; i < this.tomb.length; i++) {
            if (f.vizsgalat(this.tomb[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int utolsoIlyen(Feltetel f) {
        int index = -1;
        for (int i = this.tomb.length - 1; i >= 0; i--) {
            if (f.vizsgalat(this.tomb[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
}
