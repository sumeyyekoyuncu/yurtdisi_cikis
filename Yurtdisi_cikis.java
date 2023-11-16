
public class Yurtdisi_cikis {

    public static void main(String[] args) {
        System.out.println("havalimanina hos geldiniz");
        String sartlar="****yurt disina cikmak icin gerekli sartlar*****\n"+
                     "1-yurt disi harcini tam yatirmis olmaniz gerekmekte\n"+
                "2-siyasi yasaginiz bulunmamalı\n"+"3-gitmek istediginiz ulke icin vizenizi almis olmalisiniz";
        String mesaj="yurt disi sartlarinin tamamini saglamalisiniz...";
        while(true){
            System.out.println("-------------");
            System.out.println(sartlar);
            System.out.println("-------------");
            
            yolcu yolcu1=new yolcu();
            System.out.println("harc bedeli kontrol ediliyor...");
            if(yolcu1.yurtdisi_harci_kontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("siyasi yasak durumu kontrol ediliyor");
            
            if(yolcu1.siyasi_yasak_kontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyor...");
           
            if(yolcu1.vize_durumu_kontrol()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("islemleriniz eksiksiz.yurt disina cikabilirsiniz...");
            break;
        }
    }
}
