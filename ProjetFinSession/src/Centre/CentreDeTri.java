package Centre;
import Vaisseau.Vaisseau;
import planetes.*;
import java.util.LinkedList;
import java.util.Random;

public class CentreDeTri {
    private final int quantitéMaxGado = 1000;
    private final int quantitéMaxNeptu = 1000;
    private final int quantitéMaxPluto = 1000;
    private final int quantitéMaxThul = 1000;
    private final int quantitéMaxTher = 1000;

    private  int quantitéMinGado = 0;
    private  int quantitéMinNeptu = 0;
    private  int quantitéMinPluto = 0;
    private  int quantitéMinThul = 0;
    private  int quantitéMinTher = 0;
    LinkedList<Vaisseau> fileDattente = new LinkedList<Vaisseau>();
    protected Planete[] listeDesPlanètes = {new AlphaRomeo() , new BravoTerre(), new CharlieJupiter(), new DeltaNeptune() , new QuebecVenus()};
    protected LinkedList<CentreDeTri> centreDeTris = new LinkedList<>();



    public void filePourAttendre (Vaisseau vaisseau){
        if (fileDattente.size() < 10){
            fileDattente.add(vaisseau);
        }
        else if (fileDattente.size() == 10){
            Random choix = new Random();
            fileDattente.peek().remplir(fileDattente.get(0), listeDesPlanètes[choix.nextInt(5)]);
            fileDattente.remove(0);
            fileDattente.add(vaisseau);
        }

    }



    public int getQuantitéMaxGado() {
        return quantitéMaxGado;
    }

    public int getQuantitéMaxNeptu() {
        return quantitéMaxNeptu;
    }

    public int getQuantitéMaxPluto() {
        return quantitéMaxPluto;
    }

    public int getQuantitéMaxThul() {
        return quantitéMaxThul;
    }

    public int getQuantitéMaxTher() {
        return quantitéMaxTher;
    }

    public void setQuantitéMinGado(int quantitéMinGado) {
        this.quantitéMinGado = quantitéMinGado;
    }

    public void setQuantitéMinNeptu(int quantitéMinNeptu) {
        this.quantitéMinNeptu = quantitéMinNeptu;
    }

    public void setQuantitéMinPluto(int quantitéMinPluto) {
        this.quantitéMinPluto = quantitéMinPluto;
    }

    public void setQuantitéMinThul(int quantitéMinThul) {
        this.quantitéMinThul = quantitéMinThul;
    }

    public void setQuantitéMinTher(int quantitéMinTher) {
        this.quantitéMinTher = quantitéMinTher;
    }

    public int getQuantitéMinGado() { return quantitéMinGado; }

    public int getQuantitéMinNeptu() {
        return quantitéMinNeptu;
    }

    public int getQuantitéMinPluto() {
        return quantitéMinPluto;
    }

    public int getQuantitéMinThul() {
        return quantitéMinThul;
    }

    public int getQuantitéMinTher() {
        return quantitéMinTher;
    }
}
