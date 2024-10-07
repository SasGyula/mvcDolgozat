package view;

public class Auto {
    private String rendszam;
    private String szin;
    private String extra;

    @Override
    public String toString() {
        return "Autó\n " + "Rendszám: " + rendszam + ". Szín: " + szin + ". Extra: " + extra;
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
        if(rendszam.length() == 0){
            this.rendszam = "AAA-BBB";
        }else{
            this.rendszam = rendszam;
        }
        if(szin.length() == 0){
            this.szin = "Fekete";
        }else{
            this.szin = szin;
        }
        if(extra.length() == 0 ){
            this.extra = "Nincs";
        }else{
            this.extra = extra;
        }    
    }
    
    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
