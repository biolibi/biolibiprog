
import java.util.Scanner;

public class allumain { public static void main(java.lang.String a[]){


    int nBallumette = 0;
    int choix = 0;
    String nompersonne[] = new String[3];
    int montantallumette = 0;
    boolean perdant = true;
    String cellequicommence = "";
    String information1[]= new String[100];
    String information2[]= new String[100];
    String information3[]= new String[100];
    int tot1 = 0;
    int tot2 = 0;
    int tot3 = 0;

    Scanner sc = new Scanner(System.in);

    while (choix != 3){
        for (int k = 0; k <= 99;k++ ){
            information1[k]= " ";
            information2[k]=  " ";
            information3[k]= " ";
        }
        tot1 = 0; tot2 = 0; tot3 = 0;
        montantallumette = 0;
        nBallumette = 0;
        choix = 0; perdant = true;
        nBallumette  = (int)(Math.random()*(100-20)+20);
    System.out.println("Jeux des allumettes");
    System.out.println("1) 1 joueurs");
    System.out.println("2) 2 joueurs");
    System.out.println("3) quitter");
    choix = sc.nextInt();
        if (choix == 1){

            System.out.println("Quel est ton nom?");
            nompersonne[0] = sc.next();
            nompersonne[2] = "ordinateur";
            System.out.println("il y a : " + nBallumette + " allumettes");
            System.out.println("La dernière personne qui retire la dernière allumette perd");
            cellequicommence = nompersonne[0];
            System.out.println("La personne qui commence est : " + cellequicommence );
            for (int i = 0 ; i <= 100 ;){
                if (cellequicommence == nompersonne[0] && montantallumette < nBallumette){
                while (montantallumette != 1 && montantallumette !=2 && montantallumette != 3){
                    System.out.println("Le joueur : " + cellequicommence);
                    System.out.println("Entrez le nombre d'allumette (entre 1-3)");
                    montantallumette = sc.nextInt();
                }
                if (montantallumette < nBallumette && cellequicommence == nompersonne[0]){
                    nBallumette = nBallumette-montantallumette;
                    information1[tot1] = String.valueOf(montantallumette) ;
                    tot1 = tot1+1;
                    montantallumette = 0;
                    System.out.println("Il reste : " + nBallumette + " allumettes");
                    i++;
                    if (cellequicommence == nompersonne[0]){
                        cellequicommence = nompersonne[2];
                    }
                }
               }
               else if (cellequicommence == nompersonne[2] && montantallumette < nBallumette){
                    System.out.println("Le joueur : " + cellequicommence);
                    System.out.println("Entrez le nombre d'allumette (entre 1-3)");
                    if (8 <= nBallumette ){
                        System.out.println("L'ordinateur à enlevé 1 allumette");
                        nBallumette = nBallumette-1;
                        information3[tot3] = String.valueOf(1);
                    }
                    else if (nBallumette == 8){
                        nBallumette = nBallumette-3;
                        information3[tot3] = String.valueOf(3);
                    }
                    else if (nBallumette == 7){
                        nBallumette = nBallumette-2;
                        information3[tot3] = String.valueOf(2);
                    }
                    else if (nBallumette == 6){
                        nBallumette = nBallumette-1;
                        information3[tot3] = String.valueOf(1);
                    }
                    else if (nBallumette == 5)
                    {
                        nBallumette = nBallumette-1;
                        information3[tot3] = String.valueOf(1);
                    }
                    else if (nBallumette == 4) {
                        nBallumette = nBallumette-3;
                        information3[tot3] = String.valueOf(3);
                    }
                    else if (nBallumette == 3 ){
                        nBallumette = nBallumette -2 ;
                        information3[tot3] = String.valueOf(2);
                    }
                    else if (nBallumette == 2 ){
                        nBallumette = nBallumette -1 ;
                        information3[tot3] = String.valueOf(2);
                    }
                    cellequicommence = nompersonne[0]; i++;
                    System.out.println("il reste: " + nBallumette + " allumette");
                    tot3 = tot3+1;
                    montantallumette = 0;
                }
                else if (nBallumette <= montantallumette){
                    System.out.println("Le perdant est: " + cellequicommence);
                    System.out.println("décision prise par " + nompersonne[0]);
                    for (int u = 0; u <= 80;u++){
                        System.out.print(information1[u] + " ");
                    }
                    System.out.println();
                    System.out.println("décision prise par " + nompersonne[2]);
                    for (int z = 0; z <= 80;z++){
                        System.out.print(information3[z] + " ");
                    }
                    System.out.println();
                    System.out.println("La dernière décision prise par : " + cellequicommence + " a été : " + montantallumette);
                    System.out.println();
        i = 110;}}}
        if (choix == 2){
            while (perdant != false && 1 <= nBallumette){
                System.out.println("Quel est le premier nom?");
                nompersonne[0] = sc.next();
                System.out.println("Quel est le deuxième nom?");
                nompersonne[1] = sc.next();
                System.out.println("il y a : " + nBallumette + " allumette");
                System.out.println("La dernière personne qui retire la dernière allumette perd");
                  cellequicommence =  nompersonne[((int)(Math.random()*(1-0)+1))];
                System.out.println("La personne qui commence est : " + cellequicommence);

                for (int i = 0 ; i <= 100 ;){
                    while (montantallumette != 1 && montantallumette !=2 && montantallumette != 3){
                        System.out.println("Le joueur : " + cellequicommence);
                        System.out.println("Entrez le nombre d'allumette (entre 1-3)");
                        montantallumette = sc.nextInt();
                    }
                    if (montantallumette < nBallumette){
                            if (nompersonne[0] == cellequicommence){
                                information1[tot1] = String.valueOf(montantallumette);
                                tot1 = tot1+1;
                            }
                            else if (nompersonne[1] == cellequicommence){
                                    information2[tot2] = String.valueOf(montantallumette);
                                    tot2 = tot2+1;
                            }
                            nBallumette = nBallumette-montantallumette;
                            montantallumette = 0;
                            System.out.println("Il reste : " + nBallumette + " allumettes");
                           i++;
                            if (cellequicommence == nompersonne[0]){
                                cellequicommence = nompersonne[1];
                            }
                            else  if (cellequicommence == nompersonne[1]){
                                cellequicommence = nompersonne[0];
                            }
                        }

                    else if (nBallumette <= montantallumette){
                            System.out.println("Le perdant est: " + cellequicommence);
                        System.out.println("décision prise par " + nompersonne[0]);
                        for (int u = 0; u <= 80;u++){
                            System.out.print(information1[u] + " ");
                        }
                        System.out.println();
                        System.out.println("décision prise par " + nompersonne[1]);
                        for (int z = 0; z <= 80;z++){
                            System.out.print(information2[z] + " ");
                        }
                        System.out.println();
                        System.out.println("La dernière décision prise par : " + cellequicommence + " a été : " + montantallumette);
                        System.out.println();

                            //System.exit(0);
                            i = 101;
                            perdant = false;


                        }}
                }
            }
        }
    }














}

