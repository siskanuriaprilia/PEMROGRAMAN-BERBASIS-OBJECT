public class Laptop {
    // Atribut
    public String merk;
    public String model;
    public double harga;
    public int tahunProduksi;
    public int stok;

    // Method untuk menampilkan informasi dasar laptop
    public void tampilkanInformasi() {
        System.out.println("Merk             : " + merk);
        System.out.println("Model            : " + model);
        System.out.println("Harga            : " + harga);
        System.out.println("Tahun Produksi   : " + tahunProduksi);
        System.out.println("Stok             : " + stok);
    }

    // Method untuk mengatur stok
    public void getStok(int jumlah) {
        stok = jumlah;
    }

    // Method untuk menambah stok
    public void gettambahStok(int jumlah) {
        stok += jumlah;
    }
}
