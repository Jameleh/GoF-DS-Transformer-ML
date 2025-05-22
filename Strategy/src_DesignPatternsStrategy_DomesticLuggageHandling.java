package DesignPatternsStrategy;

public class DomesticLuggageHandling implements LuggageHandlingStrategy {
    @Override
    public void handleLuggage(String luggageId) {
        System.out.println("Processing luggage " + luggageId + " via Domestic Handling.");
    }
}

