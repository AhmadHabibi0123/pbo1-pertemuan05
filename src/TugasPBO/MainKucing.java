package TugasPBO;

public class MainKucing {
    public static void main(String[] args) {
        Kucing m= new Kucing();

        m.setNama("Ketty");
        m.setUmur("1 tahun"); ;
        m.setJenis("Anggora");
        m.setPemilik("Habibi");
        m.setWarna("orange, putih, Hitam");

        System.out.println("Nama : "+ m.getNama());
        System.out.println("Umur : "+ m.getUmur());
        System.out.println("Jenis : "+ m.getJenis());
        System.out.println("Pemilik : "+ m.getPemilik());
        System.out.println("Warna : "+ m.getWarna());

        System.out.println();
        m.tidur();
        System.out.println();
        m.makan();
        System.out.println();
        m.bermain();
    }
}
