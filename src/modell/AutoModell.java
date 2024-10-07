package modell;

import javax.swing.JOptionPane;

public class AutoModell {
    private String szin;
    private String rendszam;
    private String extra;

    public AutoModell(){
        this.szin = JOptionPane.showInputDialog("Szine:");
        this.rendszam = JOptionPane.showInputDialog("Rendszám:");
        this.extra = JOptionPane.showInputDialog("Extra:");
    }
    public String getSzin() {
        return szin;
    }
    public String getRendszam() {
        return rendszam;
    }
    public String getExtra() {
        return extra;
    }
    public void kiir(String uzenet){
        JOptionPane.showMessageDialog(null, uzenet);
    }
}
