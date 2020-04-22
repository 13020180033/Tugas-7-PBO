public class InterfaceSegitiga implements InterfaceBangunDatar {
    private double alas;
    private double tinggi;
    public String getJenis() {
        return JENIS;
    }
    public InterfaceSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double hitungLuas() {
        return alas * tinggi * 0.5;
    }
    public double hitungKeliling() {
        return alas * 3;
    }
}
public class InterfaceSample {
    public static void main(String[] args) {
        InterfaceBujurSangkar obyek1 = new InterfaceBujurSangkar(10);
        System.out.println("Jenisnya adalah : "+obyek1.getJenis());
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+obyek1.hitungLuas());
        System.out.println("Kelilingnya = "+obyek1.hitungKeliling());
        InterfaceSegitiga obyek2 = new InterfaceSegitiga(5,7.5);
        System.out.println("Jenisnya adalah : "+obyek2.getJenis());
        System.out.println("Luas segitiga dengan alas 5 dan tinggi 7.5 = "+obyek2.hitungLuas());
        System.out.println("Kelilingnya = "+obyek2.hitungKeliling());
    }
}