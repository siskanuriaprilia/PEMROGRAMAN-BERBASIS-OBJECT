public class LaptopDemo {
    public static void main(String[] args) {
        // Membuat objek Laptop pertama
        Laptop laptop1 = new Laptop();
        laptop1.merk = "Asus";
        laptop1.model = "ZenBook 14";
        laptop1.harga = 15000000;
        laptop1.tahunProduksi = 2023;
        laptop1.getStok(20); // Mengatur stok awal


        // Menampilkan informasi laptop pertama
        System.out.println("Informasi Laptop 1:");
        laptop1.tampilkanInformasi();
        System.out.println();

        // Menambah stok laptop pertama
        laptop1.gettambahStok(10);
        System.out.println("Informasi setelah menambah stok Laptop 1:");
        laptop1.tampilkanInformasi();
        System.out.println();

        // Membuat objek Laptop kedua
        Laptop laptop2 = new Laptop();
        laptop2.merk = "Dell";
        laptop2.model = "Inspiron 15";
        laptop2.harga = 12000000;
        laptop2.tahunProduksi = 2022;
        laptop2.getStok(15); // Mengatur stok awal

        // Menampilkan informasi laptop kedua
        System.out.println("Informasi Laptop 2:");
        laptop2.tampilkanInformasi();

        laptop2.gettambahStok(3);
        System.out.println("Informasi setelah menambah stok Laptop 2");
        laptop2.tampilkanInformasi();
        System.out.println();
    }
}
