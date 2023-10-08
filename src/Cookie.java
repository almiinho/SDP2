class Cookie implements Confectionery {
    @Override
    public String getDescription() {
        return "Cookie";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}