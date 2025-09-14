public class fungsidasar {
    public static void sapa(String nama){
        System.out.println("Hello " + nama + " Selamat Pagi");
    }

    public static int tambah(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        sapa("Joko");
        sapa("Budi");
        sapa("Siti");

        int hasil = tambah(5, 10);
        System.out.println("Hasil: " + hasil);
    }
}

