public class objectjoueur {

    objectjoueur[] team_2 = new objectjoueur[100] ;
    String player = "Joueur";
    int nbjoueur = 0;



    public  objectjoueur( String _player) {
        this.player = _player;

    }

    public String getPlayer() {
        return player;

    }

    public objectjoueur[] getTeam_2() {
        return team_2;
    }
    public objectjoueur[] getJoueur(){return this.team_2;}
    public void ajouterJoueur (objectjoueur _joueur) {
        this.team_2 [this.nbjoueur] = _joueur;
        this.nbjoueur++;
    }



}
