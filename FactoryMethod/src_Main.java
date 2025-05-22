class demo {
    public static void main(String[] args) {
//      Trade publicConstructor = new Trade("SPY", "5/12/23", 404, 40, "invalid input"); this will not be possible through
        // private constructor
        Trade newCall = Trade.createNewCallTrade("QQQ", "5/9/23", 315, 40);
        Trade newPut = Trade.createNewPutTrade("AMD", "5/12/23", 91, 40);
    }
}


class Trade {
    private String stock;
    private String contractDate;
    private int strike;
    private double premium;

    private String callOrPut;

    private Trade(String stock, String contractDate, int strike, double premium, String callOrPut) {
        this.stock = stock;
        this.contractDate = contractDate;
        this.strike = strike;
        this.premium = premium;
        this.callOrPut = callOrPut;
    } // making this constructor private makes it so a "Trade" object cannot be constructed from outside the class and instead
    // certain Trade objects can be created, such as below where I've marked two methods as either call or put contracts
    // and hard coded in the values to eliminate other String input

    public static Trade createNewCallTrade (String stock,String contractDate, int strike, double premium){
        return new Trade(stock,contractDate,strike,premium, "call");
    }

    public static Trade createNewPutTrade (String stock,String contractDate, int strike, double premium){
        return new Trade(stock,contractDate,strike,premium, "put");
    }
}
