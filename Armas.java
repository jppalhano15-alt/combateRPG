public class Armas {

    private String nomeArma;
    private String tipoDano;
    private int danoArma;

    static Armas acha = new Armas("Acha", "Corte", 12); //barbaro
    static Armas espadaC = new Armas("Espada Curta", "Corte", 6); //druida
    static Armas rapieira = new Armas("Rapieira", "Perfuracao", 8); //ladino
    static Armas cajado = new Armas("Cajado", "Impacto", 4); //mago
    static Armas arco = new Armas("Arco e Flecha", "Perfuracao", 6); //ranger

    public Armas(String nomeArma, String tipoDano, int danoArma) {
        this.nomeArma = nomeArma;
        this.tipoDano = tipoDano;
        this.danoArma = danoArma;
    }

    //getters
    public String getnomeArma() {
        return nomeArma;
    }
    public String gettipoDano() {
        return tipoDano;
    }
     public int getdanoArma() {
        return danoArma;
    }

    //setters
    public void setnomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }
    public void settipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }
    public void sett(int danoArma) {
        this.danoArma = danoArma;
    }
}