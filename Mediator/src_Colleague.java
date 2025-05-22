public abstract class Colleague{ // abstract class to be implemented by other classes

    private Mediator mediator;
    private int colleagueCode;


    public Colleague(Mediator newMediator){ // constructor which will assign the mediator then add current colleague to
        // the mediators arrayList of market participants it is managing
        mediator = newMediator;

        mediator.addColleague(this);

    }

    public void saleOffer(String stock, int shares){ // calls the sale offer method of the mediator and will be added to
        // sale arrayList if nobody currently wants to buy

        mediator.saleOffer(stock, shares, this.colleagueCode);

    }

    public void buyOffer(String stock, int shares){ //same thing but for bids

        mediator.buyOffer(stock, shares, this.colleagueCode);

    }

    public void setCollCode(int collCode){ colleagueCode = collCode; } // will be called from the stockMediator class
    // to ID participant


}