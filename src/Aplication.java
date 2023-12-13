public class Aplication {
    private static Aplication aplication;
    boolean isRunning = false;

    // Private constructor to avoid direct instantiation of new Application outside of class
    private Aplication() {}

    // Public method getInstance() to obtain the single instance and return it
    public static Aplication getInstance() {
        if (aplication == null) {
            aplication = new Aplication();
        }
        return aplication;
    }
    public void Run() {
        if (!isRunning) {
            System.out.println("Starting the instance");
            isRunning = true;
        }
        else {
            System.out.println("It was already running");
        }
    }
}
