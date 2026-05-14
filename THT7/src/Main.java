import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Membuat ArrayList bertipe superclass
        // Bisa menyimpan semua subclass
        ArrayList<LayananEkspedisi> daftar = new ArrayList<>();

        // nambah object Reguler
        daftar.add(
                new LayananReguler("REG-11", 2.0, 50.0, 50.0, 50.0 )
        );

      // nambah object Express
        daftar.add(
                new LayananExpress( "EXP-22", 5.0, 10.0, 10.0, 10.0)
        );

      // nambah object Internasional
        daftar.add(
                new LayananInternasional( "INT-33", 3.0, 20.0, 20.0, 20.0, "Korea", 100.0)
        );

        // Variabel untuk menghitung total pendapatan perusahaan
        double totalPendapatanPerusahaan = 0;

        // Looping untuk memproses setiap layanan dalam daftar
        for (LayananEkspedisi layanan : daftar) {
            System.out.println("-===========================-");

            // Cetak data resi
            layanan.cetakDataResi();

            // tambah ongkir dasar
            totalPendapatanPerusahaan =
                    totalPendapatanPerusahaan
                            + layanan.hitungOngkir();


            
            // kalau objectnya Reguler
            if (layanan instanceof LayananReguler) {
                // Downcasting
                LayananReguler reguler =
                        (LayananReguler) layanan;

                // Method overloading
                double hargaPromo =
                        reguler.hitungOngkir(
                                true,
                                25
                        );

                // Tampilkan ongkir promo
                System.out.println( "Ongkir Member + Jarak : Rp" + hargaPromo );

            
            }


            // Kalau objectnya Express
            else if (layanan instanceof LayananExpress) {

            

                // Downcasting
                LayananExpress express =
                        (LayananExpress) layanan;

                // Method khusus express
                express.klaimAsuransi(1500000.0);

            
            }


           // Kalau objectnya Internasional
            else if (layanan instanceof LayananInternasional) {

           
                // Downcasting
                LayananInternasional internasional = (LayananInternasional) layanan;

                // Method khusus internasional
                internasional.cetakManifest();
            }

            
        }


       // Tampilkan total pendapatan perusahaan
         System.out.println("==============================");
        System.out.println( "Total Pendapatan Perusahaan : Rp" + totalPendapatanPerusahaan);
    }
}