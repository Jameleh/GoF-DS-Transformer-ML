package dinosaur;

public class DinosaurFactory {

    public static iDinosaur getDinosaur(String dinosaur) {
        Class aClass = null;
        Object anObject = null;

        try {
            aClass = Class.forName("dinosaur.dinosaurList." + dinosaur);
            anObject = aClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Este dinossauro não existe");
        }
        if (!(anObject instanceof iDinosaur)) {
            throw new IllegalArgumentException("Dinossauro inválido. Este dinossauro não está implementado na interface iDinossauro");
        }

        return (iDinosaur) anObject;
    }
}
