import java.io.FileWriter;
import java.io.IOException;

public class afileditulis {
    public static void main(String[] args ) {
        try {
            FileWriter x = new FileWriter("adata.txt");
            x.write("\n halo semuanya ini adalah write pertamaku"+ 789);
            x.write("\n ini yang keduanya ya gais");
            x.write("\n aku ni apoe");
            x.write("\n aku suka makan nasi");
            x.write("jangan ya dek ya");
            x.write("\n aku suka makan nasijangan ya dek ya");
            x.close();
            System.out.println("berhasil menulis file");
        } catch (IOException e) {
            System.out.println("terjadi kesalahan: " + e.getMessage());
        }


    }
    
}
