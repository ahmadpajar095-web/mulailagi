public class Perulangan {
   public static void main(String[] args){
         // Perulangan for
         System.out.println("Perulangan for:");
         String nama = "*";
         for (int i = 1; i <= 5; i++) {
              System.out.println(nama);
              nama += " *";
         }
    
         // Perulangan while
         System.out.println("\nPerulangan while:");
         int j = 1;
         while (j <= 5) {
              System.out.println("while ke-" + j);
              j++;
         }
    
         // Perulangan do-while
         System.out.println("\nPerulangan do-while:");
         int k = 1;
         do {
              System.out.println("do-while ke-" + k);
              k++;
         } while (k <= 5);


   }
    
    
}
