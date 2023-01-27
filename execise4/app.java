public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        person Me = new person( "jake", 19);

        person Friend = new person("dave ", 20);

        Me.addFriend(Friend);

        pet cat = new pet("Gabgab", 6,Me);

        cat.showOwner();

        person Classmate1 = new person("joey" ,20);
        person Classmate2 = new person("JM" ,21);
        person Classmate3 = new person("Christian" ,19);

        Me.addClassmate(Classmate1);
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);
        

       Car car = new Car("toyota","vios","Jake");

    }
}
