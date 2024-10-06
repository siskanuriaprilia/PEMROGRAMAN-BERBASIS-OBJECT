import java.time.LocalDate;
import java.util.ArrayList;

public class Mahasiswa {
    
    private String nama;
    private String nim; 
    private String jurusan;
    private String prodi;
    private String kelas;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    
    public Mahasiswa(String nama, String nim, String jurusan, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.kelas = kelas;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() { 
        return nim;
    }

    public void setNim(String nim) {  
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Menambah data peminjaman
    public void tambahPeminjaman(LocalDate tanggalPeminjaman, LocalDate tanggalPengembalian, Buku buku) {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setTanggalPeminjaman(tanggalPeminjaman);
        peminjaman.setTanggalPengembalian(tanggalPengembalian);
        peminjaman.setBuku(buku);
        riwayatPeminjaman.add(peminjaman);
    }

    // Menampilkan informasi lengkap mahasiswa beserta riwayat peminjaman
    public String getInfo() {
        String info = " Nama    : " + nama + "\n";
        info +=       " NIM     : " + nim + "\n";
        info +=       " Jurusan : " + jurusan + "\n";
        info +=       " Prodi   : " + prodi + "\n";
        info +=       " Kelas   : " + kelas + "\n";

        //menginisialisasi attriute riwayatPeminjaman
        if (!riwayatPeminjaman.isEmpty()) {
            info += "> Riwayat Peminjaman <\n";
            for (Peminjaman peminjaman : riwayatPeminjaman) {
                info += peminjaman.getInfo() + "\n";
            }
        } else {
            info += "Belum ada riwayat peminjaman\n";
        }

        return info;
    }
}
