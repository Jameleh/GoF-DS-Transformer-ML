package DesignPatternsStrategy;

public class LuggageHandlerContext {
    LuggageHandlingStrategy strategy;

    public void setStrategy(LuggageHandlingStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleLuggage(String luggageId) {
        if(strategy == null) {
            System.out.println("No strategy set.");
        }else{
            strategy.handleLuggage(luggageId);
        }
       
    }
}
