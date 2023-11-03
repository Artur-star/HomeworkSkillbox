
public class Main {
    public static void main(String[] args) {
        Busket basket = new Busket();
        basket.add(new Product("milk", 80), 2);
        basket.add(new Product("bread", 30), 3);
        basket.add(new Product("tomato", 100), 1);
        basket.add(new Product("chocolate", 50), 4);
        basket.add(new Product("eat", 250), 1);
        basket.add(new Product("bread", 30), 5);
        basket.add(new Product("bread", 30));
        System.out.println(basket.toString());
    }
}