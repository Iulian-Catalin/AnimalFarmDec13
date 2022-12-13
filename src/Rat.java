public class Rat extends Animal{

    @Override
    void sound () {
        System.out.println("Chit chit");
        SoundOfAnimals.soundOfAnimal("rat.mp3");
    }

    @Override
    public void move(){
        System.out.println(" Fuge tare");

    }
}
