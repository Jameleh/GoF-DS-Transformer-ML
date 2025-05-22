package Factory;

import Factory.Enums.FurnitureType;

public abstract class AbstractFactory {
    public abstract Furniture GetType(FurnitureType type);

}
