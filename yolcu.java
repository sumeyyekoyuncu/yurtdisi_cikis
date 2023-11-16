
import java.util.Scanner;


public class yolcu implements yurtdisi_kurallari{
    private int harc;
    private boolean siyasiyasak;
    private boolean vizedurumu;
     
    
    public yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("ne kadar harc yatirdiniz?     ");
        this.harc=scanner.nextInt();
        scanner.nextLine();      //scannerdaki hatayı engellemek için dummy deger.
        System.out.print("siyasi yasaginiz bulunuyor mu?    (evet ya da hayir)   ");
        String cevap=scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiyasak=false;
        }
        else{
            this.siyasiyasak=true;
        }
        System.out.print("vize alabildiniz mi?  (evet ya da hayir)  ");
        String cevap2=scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizedurumu=true;
        }
        else{
            this.vizedurumu=false;
        }
    }

    @Override
    public boolean yurtdisi_harci_kontrol() {
        if(this.harc<150){
            System.out.println("yeterli harc yatirmadiniz...");
            return false;
        }
        else{
            System.out.println("yurt disi harc islemi basarili...");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        if(this.siyasiyasak==false){
            System.out.println("siyasi yasaginiz bulunmakta...yurt disina cikamazsiniz...");
            return false;
        }
        else{
            System.out.println("siyasi yasaginiz yoktur...");
            return true;
        }
    }

    @Override
    public boolean vize_durumu_kontrol() {
        if(this.vizedurumu==true){
            System.out.println("vize islemleri tamamdir...");
            return true;
        }
        else{
            System.out.println("gitmek istediginiz ulkeye vizeniz bulunmamaktadir...");
            return false;
        }
        
    }
    
}
