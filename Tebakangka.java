package week3;

import java.util.Random;
import java.util.Scanner;

class Tebakangka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("=====================================================");
        System.out.println("                     Tebak Angka        ");
        System.out.println("        Mempunyai 3x Kesempatan untuk menebak        ");
        System.out.println("=====================================================");

        int angka = r.nextInt(100) + 1; 
        int tebakan = 0; 
        int kesempatan = 3;
        
        while (kesempatan > 0) {
            System.out.print("Masukkan angka : ");

           
            if (s.hasNextInt()) {
                tebakan = s.nextInt();

                
                if (tebakan == angka) {
                    System.out.println("🎉 Selamat! Tebakan kamu benar.");
                    break; 
                } else if (tebakan < angka) {
                    System.out.println("Tebakan terlalu kecil! Coba lagi.");
                } else {
                    System.out.println("Tebakan terlalu besar! Coba lagi.");
                }

                kesempatan--; 
                if (kesempatan > 0) {
                    System.out.println();
                } else {
                    System.out.println(" Kesempatan sudah habis! Jawaban yang benar adalah : " + angka);
                }
            } else {
                System.out.println("Masukkan angka yang valid!");
                s.next(); 
            }
        }
    }
}
