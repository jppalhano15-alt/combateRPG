public class Habilidades {

    private boolean furia;
    private boolean habil;
    private boolean ataqueFurtivo;
    private boolean conjurador;
    private boolean maosAgeis;

// Furia = +2 dano fisico e danos fisicos (Corte, Impacto e Perfuração) sofridos são /2
// Habil = Consegue usar "Truques"
// Atk furtivo = +2d6 de dano ao atacar c Arma
// Conjurador = Consegue conjurar "Magias"
// Mãos Ageis = Atira sempre 2 flechas por ação (+50% dano)

    public Habilidades(boolean furia, boolean habil, boolean ataqueFurtivo, boolean conjurador, boolean maosAgeis) {
        this.furia = furia;
        this.habil = habil;
        this.ataqueFurtivo = ataqueFurtivo;
        this.conjurador = conjurador;
        this.maosAgeis = maosAgeis;
    }
}
