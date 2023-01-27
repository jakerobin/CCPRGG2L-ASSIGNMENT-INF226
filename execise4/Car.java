public class Car{

    String brand;
    String name;
    String owner;

    Car(String CarName, String Carbrand, String ownerName){
        this.name = CarName;
        this.brand = Carbrand;
        this.owner = ownerName;
    }
void Carowner (){
    System.out.println("this is a " + this.brand + "my name is" + this.name + ". My owner name is " +this.owner);
}
}
