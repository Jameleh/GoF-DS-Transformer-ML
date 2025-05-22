package DesignPatternsStrategy;

public class InternationalLuggageHandling implements LuggageHandlingStrategy {
    @Override
    public void handleLuggage(String luggageId) {
        System.out.println("Processing luggage " + luggageId + " via International Handling.");
    }
    
}
