public class Bioskop {
    public String namaStudio;
    public String daftarFilm;
    public int jumlahTiket;
    public int hargaTiket;
    public double diskon; 

    // Menghitung total harga sebelum diskon
    public double getTotalHarga() {
        return jumlahTiket * hargaTiket;
    }

    // Menghitung harga bersih setelah diskon
    public double getHargaBersih() {
        double hargaKotor = getTotalHarga();
        return hargaKotor - (diskon * hargaKotor);
    }

    // Menampilkan informasi lengkap bioskop
    public void displayInfo() {
        System.out.println("Nama Studio    : " + namaStudio);
        System.out.println("Daftar Film    : " + daftarFilm);
        System.out.println("Jumlah Tiket   : " + jumlahTiket);
        System.out.println("Harga Tiket    : " + hargaTiket);
        System.out.println("Total Harga Sebelum Diskon    : " + getTotalHarga());
        System.out.println("Total Harga Setelah Diskon    : " + getHargaBersih());
    }
}
