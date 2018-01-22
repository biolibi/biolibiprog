import java.util.Random;
import java.util.Scanner;

public class allumain { public static void main(java.lang.String a[]){


    int nBallumette = 0;
    int choix = 0;
    String nompersonne[] = new String[3];
    int montantallumette = 0;
    boolean perdant = true;
    int tourpersonne = 0;
    String cellequicommence = "";
    String cellequicommencebot = "";
    int information1[]= new int[100];
    int information2[]= new int[100];
    int information3[]= new int[100];
    int tot1 = 0;
    int tot2 = 0;

    int décision [] =new int[2];


    Scanner sc = new Scanner(System.in);
    nBallumette  = (int)(Math.random()*(100-20)+20);
    while (choix != 3){
        choix = 0; perdant = true;
    System.out.println("Jeux des allumettes");
    System.out.println("1) 1 joueurs");
    System.out.println("2) 2 joueurs");
    System.out.println("3) quitter");
    choix = sc.nextInt();
        if (choix == 1){
            System.out.println("Quel est ton nom?");
            nompersonne[0] = sc.next();
            nompersonne[2] = "ordinateur";
            System.out.println("il y a : " + nBallumette + " allumette");
            System.out.println("La dernière personne qui retire la dernière allumette perd");
            cellequicommence = nompersonne[0];
            System.out.println("La personne qui commence est : " + cellequicommence );
            for (int i = 0 ; i <= 100 ;){
                if (cellequicommence == nompersonne[0]){
                while (montantallumette != 1 && montantallumette !=2 && montantallumette != 3){
                    System.out.println("Le joueur : " + cellequicommence);
                    System.out.println("Entrez le nombre d'allumette (entre 1-3)");
                    montantallumette = sc.nextInt();
                }
                if (montantallumette < nBallumette && cellequicommence == nompersonne[0]){
                    nBallumette = nBallumette-montantallumette;
                    montantallumette = 0;
                    System.out.println("Il reste : " + nBallumette + " allumettes");
                    i++;
                    if (cellequicommence == nompersonne[0]){
                        cellequicommence = nompersonne[2];
                    }
                }
               }
                else if (cellequicommence == nompersonne[2]){
                    System.out.println("Le joueur : " + cellequicommence);
                    System.out.println("Entrez le nombre d'allumette (entre 1-3)");
                    if (1 <= nBallumette ){
                        nBallumette = nBallumette-3;
                    }
                    else if (nBallumette == 1){
                        System.out.println("Il y a eu une erreur avec le packet d'allumette il y en reste encore 2");
                        nBallumette = nBallumette+1;
                        System.out.println("L'ordinateur à enlevé 1 allumette");
                        nBallumette = nBallumette-1;
                        System.out.println("Il reste : " + nBallumette + " allumettes");
                        i++;
                        if (cellequicommence == nompersonne[0]){
                            cellequicommence = nompersonne[2];
                        }
                    }
                }
                else if (nBallumette <= montantallumette){
                    System.out.println("Le perdant est: " + cellequicommence);
                    //System.exit(0);
                    i = 101;
                    perdant = false;
                }
        }}
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
                                information1[tot1] = montantallumette;
                                tot1 = tot1+1;
                            }
                            else if (nompersonne[1] == cellequicommence){
                                    information2[tot2] = montantallumette;
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

                            //System.exit(0);
                            i = 101;
                            perdant = false;


                        }}
                }
            }
        }
    }














}

