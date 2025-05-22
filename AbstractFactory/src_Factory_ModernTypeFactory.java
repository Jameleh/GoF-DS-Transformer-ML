package Factory;

import Concrete.*;
import Factory.Enums.FurnitureType;

public class ModernTypeFactory extends AbstractFactory{
    @Override
    public Furniture GetType(FurnitureType type) {
        switch (type) {
            case Sofa:
                return new SofaModern();
            case Chair:
                return new ChairModern();
            case CoffeeTable:
                return new CoffeeTableModern();
            default:
                return null;
        }
    }
}
