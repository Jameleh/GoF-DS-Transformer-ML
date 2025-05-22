package Factory;

import Concrete.*;
import Factory.Enums.FurnitureType;

public class VictorianTypeFactory extends AbstractFactory{
    @Override
    public Furniture GetType(FurnitureType type) {
        switch (type) {
            case Sofa:
                return new SofaVictorian();
            case Chair:
                return new ChairVictorian();
            case CoffeeTable:
                return new CoffeeTableVictorian();
            default:
                return null;
        }
    }
}
