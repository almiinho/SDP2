import java.util.ArrayList;
import java.util.List;
class Order {
    private final List<Confectionery> items = new ArrayList<>();

    public void addConfectionery(Confectionery item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        return items.stream().mapToDouble(Confectionery::cost).sum();
    }

    public void printOrder() {
        System.out.println("Order Details:");
        for (Confectionery item : items) {
            System.out.println(item.getDescription() + " - $" + item.cost());
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}