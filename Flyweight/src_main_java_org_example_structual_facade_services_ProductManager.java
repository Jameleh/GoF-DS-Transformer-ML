package org.example.structual.facade.services;

import org.example.structual.facade.facades.CrossCuttingConcernFacade;

public class ProductManager implements ProductService{
    private CrossCuttingConcernFacade crossCuttingConcernFacade;

    public ProductManager(CrossCuttingConcernFacade crossCuttingConcernFacade) {
        this.crossCuttingConcernFacade = crossCuttingConcernFacade;
    }


    @Override
    public void save() {
        crossCuttingConcernFacade.getAuthorization().auth();
        crossCuttingConcernFacade.getCaching().cache();
        crossCuttingConcernFacade.getLogging().log();
        System.out.println("Product Save :)");
    }
}
