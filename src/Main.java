public class Main {
    public static void main(String[] args) {

        Order order = new Order();


        Confectionery cakeWithIcing = new IcingDecorator(new Cake(), "Chocolate Icing");
        Confectionery cookieWithFilling = new FillingDecorator(new IcingDecorator(new Cookie(), "Vanilla Icing"), "Strawberry Filling");
        Confectionery chocolateWithSprinkles = new SprinkleDecorator(new Chocolate(), "Rainbow Sprinkles");

        order.addConfectionery(cakeWithIcing);
        order.addConfectionery(cookieWithFilling);
        order.addConfectionery(chocolateWithSprinkles);


        order.printOrder();
    }
}