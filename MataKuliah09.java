public class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println(" ");
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam > jam){
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }

    public MataKuliah09(){
    }

    public MataKuliah09(String kode, String nm, int sks, int juJam){
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = juJam;
    }
}