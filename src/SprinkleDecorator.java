class SprinkleDecorator implements Decorator {
    private final Confectionery confectionery;
    private final String sprinkleType;

    public SprinkleDecorator(Confectionery confectionery, String sprinkleType) {
        this.confectionery = confectionery;
        this.sprinkleType = sprinkleType;
    }

    @Override
    public String getDescription() {
        return confectionery.getDescription() + " with " + sprinkleType + " Sprinkles";
    }

    @Override
    public double cost() {
        return confectionery.cost() + 1.0;
    }
}
