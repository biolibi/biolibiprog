    import java.io.*;
    import java.util.Scanner;
    import java.util.*;
    import java.util.LinkedList;
    import java.util.Map;
    import java.util.Locale;


public class ContactMain {
    public static void main(String[] args)
    {
        contact();
    }



    public static void contact () {

        int choix = 0;
        int g =0;
        int choix2 =0;
        int choix3 =0;
        Scanner sc = new Scanner(System.in);
        String typeDeNumero;
        String numero;
        Map<Integer, ContactObject> MapDeContact = new HashMap<>();
        LinkedList ListeDeRappel = new LinkedList<ContactObject>();

        System.out.println("Voulez-vous charger une liste existante?");
        System.out.println("1) Oui ");
        System.out.println("  (toutes les autres entrés seront considérés comme NON)");
        choix3 = unNombre(sc);
        //LOADING SAVE
        if (choix3 == 1) {
            try{
                ObjectInput entré = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("save.dat"))) {
                };
                MapDeContact  = (HashMap<Integer, ContactObject>) entré.readObject();
                entré.close();


            }   catch (IOException e){
                e.printStackTrace();
            }
            catch (ClassNotFoundException ya){
                ya.printStackTrace();
            }

        }





        while (choix != 6){
            choix = 0;
            System.out.println("Bienvenue");
            System.out.println("1) Ajouter un contact");
            System.out.println("2) Modifier un contact");
            System.out.println("3) Afficher les contacts");
            System.out.println("4) Supprimer contacts");
            System.out.println("5) liste de priorité");
            System.out.println("6) Quitter");
            choix = unNombre(sc);
            if (choix == 1){
               ContactObject contacts = new ContactObject();
                System.out.println("Ce contact sera ajouté à la position: " + MapDeContact.size()) ;
                System.out.println("Veuillez entrer les informations suivantes : ");
                System.out.println("Prénom :");
                contacts.setPrénom(characterSpéciaux(sc.next()));
                System.out.println("Nom :");
                contacts.setNom(characterSpéciaux(sc.next()));
                System.out.println("Adresse :");
                System.out.println("");
                System.out.println("Numero de porte :");
                contacts.ad1.setPortenumero(unNombre(sc));
                System.out.println("Rue : "  );
                contacts.ad1.setRue(characterSpéciaux(sc.next()));
                System.out.println("Appartement : ");
                contacts.ad1.setAppartement(characterSpéciaux(sc.next()));
                System.out.println("Ville : ");
                contacts.ad1.setVille(characterSpéciaux(sc.next()));
                System.out.println("Pays : ");
                contacts.ad1.setPays(unPays(sc.next()));
                System.out.println("Province : (exemple: Quebec");
                if (contacts.ad1.getPays().equals("Canada")){
                    contacts.ad1.setProvince(province(characterSpéciaux(sc.next())));
                }
                else if (contacts.ad1.getPays() != "Canada"){
                    contacts.ad1.setProvince(sc.next());
                }
                System.out.println("Occupation : ");
                System.out.println("");
                System.out.println("Poste :");
                contacts.oc1.setPoste(characterSpéciaux(sc.next()));
                System.out.println("Nom de l'entreprise : ");
                contacts.oc1.setLnameentreprise(characterSpéciaux(sc.next()));
                System.out.println("Numero de porte : ");
                contacts.oc1.setLadresseentreprise(characterSpéciaux(sc.next()));
                System.out.println("Rue : ");
                contacts.oc1.setEntreprise(characterSpéciaux(sc.next()));
                System.out.println("Ville : ");
                contacts.oc1.setVilleentreprise(characterSpéciaux(sc.next()));
                System.out.println("Pays : ");
                contacts.oc1.setPaysentreprise(unPays(sc.next()));
                System.out.println("Province : (exemple: Quebec");
                if (contacts.ad1.getPays() == "Canada")
                contacts.oc1.setProvinceentreprise(province(sc.next()));
                else if (contacts.ad1.getPays() != "Canada")
                    contacts.oc1.setProvinceentreprise(characterSpéciaux(sc.next()));
                choix2 = 0;
                while ( choix2 !=2 ){

                    System.out.println("Voulez vous entrer un numero de téléphone?");
                    System.out.println("1) oui");
                    System.out.println("2) non");
                    choix2 = unNombre(sc);

                    if (choix2 == 1){
                        System.out.println("indiquer le type de numéro");
                        typeDeNumero = characterSpéciaux(sc.next());


                        System.out.println("indiquer le numéro");
                        System.out.println("exemple: 418-530-8282");
                        numero = numeroCodeRégional(sc.next());

                        contacts.li1.add( new Telephone(typeDeNumero,numero));
                        choix2 =0;
                    }
                }
                MapDeContact.put(MapDeContact.size(),contacts);
            }

            if (choix == 2){
                System.out.println("Quel contact voulez-vous modifiez?");
                if (MapDeContact.size() != 0)
                System.out.println("0-"+(MapDeContact.size()-1));
                if (MapDeContact.size() == 0)
                System.out.println("Il y a aucun contact");
                choix2 = unNombre(sc);

                if (choix2 <= MapDeContact.size() ){
                ContactObject contacts = MapDeContact.get(choix2);
                System.out.println("Prénom :");
                System.out.println(contacts.getPrénom() );
                contacts.setPrénom(characterSpéciaux(sc.next()));
                System.out.println("Nom :");
                System.out.println(contacts.getNom());
                contacts.setNom(characterSpéciaux(sc.next()));
                System.out.println("Adresse :");
                System.out.println("");

                System.out.println("Numero de porte :");
                System.out.println(contacts.ad1.getPortenumero());
                contacts.ad1.setPortenumero(unNombre(sc));
                System.out.println("Rue : "  );
                System.out.println(contacts.ad1.getRue());
                contacts.ad1.setRue(characterSpéciaux(sc.next()));
                System.out.println("Appartement : ");
                System.out.println(contacts.ad1.getAppartement());
                contacts.ad1.setAppartement(characterSpéciaux(sc.next()));
                System.out.println("Ville : ");
                System.out.println(contacts.ad1.getVille());
                contacts.ad1.setVille(characterSpéciaux(sc.next()));
                System.out.println("Pays : ");
                System.out.println(contacts.ad1.getPays());
                contacts.ad1.setPays(unPays(sc.next()));
                System.out.println("Province : (exemple: Quebec)");
                System.out.println(contacts.ad1.getProvince());
                contacts.ad1.setProvince(characterSpéciaux(sc.next()));
                System.out.println("Occupation : ");
                System.out.println("");
                System.out.println("Poste :");
                System.out.println(contacts.oc1.getPoste());
                contacts.oc1.setPoste(characterSpéciaux(sc.next()));
                System.out.println("Nom de l'entreprise : ");
                System.out.println(contacts.oc1.getLnameentreprise());
                contacts.oc1.setLnameentreprise(characterSpéciaux(sc.next()));
                System.out.println("Numero de porte : ");
                System.out.println(contacts.oc1.getLadresseentreprise());
                contacts.oc1.setLadresseentreprise(characterSpéciaux(sc.next()));
                System.out.println("Rue : ");
                System.out.println(contacts.oc1.getEntreprise());
                contacts.oc1.setEntreprise(characterSpéciaux(sc.next()));
                System.out.println("Ville : ");
                System.out.println(contacts.oc1.getVilleentreprise());
                contacts.oc1.setVilleentreprise(characterSpéciaux(sc.next()));
                System.out.println("Pays : ");
                System.out.println(contacts.oc1.getPaysentreprise());
                contacts.oc1.setPaysentreprise(unPays(sc.next()));
                System.out.println("Province : (exemple: Quebec");
                System.out.println(contacts.oc1.getProvinceentreprise());
                contacts.oc1.setProvinceentreprise(characterSpéciaux(sc.next()));
                contacts.oc1.setPaysentreprise(characterSpéciaux(sc.next()));
                System.out.println("Numéro : ");

                while ( choix2 !=3 ){
                    System.out.println("Voulez vous entrer un numero de téléphone?");
                    System.out.println("1) ajouter un numéro");
                    System.out.println("2) supprimé un numéro");
                    System.out.println("3) quitter");
                    choix2 = unNombre(sc);
                    if (choix2 == 1){
                        System.out.println("indiquer le type de numéro");
                        typeDeNumero = characterSpéciaux(sc.next());

                        System.out.println("indiquer le numéro ");
                        System.out.println("exemple: 418-530-8282");
                        numero = numeroCodeRégional(sc.next());

                        contacts.li1.add( new Telephone(typeDeNumero,numero));
                        choix2 =0;
                    }
                    if (choix2 == 2 && 0 < contacts.li1.size()){
                        System.out.println(contacts.li1);

                        System.out.println("Quel numéro voulez-vous supprimé?");
                        choix = unNombre(sc);
                        contacts.li1.remove(choix);
                    }

                }
                }
            else System.out.println("Le nombre n'est pas valide");
            }

            if (choix == 3){
                System.out.println("Quel contact voulez-vous regardez?");
                if (MapDeContact.size() != 0)
                    System.out.println("0-"+(MapDeContact.size()-1));
                if (MapDeContact.size() == 0)
                    System.out.println("Il y a aucun contact");

                choix3 = unNombre(sc);
                if (choix3+1 <= MapDeContact.size()){
                    ContactObject contacts = MapDeContact.get(choix3);
                System.out.println("Prénom :");
                System.out.println(contacts.getPrénom());
                System.out.println("Nom :");
                System.out.println(contacts.getNom());
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
                supprimer = unNombre(sc);
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
                choix = unNombre(sc);

                if (choix == 1){
                    System.out.println("entrer la position du contact");
                    choix3 = unNombre(sc);
                    ContactObject contacts = MapDeContact.get(choix3);
                    ListeDeRappel.addLast(contacts);
                }
                if (choix == 2){

                    System.out.println(ListeDeRappel.toString());

                }
                if (choix == 3){
                    System.out.println("Quel contact voulez-vous supprimer?");

                    choix3 = unNombre(sc);
                    ContactObject contacts = MapDeContact.get(choix3);
                    ListeDeRappel.remove(contacts);
                }

                }
            }
            //sauvegarde
        if (choix == 6){

            System.out.println("Voulez-vous sauvegarder?");
            System.out.println("1) oui");
            System.out.println("2) non");
            choix2 = unNombre(sc);
            if (choix2 == 1);{
                        try{
                    ObjectOutputStream sauvegarde = new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream("save.dat")));
                   sauvegarde.writeObject(MapDeContact);
                   System.out.println("Le fichier a été enregistrer");
                    sauvegarde.close();
                }   catch (IOException e){
                    e.printStackTrace();
                }
            }

            if (choix2 == 2);


            }


        }
        sc.close();
    }
    public static int unNombre(Scanner sc){
       while (!sc.hasNextInt()){
           System.out.println(sc.next() + " n'est pas un nombre valide. Réessayer");
       }
       return sc.nextInt();
    }

    //inutile?
    public static String unString(Scanner sc){
        while (!sc.hasNext()){
            System.out.println(sc.next() + " n'est pas un String valide. Réessayer");
        }
        return sc.nextLine();
    }
    //très lent (peut probablement être améliorer)
    public static String unPays (String pays){
        Scanner sc = new Scanner(System.in);
        String listeDePays[] = new String[250];
        String[] ISO = Locale.getISOCountries();
        int i =0;
        boolean trouver = false;

        for (String countryCode : ISO) {
            Locale pay = new Locale("", countryCode);
            {
                listeDePays[i] = pay.getDisplayCountry(Locale.FRENCH);
                i++;
            }

        }

        for (i =0 ; i < 250; i++ ){
            if (pays.equals(listeDePays[i])){
                System.out.println(pays + " existe dans la liste");
                i = 249;
                trouver = true;
            }
        }
        if (trouver == false){
            System.out.println(pays + " n'a pas été trouvé");
            return unPays(sc.next());
        }
        return pays;
    }
    //Retire character spéciaux mais garde les nombres
    public static String characterSpéciaux(String entré){
        String str = entré;
        str = str.replaceAll("[^a-zA-Z0-9 ]+", "");
        return str;
    }
    //Méthode numéro code regional + 7 chiffre en retirant tous characters autres que nombre + vérifie si numéro valide
    public static String numeroCodeRégional (String entré){
        Scanner sc = new Scanner(System.in);
        String str = entré;
        str = str.replaceAll("[^\\d-]" , "");
        if (str.length() != 12){
            System.out.println("numéro de téléphone non valide");
            return numeroCodeRégional(sc.next());
        }

        if (str.charAt(3) == '-' && str.charAt(7) == '-' && str.length() == 12){
            System.out.println("Le numero a été ajouté");
            return str;
        }
       return numeroCodeRégional(sc.next());

    }
    public static String province (String entré){
        Scanner sc = new Scanner(System.in);
        String[] province = {"Quebec","Ontario","Colombie-Britannique","Alberta","Nouvelle-Écosse","Saskatchewan","Manitoba","Nouveau-Brunswick","Terre-Neuve-et-Labrador","Ile-du-Prince-Édouard"};

        for (int i = 0; i<10;i++  ){
            if (entré.equals(province[i])){
                return province[i];
            }
        }
        System.out.println("Province non valide");
        return province(sc.next());
    }
}








