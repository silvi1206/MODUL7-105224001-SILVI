public class LayananReguler extends LayananEkspedisi {
    // Constructor
    public LayananReguler(String nomorResi, Double beratAktualKg, Double panjang, Double lebar, Double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Override method hitungOngkir untuk layanan reguler
    @Override
    public Double hitungOngkir() {
        // tarif reguler : 15 rb per kg
        return hitungBeratEfektif() * 15000; // ongkir = berat efektif x tarif per kg
    }

    // overload untuk ongkir dengan diskon kalau member
    public Double hitungOngkir(boolean isMember, int jarakKm){
         // mengambil ongkir dasar
        Double total = hitungOngkir();

        // jika member
        if (isMember == true) {

            // dapat diskon 10%
            total = total - (total * 0.10);
        }

        // tambah biaya jarak
        total = total + (500 * jarakKm);

        // mengembalikan total
        return total;
    }
}
