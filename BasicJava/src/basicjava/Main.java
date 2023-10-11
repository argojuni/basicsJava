package basicjava;

public class Main {

    public static void main(String[] args) {
            //int
            int umur = 12;
            System.out.println("Umur = "+umur + " Tahun");
            
            //float
            float berat = 75.5f;
            System.out.println("Berat = "+berat+" Kg");
            
            //double
            double panjang = 10.1923812;
            System.out.println("Panjang = "+panjang+" m");
            
            //string
            String nama = "Alexander";
            System.out.println("Nama = "+nama);
            
            //char
            char gender = 'L';
            System.out.println("Kelamin = "+gender);
            
            //boolean
            boolean sehat = true;
            System.out.println("Sehat = "+sehat);
            
            //pembagian
            var hasil = berat/umur;
            System.out.println(hasil);
            System.out.println((int)hasil);
    }
    
}
