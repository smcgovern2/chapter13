package ch13.work.command;

public class Main {

    public static void main(String[] args) {




        BuyCommodity buyCorn = new BuyCommodity(CommodityType.WHEAT, 400);
        SellCommodity sellWheat = new SellCommodity(CommodityType.WHEAT, 200);

        Trader trader = new Trader();
        trader.takeOrder(buyCorn);
        trader.takeOrder(sellWheat);

        trader.placeOrders();
    }

}
