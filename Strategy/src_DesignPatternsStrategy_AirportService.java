package DesignPatternsStrategy;

public class AirportService {
    public static void main(String[] args) {
        LuggageHandlerContext context = new LuggageHandlerContext();

        // Domestic Luggage Handling
        LuggageHandlingStrategy domesticStrategy = new DomesticLuggageHandling();
        context.setStrategy(domesticStrategy);
        context.handleLuggage("LUG123");

        // International Luggage Handling
        LuggageHandlingStrategy internationalStrategy = new InternationalLuggageHandling();
        context.setStrategy(internationalStrategy);
        context.handleLuggage("LUG456");
    }
}
