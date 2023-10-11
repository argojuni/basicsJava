package basicjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int angka1 ;
            double angka2;
            String nama;
            Scanner input = new Scanner(System.in);
            
            System.out.print("Masukan nama : ");
            nama = input.nextLine();
            
            System.out.print("Masukan angka1 : ");
            angka1 = input.nextInt();
            
            System.out.print("Masukan angka2 : ");
            angka2 = input.nextDouble();
            
            

            System.out.println("angkat = " + angka1);
            System.out.println("angkat = " + angka2);
            System.out.println("nama = "+nama);

    }
    
}
