
    import java.util.Scanner;
    import java.util.*;
    import java.util.LinkedList;


public class contactmain {
    public static void main(String[] args)
    {
        contact();
    }



    public static void contact () {

        int choix = 0;
        int g =0;
        int choix2 =0;
        int knumeroàajouter = 0;
        Scanner sc = new Scanner(System.in);
        String typeDeNumero;
        String numero;
        Map<Integer, contactobject> MapDeContact = new HashMap<>();
        LinkedList ListeDeRappel = new LinkedList<contactobject>();






        while (choix != 6){
            choix = 0;
            System.out.println("Bienvenue");
            System.out.println("1) Ajouter un contact");
            System.out.println("2) Modifier un contact");
            System.out.println("3) Afficher les contacts");
            System.out.println("4) Supprimer contacts");
            System.out.println("5) liste de priorité");
            System.out.println("6) Quitter");
            choix =   sc.nextInt();
            if (choix == 1){
               contactobject contacts = new contactobject();
                System.out.println("Ce contact sera ajouté à la position: " + g) ;
                System.out.println("Veuillez entrer les informations suivantes : ");
                System.out.println("Prénom :");
                contacts.setPrénom(sc.next());
                System.out.println("Nom :");
                contacts.nom = sc.next();
                System.out.println("Adresse :");
                System.out.println("");
                System.out.println("Numero de porte :");
                contacts.ad1.setPortenumero(sc.nextInt());
                System.out.println("Rue : "  );
                contacts.ad1.setRue(sc.next());
                System.out.println("Appartement : ");
                contacts.ad1.setAppartement(sc.next());
                System.out.println("Ville : ");
                contacts.ad1.setVille(sc.next());
                System.out.println("Province :");
                contacts.ad1.setProvince(sc.next());
                System.out.println("Pays : ");
                contacts.ad1.setPays(sc.next());
                System.out.println("Occupation : ");
                System.out.println("");
                System.out.println("Poste :");
                contacts.oc1.setPoste(sc.next());
                System.out.println("Nom de l'entreprise : ");
                contacts.oc1.setLnameentreprise(sc.next());
                System.out.println("Numero de porte : ");
                contacts.oc1.setLadresseentreprise(sc.next());
                System.out.println("Rue : ");
                contacts.oc1.setEntreprise(sc.next());
                System.out.println("Ville : ");
                contacts.oc1.setVilleentreprise(sc.next());
                System.out.println("Province : ");
                contacts.oc1.setProvinceentreprise(sc.next());
                System.out.println("Pays : ");
                contacts.oc1.setPaysentreprise(sc.next());
                choix2 = 0;

                while ( choix2 !=2 ){

                    System.out.println("Voulez vous entrer un numero de téléphone?");
                    System.out.println("1) oui");
                    System.out.println("2) non");
                    choix2 = sc.nextInt();

                    if (choix2 == 1){
                        System.out.println("indiquer le type de numéro");
                        typeDeNumero = sc.next();


                        System.out.println("indiquer le numéro");
                        numero = sc.next();

                        contacts.li1.add( new telephone(typeDeNumero,numero));
                        choix2 =0;
                    }
                }
                MapDeContact.put(g,contacts);
                g++;
            }

            if (choix == 2){
                System.out.println("Quel contact voulez-vous modifiez?");
                System.out.println("0-"+(MapDeContact.size()-1));
                choix2 = sc.nextInt();

                contactobject  contacts = MapDeContact.get(choix2);
                System.out.println("Prénom :");
                System.out.println(contacts.prénom );
                contacts.prénom = sc.next();
                System.out.println("Nom :");
                System.out.println(contacts.nom);
                contacts.nom = sc.next();
                System.out.println("Adresse :");
                System.out.println("");
                System.out.println("Numero de porte :");
                System.out.println(contacts.ad1.getPortenumero());
                contacts.ad1.setPortenumero(sc.nextInt());
                System.out.println("Rue : "  );
                System.out.println(contacts.ad1.getRue());
                contacts.ad1.setRue(sc.next());
                System.out.println("Appartement : ");
                System.out.println(contacts.ad1.getAppartement());
                contacts.ad1.setAppartement(sc.next());
                System.out.println("Ville : ");
                System.out.println(contacts.ad1.getVille());
                contacts.ad1.setVille(sc.next());
                System.out.println("Province :");
                System.out.println(contacts.ad1.getProvince());
                contacts.ad1.setProvince(sc.next());
                System.out.println("Pays : ");
                System.out.println(contacts.ad1.getPays());
                contacts.ad1.setPays(sc.next());
                System.out.println("Occupation : ");
                System.out.println("");
                System.out.println("Poste :");
                System.out.println(contacts.oc1.getPoste());
                contacts.oc1.setPoste(sc.next());
                System.out.println("Nom de l'entreprise : ");
                System.out.println(contacts.oc1.getLnameentreprise());
                contacts.oc1.setLnameentreprise(sc.next());
                System.out.println("Numero de porte : ");
                System.out.println(contacts.oc1.getLadresseentreprise());
                contacts.oc1.setLadresseentreprise(sc.next());
                System.out.println("Rue : ");
                System.out.println(contacts.oc1.getEntreprise());
                contacts.oc1.setEntreprise(sc.next());
                System.out.println("Ville : ");
                System.out.println(contacts.oc1.getVilleentreprise());
                contacts.oc1.setVilleentreprise(sc.next());
                System.out.println("Province : ");
                System.out.println(contacts.oc1.getProvinceentreprise());
                contacts.oc1.setProvinceentreprise(sc.next());
                System.out.println("Pays : ");
                System.out.println(contacts.oc1.getPaysentreprise());
                contacts.oc1.setPaysentreprise(sc.next());
                System.out.println("Numéro : ");
                System.out.println("faites ' ' pour laisse la case vide");
                while ( choix2 !=3 ){
                    System.out.println("Voulez vous entrer un numero de téléphone?");
                    System.out.println("1) ajouter un numéro");
                    System.out.println("2) supprimé un numéro");
                    System.out.println("3) quitter");
                    choix2 = sc.nextInt();
                    if (choix2 == 1){
                        System.out.println("indiquer le type de numéro");
                        typeDeNumero = sc.next();


                        System.out.println("indiquer le numéro");
                        numero = sc.next();

                        contacts.li1.add( new telephone(typeDeNumero,numero));
                        choix2 =0;
                    }
                    if (choix2 == 2 && 0 < contacts.li1.size()){
                        System.out.println(contacts.li1);
                        choix = 0;
                        System.out.println("Quel numéro voulez-vous supprimé?");
                        choix = sc.nextInt();
                        contacts.li1.remove(choix);
                    }

                }
            choix2 = 0;}
            if (choix == 3){
                System.out.println("Quel contact voulez-vous regardez?");
                System.out.println("0-"+(MapDeContact.size()-1));
                int choix3 = 0;
                choix3 = sc.nextInt();
                if (choix3+1 <= MapDeContact.size()){
                    contactobject contacts = MapDeContact.get(choix3);
                System.out.println("Prénom :");
                System.out.println(contacts.getPrénom());
                System.out.println("Nom :");
                System.out.println(contacts.nom);
                System.out.println("Adresse :");
                System.out.println("");
                System.out.println("Numero de porte :");
                System.out.println(contacts.ad1.getPortenumero());
                System.out.println("Rue : "  );
                System.out.println(contacts.ad1.getRue());
                System.out.println("Appartement : ");
                System.out.println(contacts.ad1.getAppartement());
                System.out.println("Ville : ");
                System.out.println(contacts.ad1.getVille());
                System.out.println("Province :");
                System.out.println(contacts.ad1.getProvince());
                System.out.println("Pays : ");
                System.out.println(contacts.ad1.getPays());
                System.out.println("Occupation : ");
                System.out.println("");
                System.out.println("Poste :");
                System.out.println(contacts.oc1.getPoste());
                System.out.println("Nom de l'entreprise : ");
                System.out.println(contacts.oc1.getLnameentreprise());
                System.out.println("Numero de porte : ");
                System.out.println(contacts.oc1.getLadresseentreprise());
                System.out.println("Rue : ");
                System.out.println(contacts.oc1.getEntreprise());
                System.out.println("Ville : ");
                System.out.println(contacts.oc1.getVilleentreprise());
                System.out.println("Province : ");
                System.out.println(contacts.oc1.getProvinceentreprise());
                System.out.println("Pays : ");
                System.out.println(contacts.oc1.getPaysentreprise());
                System.out.println("Numéro : ");
                System.out.println(contacts.li1);
                }
                }
            if (choix == 4){
                System.out.println("Quel contact voulez-vous supprimé?");
                int supprimer = 0;
                supprimer = sc.nextInt();
                MapDeContact.remove(supprimer);
                System.out.println("Contact supprimé");
            }
            if (choix == 5){
                while (choix != 4){
                System.out.println("1) Quel contact voulez-vous ajouter?");
                System.out.println("2) afficher les contacts");
                System.out.println("3) supprimer un contact");
                System.out.println("4) Quitter");
                choix = 0;
                choix = sc.nextInt();

                if (choix == 1){
                    int choix3 = 0;
                    System.out.println("entrer la position du contact");
                    choix3 = sc.nextInt();
                    contactobject  contacts = MapDeContact.get(choix3);
                    ListeDeRappel.addLast(contacts);
                }
                if (choix == 2){

                    System.out.println(ListeDeRappel.toString());

                }
                if (choix == 3){
                    System.out.println("Quel contact voulez-vous supprimer?");
                    int choix3 = 0;
                    choix3 = sc.nextInt();
                    contactobject  contacts = MapDeContact.get(choix3);
                    ListeDeRappel.remove(contacts);
                }

                }
            }
        }
    sc.close();}
}


