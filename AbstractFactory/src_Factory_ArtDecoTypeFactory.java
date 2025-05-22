package Factory;

import Concrete.ChairArtDeco;
import Concrete.CoffeeTableArtDeco;
import Concrete.SofaArtDeco;
import Factory.Enums.FurnitureType;

public class ArtDecoTypeFactory extends AbstractFactory{
    @Override
    public Furniture GetType(FurnitureType type) {
        switch (type){
            case Sofa :
                return new SofaArtDeco();
            case Chair:
                return new ChairArtDeco();
            case CoffeeTable:
                return new CoffeeTableArtDeco();
            default:
                return null;
        }
    }
}
