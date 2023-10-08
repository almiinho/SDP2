class Cake implements Confectionery {
    @Override
    public String getDescription() {
        return "Cake";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}