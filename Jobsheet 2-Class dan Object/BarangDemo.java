public class BarangDemo {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor= 3500;
        barang1.diskon = 0.1;

        Barang barang2 = new Barang();
        barang2.kode = "ATK02";
        barang2.nama = "Penghapus 2B";
        barang2.hargaKotor = 4000;
        barang2.diskon = 0.2;

        barang1.displayInfo();
        System.out.println();
        barang2.displayInfo();
    }
    
}
