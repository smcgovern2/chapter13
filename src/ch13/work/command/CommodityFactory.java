package ch13.work.command;

public enum CommodityFactory {
    COMMODITY_FACTORY;
    CommodityFactory(){}

    public Commodity getCommodity(CommodityType type){
        switch (type){
            case BEANS: return new Commodity("Beans", 300);
            case CORN: return new Commodity("Corn", 145);
            case WHEAT: return new Commodity("Wheat", 210);
            default: return null;
        }
    }


}
