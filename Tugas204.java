import java.util.Scanner;

public class Tugas204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        int totalSeluruhAngka = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasilKali = i * j;
                
                if (hasilKali < 10) {
                    System.out.print("   " + hasilKali);
                } else if (hasilKali < 100) {
                    System.out.print("  " + hasilKali);  
                } else {
                    System.out.print(" " + hasilKali);
                }
                totalSeluruhAngka += hasilKali;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + totalSeluruhAngka);
        sc.close();
    }
}