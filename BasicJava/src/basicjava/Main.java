package basicjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            
            int p,l,L,K;
            
            System.out.print("Masukan P\t: ");
            p = input.nextInt();
            System.out.print("Masukan l\t: ");
            l = input.nextInt();
            
            //Luas Persegi Panjang
            L = p*l;
            //Keliling  Persegi Panjang
            K = 2*(p+1);
            
            System.out.println("p\t: "+p+"\nl\t: "+l);
            System.out.println("Luas LPP\t: "+L);
            System.out.println("Luas KPP\t: "+K);
    }
    
}
