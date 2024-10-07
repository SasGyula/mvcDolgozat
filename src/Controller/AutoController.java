package Controller;

import modell.AutoModell;
import view.Auto;

public class AutoController {
    AutoModell m;
    Auto auto;
    public AutoController(){
        this.m = new AutoModell();
        this.auto = new Auto(m.getRendszam(), m.getSzin(), m.getExtra());
        this.m.kiir(this.auto.toString());
    }
}
