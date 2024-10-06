public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayInfo()
    {
        System.out.println("Plat Nomor   : " + this.platNomor);
        System.out.println("Status Mesin : " + (this.isMesinOn ? "On" : "off"));
        System.out.println("Kecepatan    : " + this.kecepatan);
        System.out.println("==================================================");
    }

    public String getPlatNomor()
    {
        return platNomor;
    }

    public void setPlatNomor(String platNomor)
    {
        this.platNomor = platNomor;
    }

    public boolean getIsMesinOn()
        {
            return isMesinOn;
        }

    public void setIsMesinOn(boolean isMesinOn)
    {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan()
    {
        return kecepatan;
    }

    // Setter untuk kecepatan dengan batasan negatif dan maksimal 100
    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh lebih dari 100!");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        } else {
            this.kecepatan = kecepatan;
        }
    }
}