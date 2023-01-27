public class pet{

    int age;
    String name;
    person owner;

    pet(String petName, int petAge, person ownerName) {
        this.name = petName;
        this.age = petAge;
        this.owner = ownerName;
    }
void showOwner(){
    System.out.println("my name is" + this.name + ". My owner name is " + owner.name);
}
}