import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggalPeminjaman;
    private LocalDate tanggalPengembalian;
    private Buku buku;

    public LocalDate getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(LocalDate tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public LocalDate getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(LocalDate tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getInfo() {
        String info = " Tanggal Peminjaman     : " + tanggalPeminjaman + "\n";
        info += " Tanggal Pengembalian   : " + tanggalPengembalian + "\n";
        if (buku != null) {
            info += " Buku    : " + buku.getInfo() + "\n"; 
        } else {
            info += " Buku    : Tidak ada informasi riwayat peminjaman\n";
        }
        return info;
    }
}
