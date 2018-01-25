public class listedenumero {

        String  numeromaison ="";
        String  numerocell = "";
        String  numerotravail= "";

        public listedenumero(String numeromaison, String numerocell, String numerotravail) {
            this.numeromaison = numeromaison;
            this.numerocell = numerocell;
            this.numerotravail = numerotravail;
        }

        public String getNumeromaison() {
            return numeromaison;
        }

        public void setNumeromaison(String numeromaison) {
            this.numeromaison = numeromaison;
        }

        public String getNumerocell() {
            return numerocell;
        }

        public void setNumerocell(String numerocell) {
            this.numerocell = numerocell;
        }

        public String getNumerotravail() {
            return numerotravail;
        }

        public void setNumerotravail(String numerotravail) {
            this.numerotravail = numerotravail;
        }
}
