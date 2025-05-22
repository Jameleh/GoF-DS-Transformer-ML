package com.ahmetvatansever.FlyweightPatternCarBrand;

public class Run {

    /*
      Flyweight tasarım kalıbı Structural(Yapısal) tasarım kalıplarından biridir.
      Ufak tefek fakat sayıca çok fazla nesne üretmemiz gerektiği durumlarda kullanılır.
      Nesne sayısının artışının önüne geçmek amacıyla nesnelerin tekrar kullanımını sağlamak gerekir.
      Flyweight object farklı anlarda ortak kullanılabilen nesnedir.
      Flyweight nesnenin durumu 2 şekilde ifade edilir.
        1-İçsel(Asıl) durum (intricsic state) : Nesnenin temsil ettiği asıl durumdur.
        Konumundan/contexinden bağımsız bu obje ne objesi bilgisidir.
        Örneğin bir asker objesi, seyirci objesi, araba objesi olması gibi.

        2-Dışsal(İkincil) durum (extrinsic state) : Bağlamsal durumu ifade eder.
        Örneğin bir askerin konumu. Askerin harekt bilgisi sonucu ortaya çıkar.
        Bu o nesneye özgü o an var olan bir özellik/niteliktir.
        Ya da bir harfin "A" harfi olması içsel durum iken bu harfin hangi sayfada, hangi satırda,
        italik ya da bold olması gibi özellikleri dışsal durumunu ifade eder.

        * Avantajları
        - Bellek Verimliliği : Özellikle çok sayıda benzer nesne ile çalışma gerekliliğinde
                               nesneler arasındaki ortak noktaları tespit ederek bellek kullanımını
                               önemli ölçüde azaltmaya olanak tanır.
                               Flyweight modeli, metin editörleri, grafik kullanıcı arayüzleri veya
                               oyun geliştirme gibi bellek kullanımı optimizasyonunun çok önemli olduğu senaryolarda
                               yaygın olarak kullanılır.
        - Performans         : Bellek kullanımını azaltarak, uygulamanın daha fazla sayıda nesneyi daha verimli
                               bir şekilde işleyebilmesini sağlayarak performansı dolaylı olarak artırır.
        - Ölçeklenebilirlik  : Nesne sayısının bellek üzerinde önemli bir etkiye neden olmadan dinamik olarak
                               artabileceği senaryolar için uygun getirir.
        - Esneklik           : Paylaşılan içsel özellikleri etkilemeden dışsal bilgilerin değiştirilmesine
                               olanak tanır.

        * FlyWeight Tasarım Desenin Kullanırken Dikkat Edilmesi Gerekenler
        - Önemli benzerlikleri paylaşan çok sayıda nesneyle uğraşırken en etkilidir.
          Başarılı uygulama için içsel özelliklerdeki ortak noktaların belirlenmesi çok önemlidir.

        - Dışsal durumu yönetmeye dikkat edilmelidir.
          Dışsal bilgilerdeki değişiklikler, paylaşılan içsel durumun bütünlüğünü tehlikeye atmamalıdır.

        - Dışsal durum ne kadar basit ise Flyweight nesnenin kullanımı o kadar kolaylaşır.

        - Ne kadar az sayıda nesne yaratılırsa o kadar az bellek kullanımı söz konusu olabilir.

        - Kaç nesnenin aynı anda kullanılacağı yaratılacak nesne sayısını belirleyen farktördür.

    */

    private static final String[] types = {"Car", "Ship", "Ship", "Car", "Car", "Ship"};
    private static final String[] brands = {"BMW", "BMW", "Bugatti", "Bentley", "Chevrolet", "Mercedes"};
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println("### " + i + " ###");
            Vehicle vehicle = VehicleFactory.getVehicle(types[i]);
            vehicle.assignVehicleBrand(brands[i]);
            vehicle.build();
            System.out.println("------------------------------------------");
        }
    }
}
