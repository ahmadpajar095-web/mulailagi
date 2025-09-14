public class publikprivatmain {
    public static void main(String[] args ) {
        publikprivat p = new publikprivat();
        p.masukkannama("Budi");
        p.masukkanumur(20);

        System.out.println("nama: " + p.ambilnama());
        System.out.println("umur: " + p.ambilumur());
    }
    
}
