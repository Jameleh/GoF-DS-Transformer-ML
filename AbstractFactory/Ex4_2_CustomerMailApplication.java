import java.util.Scanner;
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private CommunicationFactory factory;
    public CustomerMailApplication() {
        this.factory = CommunicationFactory.getCommunicationFactory();
    }
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    public String generateMailandBrochure(String type) {
        ICommunication Commufactory = factory.getFactory(type);
        Email email = Commufactory.createMail();
        Brochure brochure = Commufactory.createBrochure();

        return email.getEmail() + "\n" + brochure.getBrochure();

    }
    
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        CustomerMailApplication app = new CustomerMailApplication();
        System.out.println(app.generateMailandBrochure(customerType));
    }
}
