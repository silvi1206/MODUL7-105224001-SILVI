public class LayananInternasional extends LayananEkspedisi {

    public String negaraTujuan;
    public Double nilaiBarangUSD;

    // Constructor
    public LayananInternasional(String nomorResi, Double beratAktualKg, Double panjang, Double lebar, Double tinggi, String negaraTujuan, Double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi); // memanggil constructor dari kelas induk
        this.negaraTujuan = negaraTujuan; // inisialisasi atribut negara tujuan
        this.nilaiBarangUSD = nilaiBarangUSD; // inisialisasi atribut nilai barang dalam USD
    }

    // Override method hitungOngkir untuk layanan internasional
    @Override
    public Double hitungOngkir() {
        //ongkir dasar
        Double ongkirDasar = hitungBeratEfektif() * 200000; // tarif internasional : 200 rb per kg

        //nilai awal pajak
        Double pajak = 0.0;

        // jika nilai barang lebih dari 50 USD, maka dikenakan pajak 20%
        if (nilaiBarangUSD > 50) {
            pajak = ongkirDasar * 0.20; // pajak = ongkir dasar x 20%
        }

        // total ongkir = ongkir dasar + pajak
        return ongkirDasar + pajak;
    }

    // method khusus layanan internasional
    public void cetakManifest(){

        // menampilkan manifest pengiriman internasional
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai : $ " + nilaiBarangUSD);
    }
    
}
