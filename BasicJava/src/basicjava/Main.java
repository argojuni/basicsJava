package basicjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            int s, L,K;
            
            System.out.print("Masukan s : ");
            s = input.nextInt();
            // Luas Persegi
            L = s*s;
            // Keliling Persegi
            K = 4*s;
            
            
            
            System.out.print("Luas Persegi = ");
            System.out.println(L);
            
            System.out.print("Keliling Persegi = ");
            System.out.println(K);
    }
    
}
