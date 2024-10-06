public class Anggota {
    public String nomorKTP;
    public String nama;
    public int limitPeminjaman;
    private int jumlahPinjaman;

    // Konstruktor
    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }
     
    // Getter untuk jumlah pinjaman
    public int getJumlahPinjam() {
        return jumlahPinjaman;
    }

    // Getter untuk limit peminjaman
    public int getLimitPinjam() {
        return limitPeminjaman;
    }

    // Metode untuk melakukan angsuran
    public void angsur(int jumlah) {
        if (jumlah > jumlahPinjaman+ 0.1) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
        }
    }

    // Metode untuk melakukan pinjaman
    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi batas limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }
}
