// Interface untuk bangun ruang
interface BangunRuang {
    double hitungVolume();
}

// Abstract class sebagai template untuk bentuk umum bangun datar
abstract class BangunDatar {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

// Class segitiga yang merupakan turunan dari BangunDatar
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga() {
        this.alas = 0;
        this.tinggi = 0;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double hitungKeliling() {
        // Untuk seder simplicity, anggap saja segitiga adalah segitiga sama sisi
        return 3 * alas;
    }
}

// Class persegi yang merupakan turunan dari BangunDatar
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }
}

// Class balok yang merupakan turunan dari BangunRuang
class Balok extends Segitiga implements BangunRuang {
    private double tinggi;

    public Balok(double alas, double tinggi, double tinggiBalok) {
        super(alas, tinggi);
        this.tinggi = tinggiBalok;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(5);
        segitiga.setTinggi(3);

        Persegi persegi = new Persegi(4);

        BangunRuang balok = new Balok(3, 4, 5);

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Volume Balok: " + balok.hitungVolume());
    }
}
