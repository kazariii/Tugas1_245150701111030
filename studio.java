public class studio {
    String nomorStudio;
    int kapasitasKursi;

    void descStud1(){
        nomorStudio = "1";
        kapasitasKursi = 50;
    }

    void descStud2(){
        nomorStudio = "2";
        kapasitasKursi = 50;
    }

    void descStud3(){
        nomorStudio = "3";
        kapasitasKursi = 50;
    }

    void switchStud (String judul){
        switch (judul.toLowerCase()) {
            case "interstellar":
                descStud1();
                break;
            
            case "oppenheimer":
                descStud2();
                break;

            case "la la land":
                descStud3();
                break;
        }
    }

    void infoStudio(){
        System.out.println("Studio "+nomorStudio);
        System.out.println("Kapasitas Kursi: "+kapasitasKursi);
    }
}
