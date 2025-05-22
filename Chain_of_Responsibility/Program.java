public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        MaangGroup maangJob=new MaangGroup();
        
        ProductBased productBasedJob=new ProductBased();
        ServiceBased serviceBasedJob=new ServiceBased();

        /*
         Maang --> product --> service
         */
        maangJob.setNextChain(productBasedJob);
        productBasedJob.setNextChain(serviceBasedJob);
         
        // Person with no skill 
        Person person = new Person("");
        maangJob.getJob(person);
        System.out.println();

        // Person as Service Based skill type
        Person person2= new Person("Service Based");
        maangJob.getJob(person2);
        System.out.println();

        // Person as Product based skill type 
        Person person3= new Person("Product");
        maangJob.getJob(person3);
        System.out.println();

        // Person as Maang based skill type
        Person person4= new Person("MAANG");
        maangJob.getJob(person4);
        System.out.println();

    }
}
