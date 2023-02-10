public class App {
    public static void main(String[] args) throws Exception {
       
        Person me = new Person();

        // System.out.print(me.name);

        // set method
        me.setName("abcdef");
        
        // get method
        System.out.println(me.getName());

        // son object
        Son myself = new Son();

        System.out.println(myself.surname);
    
        myself.showSurname();
    }
}
