package org.example;

import org.example.model.CashBackOffer;
import org.example.model.Offer;
import org.example.model.PercentageOffer;
import org.example.model.Transaction;
import org.example.model.service.OfferChainHandler;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Offer cashbackOffer = new CashBackOffer();
        Offer percentageOffer = new PercentageOffer();
        OfferChainHandler offerChainHandler = new OfferChainHandler(Arrays.asList(cashbackOffer, percentageOffer));

        Transaction transaction = new Transaction(201);
        offerChainHandler.applyOffers(transaction);
    }
}