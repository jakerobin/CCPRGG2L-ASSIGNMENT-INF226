public class person {

    int age;
    String name;

    person(String personName, int personAge){
        this.name = personName;
        this.age = personAge;

    }

    void addFriend(person Friend){
        System.out.println(this.name + " is friend with" + Friend.name);        
    }

    void addClassmate(person Classmate){
        System.out.println(this.name + " is classmate with" + Classmate.name);
    }
}