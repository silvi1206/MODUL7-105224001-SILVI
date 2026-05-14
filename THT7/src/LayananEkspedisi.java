public class LayananEkspedisi {
    public String nomorResi;
    public Double beratAktualKg;
    public Double panjang;
    public Double lebar;
    public Double tinggi;

    // Constructor
    // Constructor untuk inisialisasi atribut
    public LayananEkspedisi(String nomorResi, Double beratAktualKg, Double panjang, Double lebar, Double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // method untuk menghitung berat efektif
    public Double hitungBeratEfektif() {

        // menghitung berat volumetrik
        // rumus berat volumetrik: (panjang x lebar x tinggi) / 6000
        Double beratVolumetrik = (panjang * lebar * tinggi) / 6000;

        // mengecek apakah berat aktual lebih besar dari berat volumetrik
        if (beratAktualKg > beratVolumetrik) {
            return beratAktualKg; // jika berat aktual lebih besar, maka berat efektif adalah berat aktual
        } else {
            return beratVolumetrik; // jika berat volumetrik lebih besar, maka berat efektif adalah berat volumetrik
        }
    }

    // method untuk mencetak data resi
    public void cetakDataResi() {
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Berat Efektif (kg): " + hitungBeratEfektif() + " kg");
    }

    //method polymorphism
    //nanti di overide di kelas anak
    public Double hitungOngkir(){
        // default nilai awalnya
        return 0.0;
    }
    
}
