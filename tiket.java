import java.util.Scanner;

public class tiket {
    Scanner input = new Scanner(System.in);

    int nomorTiket;
    String film;
    String studio;
    String nomorKursi;
    String nama;
    String row;
    String line;

    void setnomorTiket(){
        nomorTiket = (int)(Math.random()*100000);
    }

    void setnomorKursi(){
        System.out.print("Pilih row kursi anda(A-E): ");
        row = input.next();
        System.out.print("Pilih line kursi anda(1-10): ");
        line = input.next();
        this.nomorKursi = row+line;
    }

    void infoTiket(){
        System.out.println("Nomor Tiket: "+nomorTiket);
        System.out.println("Nomor Kursi: "+nomorKursi);
    }

    
}
