package com.ahmetvatansever;

import java.io.File;

/*
    Bir alt sistemin sağladığı hizmetleri tek ve  basit bir arayüz üzerinden sunar.
    İstemciler bazen low level işlemlere/hizmetlere erişmek isteyebilirler fakat genel olarak istemciler
    detaylarla ilgilenmeden sadece derleyici alt sisteminin arayüzüyle işlerini yapmak isterler.
    Bu nedenle istemciler için alt sistemde yer alan nesnelerin sağladığı hizmetlerin tek ve birleştirici bir
    arayüz üzerinden açılması gerekir.

    İş mantığı çoğunlukla süreç yapısındadır ve gerçekleştirmede süreç olarak pek çok farklı nesneden hizmet
    alarak ilerler. Süreç çok fazla iş kuralı içerebilir. (Sürecin nasıl ilerlediği, ardı ardına/belirli bir sıra
    ile farklı hizmetlerin çağırılması, farklı durumlar/statüler için süreçsel değişiklikler vb.
    Bir hasta dosyası oluşturmak ya da  bir poliçe oluşturmak buna örnek verilebilir.)
    Böyle durumlarda istemci nesnelerin süreci tüm detayıyla bilmeleri istenemez.

    İş süreçlerinin istemci tarafından bilinmeye zorlanması, karmaşıklığı ve sorunları beraberinde getirebilecektir.
    Ayrıca süreç detayları gizli tutulması gereken aksiyonlarda içerebilir.
    Süreç detaylarındaki değişiklikler istemciyi etkileyecektir.
    Dolayısıyla detaylara değil arayüzlere bağımlı olma prensibi, alt sistemlerin birbirleriyle olan
    ilişkilerinde de geçerli olmalıdır.
    Facade design patterni sistemlerin ve alt sistemlerin karmaşıklığını azaltır, onları basit birer arayüze dönüştürür.

    Facade nesnesi sürecin tüm detaylarını bilir ve arayüzünde bir seferde çok iş yapacak şekilde metodlar sağlar.
    * Alt sistemlere bir giriş noktası sağlar.
    * Alt sistemlerin arayüzü olur.
    * Pek çok ince(detaya sahip) arayüzden oluşun bir sistemi daha basit, yalın, kullanan istemcilerin
    değişikliklerden etkilenmeyeceği bir arayüz sağlar.
    * Facade nesnelerinin kullanımı zaman zaman seçilen mimari ve teknolojilerden
    dolayı da faydalı hatta zorunlu olabilir.,
    * Facade birlikteliği(cohesion) düşük, bağımlılığı(coupling) yüksek olma eğilimindedir.
    (Çünkü Facade nesnesi gizlediği alt sistemin pek çok nesnesi ile haberleşir.)
    * Birden çok facade nesnesi kullanılabilir.
    * Hatta katmanlı bir facade yapısı olabilir.
    * Bu şekilde Facade birlikteliğinin çok düşmemesi, bağımlılığının da çok artmaması hedeflenir.
    * Facade metotları süreci başlatan, yönlendiren ve sonlandıran niteliklere sahiptir.
    * Facade metotları bu yüzden fazla sayıda parametre alma eğilimindedirler.
    * Facade kurumsal uygulamalarda sunucu tarafının arayüzü olarak hizmet eder.
    * Kurumsal uygulamalardaki katmalar arasındaki ilişkiyi basitleştiren en temel kalıptır.
    * Karmaşık bir sisteme az metot çağrısı ile çok iş yapacak şekilde erişmek istendiğinde Facade kullanılmalıdır.
    * Katmanlı yapı kullanırken her katman için bir giriş noktası olarak Facade kullanılır.

* */
public class Run {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("test.ogg", "mp4");
    }
}
