public class App {
    public static void main(String[] args) {
        MetodePembayaran[] daftarPembayaran = new MetodePembayaran[2];

        daftarPembayaran[0] = new EWallet();
        daftarPembayaran[1] = new KartuKredit();

        System.out.println("--- MEMULAI PROSES PEMBAYARAN ---\n");

        for (int i = 0; i < daftarPembayaran.length; i++) {
            MetodePembayaran mp = daftarPembayaran[i];
            mp.bayar(100000.0);
            if (mp instanceof EWallet) {
                EWallet dompet = (EWallet) mp;
                dompet.bayar(50000.0, "08123456789");
            } 
            else if (mp instanceof KartuKredit) {
                KartuKredit kartu = (KartuKredit) mp;
                kartu.verifikasiPIN();
            }

            System.out.println("----------------------------------");
        }
    }
}