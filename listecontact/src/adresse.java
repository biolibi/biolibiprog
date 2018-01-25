public class adresse {

        int portenumero = 0  ;
        String rue = "";
        String appartement = "";
        String ville = "";
        String Province = "";
        String pays = "";

        public adresse(int portenumero, String rue, String appartement, String ville, String province, String pays) {
            this.portenumero = portenumero;
            this.rue = rue;
            this.appartement = appartement;
            this.ville = ville;
            Province = province;
            this.pays = pays;
        }

        public int getPortenumero() {
            return portenumero;
        }

        public void setPortenumero(int portenumero) {
            this.portenumero = portenumero;
        }

        public String getRue() {
            return rue;
        }

        public void setRue(String rue) {
            this.rue = rue;
        }

        public String getAppartement() {
            return appartement;
        }

        public void setAppartement(String appartement) {
            this.appartement = appartement;
        }

        public String getVille() {
            return ville;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public String getProvince() {
            return Province;
        }

        public void setProvince(String province) {
            Province = province;
        }

        public String getPays() {
            return pays;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }
    }

