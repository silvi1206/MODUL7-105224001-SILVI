import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {

    Perangkatpintar[] perangkat = new Perangkatpintar[2];
      perangkat[0] = new Lampupintar();
      perangkat[1] = new Acpintar(); 
      // meskipun variabel perangkat bertipe PerangkatPintar, namun objek yang dibuat adalah LampuPintar dan AcPintar. Hal ini memungkinkan kita untuk menggunakan konsep polymorphism, di mana kita dapat memanggil method aktifkan() yang telah di override di masing-masing class turunan, meskipun variabelnya bertipe PerangkatPintar.
    // dari Lampu atau AC. Ini karena Java melihat benda aslinya di memori (Polimorfisme).

    for (int i = 0; i < perangkat.length; i++) {
            // Mengambil objek berdasarkan index i
            Perangkatpintar p = perangkat[i];
            
            System.out.print("Perangkat ke-" + i + ": ");
            p.aktifkan(); 

        
        if (p instanceof Acpintar) {
        // Downcasting dari PerangkatPintar ke AcPintar
        Acpintar ac = (Acpintar) p; 
        ac.aturSuhu(20);
        }

        // Perangkatpintar alat1 = new Lampupintar();
        // alat1.aturKecerahan(75, "putih ");
        // error karena method aturKecerahan tidak ada di class Perangkatpintar, sehingga harus dilakukan downcasting terlebih dahulu
        
    
}
}
}
