import java.util.*;

public class penonton {
    Scanner input = new Scanner(System.in);
        String namaPenonton;
        film separator = new film();

        void setNamaPenonton(){
            System.out.print("Masukkan nama anda sebelum memilih tiket: ");
            namaPenonton = input.nextLine();
        }

        void infoPenonton(){
            System.out.println("\tTIKET");
            separator.separator();
            System.out.println("Nama: "+namaPenonton);
        }
}
