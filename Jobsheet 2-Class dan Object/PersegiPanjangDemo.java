public class PersegiPanjangDemo {
        public static void main(String[] args) {
            PersegiPanjang pp = new PersegiPanjang();
            pp.panjang = 20; 
            pp.lebar = 10;    
            
            pp.displayInfo();
            System.out.println("---------------------------------");
            // Menghitung dan menampilkan luas
            int luas = pp.getLuas();
            System.out.println("Luas Persegi Panjang        = " + luas);
    
            // Menghitung dan menampilkan keliling
            int keliling = pp.getKeliling();
            System.out.println("Keliling Persegi Panjang    = " + keliling);

    
        }
    }

