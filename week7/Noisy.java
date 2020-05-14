public class Noisy
{
    public static Animal [] makeSomeNoise()
    {
        System.out.println("Woof!, I am Devil");
        Animal [] animals = {new Cat("Angel"), new Cat("Cheesire"), new Dog("Buster"), new Dog("Fido"), new Cat("Lassie")};
        return animals;
    }
}