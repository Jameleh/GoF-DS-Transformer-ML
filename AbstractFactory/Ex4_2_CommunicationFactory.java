public class CommunicationFactory {

    private static CommunicationFactory factory;
    private CommunicationFactory() {

    }
    public static CommunicationFactory getCommunicationFactory() {
        if(factory == null){
            return factory;
        }
        return factory;
    }

    public static ICommunication createCustomer(String type){
        if(type.equals("Delinquent")){
            return new DelinquentCustomer();
        }
        else if(type.equals("Mountain")){
            return new MountainCustomer();
        }
        else if(type.equals("Regular")){
            return new RegularCustomer();
        }
        return null;
    }
    public ICommunication getFactory(String type) {
        return null;
    }
}
