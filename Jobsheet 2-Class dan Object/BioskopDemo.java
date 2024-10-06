public class BioskopDemo {
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("|    Selamat Datang Di Mopic Cinemas Malang    |");
        System.out.println("===============================================");

        
        Bioskop b1 = new Bioskop();
        b1.namaStudio = "Deluxe";
        b1.daftarFilm = "Pengabdi Setan";
        b1.jumlahTiket = 10;
        b1.hargaTiket = 35000;
        b1.diskon = 0.1; // Diskon harga tiket 0.1% 

        // Menampilkan informasi bioskop pertama
        b1.displayInfo();
        System.out.println();

        // Membuat objek Bioskop kedua
        Bioskop b2 = new Bioskop();
        b2.namaStudio = "IMAX";
        b2.daftarFilm = "Dilan 1990";
        b2.jumlahTiket = 2;
        b2.hargaTiket = 20000;
        b2.diskon = 0.1; // Diskon harga tiket 0.1%

        b2.displayInfo();
    }
}
