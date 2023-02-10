public class App {
    public static void main(String[] args) throws Exception {
        

        Groceryitem Item1 = new Diaper();
        Item1.name = " huggies ";
        Item1.price = 80;
        Item1.showItemName();
    

        Groceryitem Item2 = new Diaper();
        Item2.name = " Cocacola ";
        Item2.price = 90;
        Item2.showItemName();
        
        
        Cashier c1 = new Cashier();

        c1.checkOut(Item1);
        c1.checkOut(Item2);

       c1.showItemPrice(Item1);
       c1.showItemPrice(Item2);

       
       Groceryitem[] ItemArray = new Groceryitem[2];

       ItemArray [0] = Item1;
       ItemArray [1] = Item2;

       double totalAmount = 0.00;

       for (int i = 0; i < ItemArray.length; i++) {
            ItemArray[i].showItemName(); 
            System.out.println(ItemArray[i].price);

            totalAmount += ItemArray[i].price;
        }
    
       System.out.println(totalAmount);

       lion mylion = new lion();
       mylion.eat();

    }

}
