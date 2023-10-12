package basicjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            String nama, alamat;
            
            int umur;
            
            System.out.print("Masukan Nama\t: ");
            nama = input.nextLine();
            System.out.print("Masukan Alamat\t: ");
            alamat = input.nextLine();
            
            System.out.print("Masukan Umur\t: ");
            umur = input.nextInt();
            
            System.out.println("===============================");
            
            System.out.println(nama+" Lahir di "+alamat);
            
            System.out.println("Berumur "+umur+" th.");
    }
    
}
