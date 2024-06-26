import java.util.List;

public class ShoppingCart {

    // singleton
    static ShoppingCart shoppingCart;

    private ShoppingCart(){}

    static ShoppingCart getShoppingCart(){
        if(shoppingCart==null) shoppingCart=new ShoppingCart();
        return shoppingCart;
    }
    private List<Item> items;
    private int cartId;
    public List<Item> getItems(){
        return items;
    }
    public boolean addItem(Item item){
        return false;
    }
    public boolean removeItem(Item item){
        return false;
    }
    public boolean updateItemQuantity(Item item, int quantity){
        return false;
    }
    public boolean checkoutItems(){
        return false;
    }
}
