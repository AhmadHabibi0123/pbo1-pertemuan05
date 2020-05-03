package TugasPBO;

public class Kucing {
    String nama;
    String umur;
    String jenis;
    String pemilik;
    String warna;

    String getNama(){
        return nama;
    }
    void setNama (String nama){
        this.nama = nama;
    }
    String getUmur(){
        return umur;
    }
    void setUmur (String umur){
        this.umur = umur;
    }
    String getJenis(){
        return jenis;
    }
    void setJenis (String jenis){
        this.jenis = jenis;
    }
    String getPemilik(){
        return pemilik;
    }
    void setPemilik (String pemilik){
        this.pemilik = pemilik;
    }
    String getWarna(){
        return warna;
    }
    void setWarna (String warna) {
        this.warna = warna;
    }

    void tidur(){
        System.out.println("kucing lagi tidur");
    }
    void makan(){
        System.out.println("kucing lagi makan");
    }
    void bermain(){
        System.out.println("kucing lagi bermain");
    }
}


