import java.util.*;

public class film {
    Scanner input = new Scanner(System.in);

    String judul;
    String genre;
    String jamTayang;
    int hargaTiket;

    studio studio_1 = new studio();
    studio studio_2 = new studio();
    studio studio_3 = new studio();

    studio kapasitas_1 = new studio();
    studio kapasitas_2 = new studio();
    studio kapasitas_3 = new studio();

    studio switchBioskop = new studio();

    void welcome(){
        System.out.println("Selamat datang di bioskop abc");
        System.out.println("Pilihan film yang tersedia:");
        separator();
    }

    void choosefilm (){
        System.out.print("Pilih film: ");
        judul = input.nextLine();

        switch (judul.toLowerCase()) {
            case "interstellar":
                descInterstellar();
                switchBioskop = studio_1;
                break;
            
            case "oppenheimer":
                descOppenheimer();
                switchBioskop = studio_2;
                break;

            case "la la land":
                descLaLaLand();
                switchBioskop = studio_3;
                break;
        }
        switchBioskop.switchStud(judul);
    }

    void descInterstellar(){
        judul = "Interstellar";
        genre = "Sci-fi";
        jamTayang = "18:00 WIB";
        hargaTiket = 45000;
    }

    void descOppenheimer(){
        judul = "Oppenheimer";
        genre = "Thriller";
        jamTayang = "20:00 WIB";
        hargaTiket = 40000;  
    }

    void descLaLaLand(){
        judul = "La La Land";
        genre = "Music";
        jamTayang = "22:00 WIB";
        hargaTiket = 35000;  
    }

    void separator(){
        System.out.println("====================");
    }

    void infoFilm(){
        System.out.println("Judul: "+judul);
        System.out.println("Genre: "+genre);
        System.out.println("Jam Tayang: "+jamTayang);
        System.out.println("Harga Tiket: "+hargaTiket);
    }
}
