import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.print("Masukkan nama: ");
        mhs1.nama= input.next();
        System.out.print("Masukkan umur: ");
        mhs1.umur= input.nextInt();

        Mahasiswa mhs2 = new Mahasiswa();
        System.out.print("Masukkan nama: ");
        mhs2.nama= input.next();
        System.out.print("Masukkan umur: ");
        mhs2.umur= input.nextInt();
        input.close();

        mhs1.sapa();
        mhs2.sapa();
    }
    
}
