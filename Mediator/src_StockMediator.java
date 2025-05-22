import java.util.ArrayList;

public class StockMediator implements Mediator{

    // fields for array lists of participants in bids/asks , plus their bid and asks
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator(){

        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSaleOffers = new ArrayList<StockOffer>();
    } //constructor

    public void addColleague(Colleague newColleague){

        colleagues.add(newColleague); // participant added to array list

        colleagueCodes++; // counter increased

        newColleague.setCollCode(colleagueCodes); // the colleague code is just a participant Identifier for anonymity

    }

    public void saleOffer(String stock, int shares, int collCode) { // is passed info regarding the ask/askr

        boolean stockSold = false;

        for(StockOffer offer: stockBuyOffers){ // traverses the arary of bidders/bids to see if anything matches the ask

            if((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)){

                System.out.println(shares + " shares of " + stock +
                        " sold to colleague code " + offer.getCollCode());

                stockBuyOffers.remove(offer);
                // if match found, confirmation message, bid removed from the array list and marks sold as truee

                stockSold = true;

            }

            if(stockSold){ break; } // enhanced for loop exited once order filled

        }

        if(!stockSold) { // if no bid matches your ask immediately, then the ask is added to an ask arrayList comprised of
            // other askers

            System.out.println(shares + " shares of " + stock +
                    " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, collCode);

            stockSaleOffers.add(newOffering);

        }

    }

    public void buyOffer(String stock, int shares, int collCode) {

        boolean stockBought = false;

        for(StockOffer offer: stockSaleOffers){

            if((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)){

                System.out.println(shares + " shares of " + stock +
                        " bought by colleague code " + offer.getCollCode());

                stockSaleOffers.remove(offer);

                stockBought = true;

            }

            if(stockBought){ break; }

        }

        if(!stockBought) {

            System.out.println(shares + " shares of " + stock +
                    " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, collCode);

            stockBuyOffers.add(newOffering);

        }

    } // same as sell offer except now traversing the ask
    // array list and if match not found, the bid will be added to the bid array list

    public void getstockOfferings(){ //just getters for all items of bid and ask array lists? seems dumb but ok. if it was
        // just one stack fine that's level two data but not for all stocks. whatever.

        System.out.println("\nStocks for Sale");

        for(StockOffer offer: stockSaleOffers){

            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());

        }

        System.out.println("\nStock Buy Offers");

        for(StockOffer offer: stockBuyOffers){

            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());

        }

    }

}