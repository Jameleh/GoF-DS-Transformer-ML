import colleague.Colleague;
import colleague.impl.Bidder;
import mediator.Mediator;
import mediator.impl.AuctionMediator;

public class Client {
    public static void main(String[] args) {
        Mediator auctionMediator = new AuctionMediator();
        Colleague bidder1 = new Bidder(auctionMediator, "Alex");
        Colleague bidder2 = new Bidder(auctionMediator, "Shane");
        Colleague bidder3 = new Bidder(auctionMediator, "John");
        bidder1.placeBid(1000);
        bidder2.placeBid(2000);
        bidder3.placeBid(3000);
    }
}
