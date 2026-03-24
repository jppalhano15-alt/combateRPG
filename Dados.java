import java.util.Random;

public class Dados extends Classe{

    Armas arma;
    Magias magias;

    public Dados() {
        super("Default", 0, 0,0, Armas.acha);
    }


    static int rolarD20() {
         Random rndm = new Random();
         return rndm.nextInt(20)+1;
    }

    static int rolarAtaque(Classe classe) {
        Random rndm = new Random();
        return rndm.nextInt(20) + 1 +  classe.getMod();
    }

    static int rolarDanoArma(Classe classe, Armas arma) {
        Random rndm = new Random();
        return rndm.nextInt(arma.getdanoArma()) + 1 + classe.getMod();
    }

    static int rolarDanoMagia(Magias magias) {
        Random rndm = new Random();
        return rndm.nextInt(magias.getdanoMagia()) * magias.getdadosDanoMagia();
    }
}