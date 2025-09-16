import java.util.Scanner;
public class tricatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("masukkan nam anda : ");
            String nama = input.nextLine();
            System.out.println("masukkan umur anda : ");
            int umur = input.nextInt();
            System.out.println("nama anda adalah : " + nama);
            System.out.println("umur anda adalah : " + umur);
        } catch (Exception e) {
            System.out.println("terjadi kesalahan: ");

        } finally {
            input.close();
        }

      
    }

    
}
