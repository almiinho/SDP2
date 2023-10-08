class FillingDecorator implements Decorator {
    private final Confectionery confectionery;
    private final String fillingType;

    public FillingDecorator(Confectionery confectionery, String fillingType) {
        this.confectionery = confectionery;
        this.fillingType = fillingType;
    }

    @Override
    public String getDescription() {
        return confectionery.getDescription() + " with " + fillingType + " Filling";
    }

    @Override
    public double cost() {
        return confectionery.cost() + 3.0;
    }
}