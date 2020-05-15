public class Item{
    private String name;
    private int prince;
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}

public class ShoppingSample{
    public static void main(String[] args){
        Item apple = new Item("apple", 100);
        Item orange = new Item("orange", 120);
        Item banana = new Item("banana", 80);

        ShoppingCart cart = new ShoppingCart();
        cart.add(new Order(apple,3));
        cart.add(new Order(orange,5));
        cart.add(new Order(banana,2));
        
        int total = cart.getTotal();
        System.out.println(total);
    }
}
//
import jp.co.xx.SampleProject.TestFunction.sample;

public class UsepackageSample{
    public static void main(String[] args){
        Sample sample = new Sample
}
//


