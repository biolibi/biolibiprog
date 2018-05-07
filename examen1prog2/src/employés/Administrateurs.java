package employés;
import fondsEtSubventions.Dépense;
import fondsEtSubventions.Subventions;

public class Administrateurs extends Employés {
    Subventions[] listeDeSubvention = new Subventions[100];
    Dépense[] listeDeDépense = new Dépense[100];
    private int position = 0;
    private int position1 = 0;
    private double dépense =0;
    private double subvention = 0;
    private double bilan = 0;

    public void ajouterSubvention (Subventions _listeDeSubvention) {
        this.listeDeSubvention [this.position] = _listeDeSubvention;
        this.position++;
    }

    public void ajouterDépense (Dépense _Dépense){
        this.listeDeDépense [this.position1] = _Dépense;
        this.position1++;
    }

    public void bilan (){
        for (int i = 0; i<100;i++){
           subvention = subvention+listeDeSubvention[i].getMontant();
        }

        for (int i =0; i<100;i++){
            dépense = dépense+listeDeDépense[i].getMontantPdépense();
        }
        bilan = subvention-dépense;
        System.out.println(bilan);
    }

    public Administrateurs(String nom, String numeroDemployé, double annéesExpérience, double salaireAnnuel, String projetAssigné) {
        this.nom = nom;
        this.numeroDemployé = numeroDemployé;
        this.annéesExpérience = annéesExpérience;
        SalaireAnnuel = salaireAnnuel;
        this.projetAssigné = projetAssigné;
    }


}
