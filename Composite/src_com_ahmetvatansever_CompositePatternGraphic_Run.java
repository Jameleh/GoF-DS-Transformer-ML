package com.ahmetvatansever.CompositePatternGraphic;

/*
    Composite design pattern, bileşik nesne ve parçaları ile istemci arasındaki ilişkiyi karmaşıklıktan uzak bir
    şekilde yönetmek amacıyla kullanılır. İstemcinin bileşik nesnedeki tüm parçalar ile tek tek uğraşmasındansa
    yalnızca bileşik nesne ile uğraşmasını ve böylece parçalara da ulaşabilmesini hedefler.
    Yapısal(Structural) tasarım desenlerinden biridir ve kullanımı ile birlikte istemci rahatlığı açısından önemli
    avantajlar elde edilir.

    Composite kalıbında öncelikle parçalarla bütünün ortak bir arayüze sahip olması sağlanır. Bu durumda istemci
    bileşik nesneyi de parçaları da aynı şekilde kullanır.

    Sonrasında bileşik nesne ile bileşik nesne ile parçalar arasındaki ilişki düzenlenir.
    Bu amaçla bileşik nesnenin bir torba(collection) arayüze sahip olması sağlanır.

    Dolayısıyla istemci, bütün-parça ilişkisinin karmaşıklığından uzak tutulur ve parçalarla uğraşmayıp,
    sadece bütün ile iletişimde bulunur.

    Sisteme yeni parçalar eklemek kolaydır.

    Örnek olarak bir siparişin toplam fiyatının hesaplanacağını varsayalım. Bu durumda bir konteynır içerisindeki
    kutuların, her kutu içerisindeki daha küçük kutular ya da bir veya birden fazla
    ürüne ait fiyatların ayrı ayrı toplanması gerekir. Kaldıki bu her durumda değişkenlik gösteren bir yapıda olabilir.
    (Konteynır içerisinde 3 ya da 5 kutu olması, kutular içerisindeki ürün sayısının değişkenlik gösterebilmesi gibi)

    Çözüm olarak konteynır, kutu ya da ürün bizim bir ağaç yapısı şeklinde çalışmamız gerekenler her ne ise ortak bir
    arayüz üzerinde çalışarak hepsine aynı şekilde davranabiliriz. Bu nesnenin ne olduğunu(konteynır, kutu, ürün)
    bilmemize gerek kalmadan işlem yapmamıza olanak tanır.

   */
public class Run {
   public static void main(String[] args) {
      CompositeGraphic display = new Canvas("Display", "Light Green");

      Circle redCircle = new Circle("Rec Circle", "Red");
      display.addGraphic(redCircle);

      Circle blueCircle = new Circle("Blue Circle", "Blue");
      display.addGraphic(redCircle);

      Ellipse ellipse = new Ellipse("Black Ellipse", "Black");
      display.addGraphic(ellipse);

      Triangle triangle = new Triangle("Triagle", "Yellow");
      display.addGraphic(triangle);

      Rectangle yellowRectangle = new Rectangle("Rectangle", "Yellow");
      display.addGraphic(yellowRectangle);

      Rectangle greenRectangle = new Rectangle("Rectangle", "Green");
      display.addGraphic(greenRectangle);

      display.listGraphic();

      Graphic graphic = (Graphic) display;
      graphic.draw();
      graphic.paint();

      System.out.println();
      Rectangle greenRectangle2 = new Rectangle("Rectangle2", "Green");
      greenRectangle2.draw();
   }
}
