import java.time.LocalDate;
public class PerpustakaanDemo {
    public static void main(String[] args) {

        System.out.println("|======================================================|");
        System.out.println("|       SELAMAT DATANG DIPERPUSTAKAAN POLINEMA         |");
        System.out.println("|======================================================|");
        //mahasiswa 1 meminjam 2 buku
        Buku buku1 = new Buku("Tere Liye", "Rindu", "Fantasi");
        Buku buku2= new Buku("Ira W. McCoy", "Sejarah Dunia", "Sejarah");

        //mahasiswa 2 meminjam 1 buku
        Buku buku3 =new Buku("Eka Kurniawan", "Cantik itu luka", "Fiksi" );
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Siska Nuri Aprilia", "2341760038", "Teknologi Informasi", "Sistem Informasi Bisnis","2F");
        Mahasiswa mahasiswa2 = new Mahasiswa("Intan Firdausi", "2341760183", "Teknologi Informasi","Sistem Informasi Bisnis", "2F");
        // Menambahkan peminjaman ke mahasiswa1
        mahasiswa1.tambahPeminjaman(LocalDate.of(2024, 9, 10), LocalDate.of(2024, 9, 24), buku1);
        mahasiswa1.tambahPeminjaman(LocalDate.of(2024, 9, 10), LocalDate.of(2024, 9, 24), buku2);
        // Menambahkan peminjaman ke mahasiswa2
        mahasiswa2.tambahPeminjaman(LocalDate.of(2024, 8, 12), LocalDate.of(2024, 8, 20), buku3);
        // Menampilkan informasi mahasiswa1 dan riwayat peminjaman
        System.out.println(" Informasi Mahasiswa 1 :");
        System.out.println(mahasiswa1.getInfo());
        System.out.println("--------------------------------------------------------");
        // Menampilkan informasi mahasiswa2 dan riwayat peminjaman
        System.out.println(" Informasi Mahasiswa 2 :");
        System.out.println(mahasiswa2.getInfo());
    }
}
