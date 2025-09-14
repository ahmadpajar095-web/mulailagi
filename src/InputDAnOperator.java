import java.util.Scanner;

public class InputDAnOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ambil input dari user
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        input.close();

        // Operasi matematika
        int jumlah = angka1 + angka2;
        int selisih = angka1 - angka2;
        int kali = angka1 * angka2;
        int bagi = angka1 / angka2;
        int sisa = angka1 % angka2;

        // Tampilkan hasil
        System.out.println("Hasil Penjumlahan: " + jumlah);
        System.out.println("Hasil Pengurangan: " + selisih);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);
        System.out.println("Sisa Bagi: " + sisa);
    }
}
