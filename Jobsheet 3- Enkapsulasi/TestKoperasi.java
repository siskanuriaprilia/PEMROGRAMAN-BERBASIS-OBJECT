public class TestKoperasi {
    public static void main(String[] args) {
        
        Anggota anggota1 = new Anggota("0304052005", "Siska Nuri Aprilia" ,  5000000);


        System.out.println("====================================================");
        System.out.println("Nama Anggota        : " + anggota1.getNama());
        System.out.println("Limit Pinjaman      : " + anggota1.getLimitPinjam());
        System.out.println("====================================================");

        System.out.println();
        System.out.println("|-----------------------------|");
        System.out.println("| Meminjam uang Rp 10.000.000 |");
        System.out.println("|-----------------------------|");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah Pinjaman Saat ini : " + anggota1.getJumlahPinjam());

        System.out.println();
        System.out.println("|-----------------------------|");
        System.out.println("|  Meminjam uang Rp 4.000.000 |");
        System.out.println("|-----------------------------|");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah Pinjaman Saat ini : " + anggota1.getJumlahPinjam());

        System.out.println();
        System.out.println("|-----------------------------|");
        System.out.println("| Bayar angsuran Rp 1.000.000 |");
        System.out.println("|-----------------------------|");
        anggota1.angsur(1000000);
        System.out.println("Jumlah Pinjaman Saat ini : " + anggota1.getJumlahPinjam());


        System.out.println();
        System.out.println("|-----------------------------|");
        System.out.println("| Bayar angsuran Rp 2.000.000 |");
        System.out.println("|-----------------------------|");
        anggota1.angsur(2000000);
        System.out.println("Jumlah Pinjaman Saat ini : " + anggota1.getJumlahPinjam());


        System.out.println();
        System.out.println("Membayar angsuran 200.000");
        System.out.println("--------------------------------------------");
        anggota1.angsur(200000);

        System.out.println("Jumlah pinjaman saat ini : " + anggota1.getJumlahPinjam());



    }
}
