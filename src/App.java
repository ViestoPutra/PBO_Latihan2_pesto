import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nama: ");
        String nama = input.nextLine() ;
        
        System.out.print("masukan NIM: ");
        int nim = input.nextInt();
        
        System.out.print("masukan usia: ");
        int usia = input.nextInt();
        
        System.out.print("masukan tinggi badam dalam senti: ");
        double tinggibadan = input.nextDouble();
        
        System.out.println("\ndaftar informasi anda");
        System.out.println("nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("usia: " + usia);
        System.out.println("tinggi badan: " + tinggibadan + " cm");
        
        int hasilAritmatika = (usia * 2) + 10 / 5 - 3;
        System.out.println("Hasil operasi aritmatika: " + hasilAritmatika);
        
        boolean lebihDari18 = usia > 18;
        System.out.println("apakah usia lebih dari 18 tahun? : " + lebihDari18);
        
        boolean kondisiLogika = (usia > 18) && (tinggibadan > 160);
        System.out.println("apakah usia lebih dari 18 tahun dan tinggi badan lebih dari 160 cm: " + kondisiLogika);

        double usiaDouble = (double) usia;
        int tinggiInt = (int) tinggibadan;
        System.out.println("Usia dalam tipe double: " + usiaDouble);
        System.out.println("Tinggi badan dalam tipe int: " + tinggiInt);

        input.close();
    }
}
