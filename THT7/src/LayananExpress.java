public class LayananExpress extends LayananEkspedisi {
    // Constructor
    public LayananExpress(String nomorResi, Double beratAktualKg, Double panjang, Double lebar, Double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi); // memanggil constructor dari kelas induk
    }

    // Override method hitungOngkir untuk layanan express
    @Override
    public Double hitungOngkir() {
        // tarif express : 30 rb per kg
        return hitungBeratEfektif() * 30000; // ongkir = berat efektif x tarif per kg
    }

    // method khusus layanan express
    public void klaimAsuransi(Double nilaiBarang) {
        // jika nilai barang lebih dari 1 juta
        if (nilaiBarang > 1000000){
            System.out.println("KLAIM ASURANSI VIP Rp " + nilaiBarang + " untuk resi " + nomorResi + " Sedang diproses prioritas "); // jika nilai barang lebih dari 1 juta, maka klaim asuransi VIP diproses prioritas
        } else {
            System.out.println("KLAIM ASURANSI STANDAR DIPROSES DALAM 7 HARI KERJA."); // jika nilai barang 1 juta atau kurang
        }
    }
    
    
}
