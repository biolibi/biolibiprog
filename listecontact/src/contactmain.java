import java.util.Scanner;

public class contactmain {
    public static void main(String[] args) {



        contactobject contact = new contactobject();

        Scanner sc = new Scanner(System.in);




        for (int i = 0; i <= 100;i++){
            contact.numbercell[i] = "" ;
            contact.numbermaison[i] = "";
            contact.numbertelephone[i] = "";
        }


    }
}
