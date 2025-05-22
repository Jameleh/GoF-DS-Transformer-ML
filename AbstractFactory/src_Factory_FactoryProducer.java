package Factory;

import Factory.Enums.Types;

public class FactoryProducer {
    public static AbstractFactory getFactory(Types type){
        switch (type){
            case Modern:
                return new ModernTypeFactory();
            case Victorian:
                return new VictorianTypeFactory();
            case ArtDeco:
                return new ArtDecoTypeFactory();
            default:
                return null;
        }
    }
}
