public class Cashier {
    
    public void checkOut(Groceryitem Item){
        System.out.println("You have purchased" + Item.name);

    }
    public void showItemPrice( Groceryitem item){
        System.out.println("The price of  " + item.name + item.price);
    }
}
