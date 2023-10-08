class IcingDecorator implements Decorator {
    private final Confectionery confectionery;
    private final String icingType;

    public IcingDecorator(Confectionery confectionery, String icingType) {
        this.confectionery = confectionery;
        this.icingType = icingType;
    }

    @Override
    public String getDescription() {
        return confectionery.getDescription() + " with " + icingType + " Icing";
    }

    @Override
    public double cost() {
        return confectionery.cost() + 2.0;
    }
}
