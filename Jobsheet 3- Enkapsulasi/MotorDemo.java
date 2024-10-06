public class MotorDemo {

    public static void main(String[] args) {
        // Motor 1
        Motor motor1 = new Motor();
        motor1.displayInfo();

        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50); // Berhasil karena kecepatan di bawah 100
        motor1.displayInfo();

        // Motor 2
        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(120); // Akan menampilkan peringatan karena lebih dari 100
        motor2.displayInfo();

        // Motor 3
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(-10); // Berhasil karena kecepatan di bawah 100
        motor3.displayInfo();
    }
}
