import employés.Administrateurs;
import employés.Chercheurs;
import employés.Employés;
import employés.Superviseurs;
import fondsEtSubventions.Dépense;
import fondsEtSubventions.Subventions;
import projets.*;

public class Main {

    public static void main(java.lang.String a[]){

        java.lang.String brillant = (char)27 + "[1m";

        System.out.println(brillant);
        System.out.println("Prototype De Gestion");
        créationDeProjet();

    }
    public static void créationDeProjet (){
        Projets projets = new Projets("16B12" , "15/04/2022" , 200000, "En cours");
        System.out.println("Création de projet");
        System.out.println("Nom de code: " + projets.getNomDeCode() + " Date d'échéance: " + projets.getDateDéchéance() +" Budget: " + projets.getBudget() + " Statut: " + projets.getStatut());
        System.out.println();


        Subventions subventions = new Subventions("356ACD", "AMD Construction" , 45000, "29/07/2019");
        System.out.println("Création de subvention");
        System.out.println("Nom de code: " + subventions.getCode() + " Nom de L'instance: " + subventions.getNomDeLinstance() + " Montant: " + subventions.getMontant() + " Date limite: " + subventions.getDateLimite() );
        System.out.println();

        Dépense dépense = new Dépense("Coût d'entrepôt", projets.getNomDeCode(), 25000);
        System.out.println("Dépense");
        System.out.println("Description: " + dépense.getDescription() +  " Project lié: " + dépense.getProjetDépense() + " Montant: " + dépense.getMontantPdépense());
        System.out.println();

        Employés employés[] = new Employés[3];
        Chercheurs chercheurs1 = new Chercheurs("Jean Laporte", "123931", 4, 45000, projets.getNomDeCode());

        Superviseurs superviseurs1 = new Superviseurs("Alain Manger", "456132" , 8 , 83000, projets.getNomDeCode());

        superviseurs1.ajouterChercheur(chercheurs1);

        Administrateurs administrateurs1 = new Administrateurs("Joe Melon", "987432", 14, 153000,projets.getNomDeCode());

        employés[0] = chercheurs1;
        employés[1] = superviseurs1;
        employés[2] = administrateurs1;

        administrateurs1.ajouterDépense(dépense);
        administrateurs1.ajouterSubvention(subventions);


        for (int i=0; i<=2;i++){
            System.out.println(employés[i].getNom() + " Numéro Employé: " + employés[i].getNumeroDemployé() + " Années Expérience: " + employés[i].getAnnéesExpérience() + " Salaire Annuel: " + employés[i].getSalaireAnnuel());
        }





    }

}
