import java.util.Scanner;

public class tugasMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        film movie = new film();

        film interstellar = new film();
        film oppenheimer = new film();
        film lalaland = new film();

        studio studi0 = new studio();
        tiket tiketPenonton = new tiket();

        studio stud1 = new studio();
        studio stud2 = new studio();
        studio stud3 = new studio();

        penonton user = new penonton();

        movie.welcome();

        interstellar.descInterstellar();
        interstellar.infoFilm();
        stud1.descStud1();
        stud1.infoStudio();

        movie.separator();

        oppenheimer.descOppenheimer();
        oppenheimer.infoFilm();
        stud2.descStud2();
        stud2.infoStudio();

        movie.separator();

        lalaland.descLaLaLand();
        lalaland.infoFilm();
        stud3.descStud3();
        stud3.infoStudio();

        movie.separator();

        System.out.print("Masukkan banyak tiket yang ingin anda pesan: ");
        int jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            user.setNamaPenonton();
            movie.choosefilm();
            studi0.switchStud(movie.judul);

            tiketPenonton.setnomorKursi();
            tiketPenonton.setnomorTiket();
            movie.separator();
            user.infoPenonton();
            movie.infoFilm();
            studi0.infoStudio();

            tiketPenonton.infoTiket();
            if (i != jumlah - 1) {
                movie.separator();
            }
        }
    }
}
