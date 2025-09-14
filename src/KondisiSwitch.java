import java.util.Scanner;
public class KondisiSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Masukkan angka (1-5): ");
        int angka = input.nextInt();
        input.close();

        switch (angka) {
            case 1:
                System.out.println("Anda memilih angka Satu");
                break;
            case 2:
                System.out.println("Anda memilih angka Dua");
                break;
            case 3:
                System.out.println("Anda memilih angka Tiga");
                break;
            case 4:
                System.out.println("Anda memilih angka Empat");
                break;
            case 5:
                System.out.println("Anda memilih angka Lima");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
