
public class Tasksheet129 {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding gorilla: food is placed in the cage.");
            return true;
        }
        return false; 
    }

    @Override
    public void groom() {
        System.out.println("Grooming gorilla: brushing and cleaning the gorilla.");
    }

    @Override
    public void pet() {
        System.out.println("Petting gorilla: approach cautiously, they can be unpredictable.");
    }
}
