
public class Buku {
    private String penulis;
    private String judul;
    private String genre;


    public Buku(String penulis, String judul, String genre) {
        this.penulis = penulis;
        this.judul = judul;
        this.genre = genre;
    }

    // Getter 
    public String getPenulis() {
        return penulis;
        
    }

    // Setter
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Getter untuk judul
    public String getJudul() {
        return judul;
    }

    // Setter untuk judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter untuk genre
    public String getGenre() {
        return genre;
    }

    // Setter untuk genre
    public void setGenre(String genre) {
        this.genre = genre;
    }


    // Metode untuk mendapatkan informasi buku
    public String getInfo() {
        return judul + " oleh " + penulis + " (Genre: " + genre + ")";
    }

}
