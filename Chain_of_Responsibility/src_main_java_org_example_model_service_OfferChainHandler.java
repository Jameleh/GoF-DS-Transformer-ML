package org.example.model.service;

import org.example.model.Offer;
import org.example.model.Transaction;

import java.util.List;

public class OfferChainHandler {

    private List<Offer> offers;

    public OfferChainHandler(List<Offer> offers) {
        this.offers = offers;
    }

    public void applyOffers(Transaction transaction) {
        for(Offer offer: offers) {
            if(offer.isApplicable(transaction))
                offer.applyOffer(transaction);
        }
    }
}
