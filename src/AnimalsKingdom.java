public class AnimalsKingdom {
    public static void main(String[] args) {
        Animal a1 = new Animal("crocodile","ararr","meat");
        Dog d1 = new Dog("Soul","bark","meat","Shepard");
        Cat c1 = new Cat("Jeff","meow","mice","black");
        System.out.println(a1.getName());
        System.out.println(d1.getBreed());
        System.out.println(c1.getMakeSound());
    }


}

class Animal{
    private String name;
    private String makeSound;
    private String eat;

    public Animal(String name, String makeSound, String eat) {
        this.name = name;
        this.makeSound = makeSound;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public String getMakeSound() {
        return makeSound;
    }

    public String getEat() {
        return eat;
    }
}

class Dog extends Animal{
    public String breed;
    public Dog(String name, String makeSound, String eat, String breed) {
        super(name, makeSound, eat);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animal{
    private String hasFur;
    public Cat(String name, String makeSound, String eat, String hasFur) {
        super(name, makeSound, eat);
        this.hasFur = hasFur;
    }
}
