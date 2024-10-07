package view;

public class Auto {
    private String rendszam;
    private String szin;
    private String extra;

    @Override
    public String toString() {
        return "Autó: " + "rendszám:" + rendszam + ", szín=" + szin + ", extra=" + extra;
    }

    public Auto(){
        this("AAA-BBB");
    }
    
    public Auto(String rendszam){
        this(rendszam,"fekete");
    }
    
    public Auto(String rendszam, String szin){
        this(rendszam,szin, "nincs");
    }
    
    public Auto(String rendszam, String szin, String extra){
        this.rendszam = rendszam;
        this.szin = szin;
        this.extra = extra;
    }
    
    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
