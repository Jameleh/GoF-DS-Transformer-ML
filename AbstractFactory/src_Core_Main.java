package Core;

import Factory.*;
import Factory.Enums.FurnitureType;
import Factory.Enums.Types;

public class Main {
    public static void main(String[] args) {
        tryFactoryProducer();

        NormalWay();
    }

    private static void NormalWay() {
        ArtDecoTypeFactory model1 = new ArtDecoTypeFactory();
        model1.GetType(FurnitureType.Chair).Type();
        model1.GetType(FurnitureType.Sofa).Type();
        model1.GetType(FurnitureType.CoffeeTable).Type();

        ModernTypeFactory model2 = new ModernTypeFactory();
        model2.GetType(FurnitureType.Chair).Type();
        model2.GetType(FurnitureType.Sofa).Type();
        model2.GetType(FurnitureType.CoffeeTable).Type();

        VictorianTypeFactory model3 = new VictorianTypeFactory();
        model3.GetType(FurnitureType.Chair).Type();
        model3.GetType(FurnitureType.Sofa).Type();
        model3.GetType(FurnitureType.CoffeeTable).Type();
    }

    private static void tryFactoryProducer(){
        AbstractFactory typeFactory1 = FactoryProducer.getFactory(Types.ArtDeco);
        typeFactory1.GetType(FurnitureType.CoffeeTable).Type();
        typeFactory1.GetType(FurnitureType.Sofa).Type();
        typeFactory1.GetType(FurnitureType.Chair).Type();

        AbstractFactory typeFactory2 = FactoryProducer.getFactory(Types.Modern);
        typeFactory2.GetType(FurnitureType.CoffeeTable).Type();
        typeFactory2.GetType(FurnitureType.Sofa).Type();
        typeFactory2.GetType(FurnitureType.Chair).Type();

        AbstractFactory typeFactory3 = FactoryProducer.getFactory(Types.Victorian);
        typeFactory3.GetType(FurnitureType.CoffeeTable).Type();
        typeFactory3.GetType(FurnitureType.Sofa).Type();
        typeFactory3.GetType(FurnitureType.Chair).Type();
    }
}