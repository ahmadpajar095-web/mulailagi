import java.util.Scanner;
public class AwalArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] angka = {1, 2, 3, 4, 5};
        String[] nama = {"Joko", "Budi", "Siti", "Ani", "Rina"};
        System.out.print("Masukkan nilai (1-5): ");
        int nilai = input.nextInt();
        input.close();

        switch (nilai) {
            case 1:
                System.out.println("Angka: " + angka[0]);
                System.out.println("Nama: " + nama[0]);
                break;
            case 2:
                System.out.println("Angka: " + angka[1]);
                System.out.println("Nama: " + nama[1]);
                break;
            case 3:
                System.out.println("Angka: " + angka[2]);
                System.out.println("Nama: " + nama[2]);
                break;
            case 4:
                System.out.println("Angka: " + angka[3]);
                System.out.println("Nama: " + nama[3]);
                break;
            case 5:
                System.out.println("Angka: " + angka[4]);
                System.out.println("Nama: " + nama[4]);
                break;
            default:
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0-4.");
        }






    }
    
}
