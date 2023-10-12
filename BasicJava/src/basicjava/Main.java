package basicjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int a = 44;
            int b = 22;
            float c = 5.5f;
            
            int tambahB = a+b;
            int kurangB = a-b;
            int bagiB = a/b;
            float kaliB = b*c;
            float tambahD = c+a;
            
            System.out.println(tambahB);
            System.out.println(kurangB);
            System.out.println(tambahD);
            System.out.println((double)bagiB);
            System.out.println(kaliB);

            
            System.out.println("=============================");
            Scanner input = new Scanner(System.in);
            
            int angka1, angka2,hasil;
            
            System.out.print("Masukan angka1 = ");
            angka1 = input.nextInt();
            
            System.out.print("Masukan angka2 = ");
            angka2 = input.nextInt();
            
            hasil = angka1 + angka2;
            System.out.print(angka1+"+"+angka2+" = ");
            System.out.println(hasil);
            
            hasil = angka2- angka1;
            System.out.println(angka1+"-"+angka2+" = "+hasil);
            
            hasil = angka1*angka2;
            System.out.println(angka1+"*"+angka2+" = "+hasil);
            
            hasil = angka2/angka1;
            System.out.println(angka2+" : "+angka1+" = " + (float)hasil);
            
            System.out.println("Sisa Bagi / Modulus");
            hasil = angka2 % angka1;
            System.out.println(hasil);
    }
    
}
