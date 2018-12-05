package ch13.work.command;

public class SellCommodity implements Order {
    private Commodity commodity;
    private int qty;

    public SellCommodity(CommodityType type, int qty){
        this.commodity = CommodityFactory.COMMODITY_FACTORY.getCommodity(type);
        this.qty = qty;
    }

    public void execute() {
        commodity.sell(qty);
    }
}
