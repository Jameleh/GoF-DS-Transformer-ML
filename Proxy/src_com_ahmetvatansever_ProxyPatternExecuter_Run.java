package com.ahmetvatansever.ProxyPatternExecuter;

/*
    Güvenlik, maliyet, teknik kısıtlar(nesne erişim dışında olabilir), katma değerli hizmetler sunmak gibi
    nedenlerden dolayı bir nesneye olan erişimi kontrol etmek gerekebilir.
    Proxy tasarım deseni, oluşturduğumuz bir Proxy sınıf üzerinden, başka bir sınıfı temsil etmemizi sağlar.

    Katma değerli hizmetlerde nesneye erişim öncesinde/sonrasında farklı işler yapmak gerekebilir.
    Bunlar erişim isteklerini saymak, düzenlemek, kuyruğa sokmak, loglar tutmak vb. olabilir.

    Proxy nesnenin arayüzü, doğrudan erişimi kontrol edilmek istenen nesne ile aynı olursa istemci
    bu durumdan haberdar olamaz, asıl nesne ile proxy nesneyi ayırt edemez.

    Proxy nesne istemciyi asıl nesneden yalıtır ve asıl nesneye olan bağımlılığı ortadan kaldırır.

    Proxy nesne kısıtları yöneterek asıl nesnenin birlikteliğini yükseltmeye de yardımcı olur.

    Büyük nesnelerin yüklenmesini istemcinin isteme anına kadar geciktirmede proxy kalıbı kullanılabilir.
    Bu durumda ara nesne(placeholder) asıl nesne varmış gibi davranan, onun yerine geçen sahte vekil(virtual proxy) nesnedir.
    İstemci ise ara nesnenin varlığında çalışmakta ve gerçekte asıl nesnenin belleğe yüklenmediğini bilmemektedir.
    İstemci asıl nesneye ihtiyaç olduğunda vekil nesne asıl nesnenin oluşturulmasını sağlayıp kendisine gelen
    çağrıları ona yönlendirir.

    Ne zaman bir nesne, alt sistem ya da sisteme erişimi kontrol, saklama ihtiyacı varsa proxy design patern kullanılır.
    İstemci saklanan nesne ya da sistem varmış gibi çalışmaya devam eder.
    Bu sayade istemci vekilin sakladığı yerdeki değişimlerden de yalıtılır.

    Vekil ne tür bir vekalet yaptığına göre istekleri gerçek nesneye iletir. Erişim kontrol ihtiyacının sebebine göre
    vekil nesne farklı işlevler görür:
    Remote proxy (uzak vekil) : Dağıtık nesneler ve web servisleri
    Virtual Proxy (sahte vekil) : Geç yüklemeli sistemtemlerde, ön bellek gerçekleştirmelerinde
    Protection Proxy (koruyan vekil) : Güvenlik, erişim kısıtı vb durumlarda
    Logging Proxy : İstenilen belirli işlemlerden önce veya sonra, log göndermek için kullanır.

    Diğer kalıplarla ilişkisi;
    Proxy ile Adapter arasındaki fark, Proxynin sakladığı nesne ile aynı arayüze sahip olmasına karşın Adapter farklı arayüzdedir
    Proxy ile Facade arasındaki fark, ilkinin sakladığı nesne ile aynı arayüze sahip olmasına karşın Facade farklı
    arayüzleri basitleştirerek bir yerde toplamaktadır.
* */
public class Run {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Ahmet", "Vatansever");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
