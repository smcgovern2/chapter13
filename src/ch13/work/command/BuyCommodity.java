package ch13.work.command;

public class BuyCommodity implements Order {
    private Commodity commodity;
    private int qty;


    public BuyCommodity(CommodityType type, int qty){
        this.commodity = CommodityFactory.COMMODITY_FACTORY.getCommodity(type);
        this.qty = qty;
    }

    public void execute() {
    commodity.buy(qty);

    };

}