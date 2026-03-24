public class Magias {

    private String nomeMagia;
    private String tipoDano;
    private int dadosDanoMagia;
    private int danoMagia;
    private int curaMagia;

    static Magias espadaMagica = new Magias("Espada Magica", "Corte", 1, 8, 0);
    static Magias cuspeAcido = new Magias("Cuspe Acido", "Quimico", 2, 6, 0);
    static Magias curarFerimentos = new Magias("Curar Ferimentos", "Cura", 3, 0, 6);
    static Magias raioCongelante = new Magias("Raio Congelante", "Frio", 3, 8, 0);
    static Magias bolaDeFogo = new Magias("Bola de Fogo", "Fogo", 8, 6, 0);

    //construtor
    public Magias(String nomeMagia, String tipoDano, int dadosDanoMagia, int danoMagia, int curaMagia) {
        this.nomeMagia = nomeMagia;
        this.tipoDano = tipoDano;
        this.dadosDanoMagia = dadosDanoMagia;
        this.danoMagia = danoMagia;
        this.curaMagia = curaMagia;
    }
    
    //getters
    public String getnomeMagia() {
        return nomeMagia;
    }
    public String gettipoDano() {
        return tipoDano;
    }
    public int getdadosDanoMagia() {
        return dadosDanoMagia;
    }
    public int getdanoMagia() {
        return danoMagia;
    }
    public int getcuraMagia() {
        return curaMagia;
    }

    //setters
    public void setnomeMagia(String nomeMagia) {
        this.nomeMagia = nomeMagia;
    }
    public void settipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }
    public void setdadosDanoMagia(int dadosDanoMagia) {
        this.dadosDanoMagia = dadosDanoMagia;
    }
    public void setdanoMagia(int danoMagia) {
        this.danoMagia = danoMagia;
    }
    public void setcuraMagia(int curaMagia) {
        this.curaMagia = curaMagia;
    }

}