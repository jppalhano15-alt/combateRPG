public class Classe {

    String nomeClasse;
    int mod, hp, def;

    Armas arma;

    public Classe(String nomeClasse, int mod, int hp, int def, Armas arma) {
        this.nomeClasse = nomeClasse;
        this.mod = mod;
        this.hp = hp;
        this.def = def;
        this.arma = arma;
    }
    public Armas getArma() {
        return arma;
    }

    static Classe barbaro = new Classe("Barbaro", 2, 32, 12, Armas.acha);
    static Classe druida = new Classe("Druida", 2, 20, 13, Armas.espadaC);
    static Classe ladino = new Classe("Ladino", 3, 25, 15, Armas.rapieira);
    static Classe mago = new Classe("Mago", 3, 18, 13, Armas.cajado);
    static Classe ranger = new Classe("Ranger", 3, 22, 16, Armas.arco);
    
    //metodo que escolhe a classe
    static Classe escolherClasse(int opcao) {
        switch(opcao) {
            case 1:
                return barbaro;
            case 2:
                return druida;
            case 3:
                return ladino;
            case 4:
                return mago;
            case 5:
                return ranger;
            default: 
                return barbaro;
        }
    }

    //getters
    public String getnomeClasse() {
        return nomeClasse;
    }
    public int getMod() {
        return mod;
    }
    public int getHp() {
        return hp;
    }
     public int getDef() {
        return def;
    }

    //setters
    public void setnomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }
    public void setMod(int mod) {
        this.mod = mod;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setDef(int def) {
        this.def = def;
    }
}