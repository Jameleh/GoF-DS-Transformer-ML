public class TestStockMediator{

    public static void main(String[] args){

        StockMediator nyse = new StockMediator(); // mediator created

        GormanSlacks broker1 = new GormanSlacks(nyse); // colleague/pararticipant created and the nyse passed into
        // constructor to assign the mediator

        JTPoorman broker2 = new JTPoorman(nyse); // same


// first participant makes two asks.
        broker1.saleOffer("MSFT", 100);
        broker1.saleOffer("GOOG", 50);

 // second participant makes one bid one ask
        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

// first broker makes a bid
        broker1.buyOffer("NRG", 10);

//broker one ask 100 shared of MSFT, broker two bought. Broker 1 bought 10 shares from broker two of NRG
// All broker 2 orders filled but broker one still has ask for 50 shares of GOOG
        // not that if i changed NRG bid by broker one to 9 shares, no transaction would occur. current system does not
        // allow for partial fills

        // summarizes all outstanding requests from arrayLists
        nyse.getstockOfferings();

    }

}