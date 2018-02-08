import java.util.Scanner;

public class contactmain {
    public static void main(String[] args) {

        contactobject contact[] = new contactobject[20];
        int choix = 0;
        int g =0;
        int choix2 =0;
        int knumeroàajouter = 0;
        listedenumero li1[] = new listedenumero[200] ;
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int choix3 =0;

        for (int i = 0; i <= 19;i++){
            contact[i] = new contactobject();
        }
        for (int i = 0; i <= 199;i++){
         li1[i] = new listedenumero("Vide");
        }
        while (choix != 4){
            choix = 0;
        System.out.println("Bienvenue");
        System.out.println("1) Ajouter un contact");
        System.out.println("2) Modifier un contact");
        System.out.println("3) Afficher les contacts");
        System.out.println("4) Quitter");
        choix =   sc.nextInt();
        if (choix == 1){
            k = 0; knumeroàajouter = 0;
            System.out.println("Ce contact sera ajouté à la position: " + g) ;
            System.out.println("Veuillez entrer les informations suivantes : ");
            System.out.println("Prénom :");
            contact[g].prénom = sc.next();
            System.out.println("Nom :");
            contact[g].nom = sc.next();
            System.out.println("Adresse :");
            System.out.println("");
            System.out.println("Numero de porte :");
            contact[g].ad1.setPortenumero(sc.nextInt());
            System.out.println("Rue : "  );
            contact[g].ad1.setRue(sc.next());
            System.out.println("Appartement : ");
            contact[g].ad1.setAppartement(sc.next());
            System.out.println("Ville : ");
            contact[g].ad1.setVille(sc.next());
            System.out.println("Province :");
            contact[g].ad1.setProvince(sc.next());
            System.out.println("Pays : ");
            contact[g].ad1.setPays(sc.next());
            System.out.println("Occupation : ");
            System.out.println("");
            System.out.println("Poste :");
            contact[g].oc1.setPoste(sc.next());
            System.out.println("Nom de l'entreprise : ");
            contact[g].oc1.setLnameentreprise(sc.next());
            System.out.println("Numero de porte : ");
            contact[g].oc1.setLadresseentreprise(sc.next());
            System.out.println("Rue : ");
            contact[g].oc1.setEntreprise(sc.next());
            System.out.println("Ville : ");
            contact[g].oc1.setVilleentreprise(sc.next());
            System.out.println("Province : ");
            contact[g].oc1.setProvinceentreprise(sc.next());
            System.out.println("Pays : ");
            contact[g].oc1.setPaysentreprise(sc.next());
            choix2 = 0;
            while ( choix2 !=2 ){

            System.out.println("Voulez vous entrer un numero de téléphone?");
            System.out.println("1) oui");
            System.out.println("2) non");
            choix2 = sc.nextInt();

            if (choix2 == 1){
                System.out.println("indiquer l'information ainsi que le numéro sur la même ligne");
                knumeroàajouter = (g*10)+k;
                sc.nextLine();
                li1[knumeroàajouter].setNumeromaison(sc.nextLine());

                k++;knumeroàajouter =0;
                choix2 =0;
            }
                }
        g++;}

        if (choix == 2){
            System.out.println("Quel contact voulez-vous modifiez?");
            System.out.println("0-19");
            choix2 = sc.nextInt();
            System.out.println("Prénom :");
            System.out.println(contact[choix2].prénom );
            contact[choix2].prénom = sc.next();
            System.out.println("Nom :");
            System.out.println(contact[choix2].nom);
            contact[choix2].nom = sc.next();
            System.out.println("Adresse :");
            System.out.println("");
            System.out.println("Numero de porte :");
            System.out.println(contact[choix2].ad1.getPortenumero());
            contact[choix2].ad1.setPortenumero(sc.nextInt());
            System.out.println("Rue : "  );
            System.out.println(contact[choix2].ad1.getRue());
            contact[choix2].ad1.setRue(sc.next());
            System.out.println("Appartement : ");
            System.out.println(contact[choix2].ad1.getAppartement());
            contact[choix2].ad1.setAppartement(sc.next());
            System.out.println("Ville : ");
            System.out.println(contact[choix2].ad1.getVille());
            contact[choix2].ad1.setVille(sc.next());
            System.out.println("Province :");
            System.out.println(contact[choix2].ad1.getProvince());
            contact[choix2].ad1.setProvince(sc.next());
            System.out.println("Pays : ");
            System.out.println(contact[choix2].ad1.getPays());
            contact[choix2].ad1.setPays(sc.next());
            System.out.println("Occupation : ");
            System.out.println("");
            System.out.println("Poste :");
            System.out.println(contact[choix2].oc1.getPoste());
            contact[choix2].oc1.setPoste(sc.next());
            System.out.println("Nom de l'entreprise : ");
            System.out.println(contact[choix2].oc1.getLnameentreprise());
            contact[choix2].oc1.setLnameentreprise(sc.next());
            System.out.println("Numero de porte : ");
            System.out.println(contact[choix2].oc1.getLadresseentreprise());
            contact[choix2].oc1.setLadresseentreprise(sc.next());
            System.out.println("Rue : ");
            System.out.println(contact[choix2].oc1.getEntreprise());
            contact[choix2].oc1.setEntreprise(sc.next());
            System.out.println("Ville : ");
            System.out.println(contact[choix2].oc1.getVilleentreprise());
            contact[choix2].oc1.setVilleentreprise(sc.next());
            System.out.println("Province : ");
            System.out.println(contact[choix2].oc1.getProvinceentreprise());
            contact[choix2].oc1.setProvinceentreprise(sc.next());
            System.out.println("Pays : ");
            System.out.println(contact[choix2].oc1.getPaysentreprise());
            contact[choix2].oc1.setPaysentreprise(sc.next());
            System.out.println("Numéro : ");
            System.out.println("faites * pour laisse la case vide");
            knumeroàajouter = 0;
            for (int r = 0; r<=19;r++ ){
                knumeroàajouter = (choix2*10)+r;
                System.out.println(li1[knumeroàajouter].getNumeromaison().replace("*","Vide" ));
                li1[knumeroàajouter].setNumeromaison(sc.next());
            }
        }
        if (choix == 3){
            System.out.println("Quel contact voulez-vous regardez?");
            System.out.println("0-19");
            choix3 = sc.nextInt();
            System.out.println("Prénom :");
            System.out.println(contact[choix3].prénom );
            System.out.println("Nom :");
            System.out.println(contact[choix3].nom);
            System.out.println("Adresse :");
            System.out.println("");
            System.out.println("Numero de porte :");
            System.out.println(contact[choix3].ad1.getPortenumero());
            System.out.println("Rue : "  );
            System.out.println(contact[choix3].ad1.getRue());
            System.out.println("Appartement : ");
            System.out.println(contact[choix3].ad1.getAppartement());
            System.out.println("Ville : ");
            System.out.println(contact[choix3].ad1.getVille());
            System.out.println("Province :");
            System.out.println(contact[choix3].ad1.getProvince());
            System.out.println("Pays : ");
            System.out.println(contact[choix3].ad1.getPays());
            System.out.println("Occupation : ");
            System.out.println("");
            System.out.println("Poste :");
            System.out.println(contact[choix3].oc1.getPoste());
            System.out.println("Nom de l'entreprise : ");
            System.out.println(contact[choix3].oc1.getLnameentreprise());
            System.out.println("Numero de porte : ");
            System.out.println(contact[choix3].oc1.getLadresseentreprise());
            System.out.println("Rue : ");
            System.out.println(contact[choix3].oc1.getEntreprise());
            System.out.println("Ville : ");
            System.out.println(contact[choix3].oc1.getVilleentreprise());
            System.out.println("Province : ");
            System.out.println(contact[choix3].oc1.getProvinceentreprise());
            System.out.println("Pays : ");
            System.out.println(contact[choix3].oc1.getPaysentreprise());
            System.out.println("Numéro : ");
            knumeroàajouter = 0;
            for (int r = 0; r<=19;r++ ){
                knumeroàajouter = (choix3*10)+r;
            System.out.println(li1[knumeroàajouter].getNumeromaison());
            }
            }
        }
    }
}


