public class MainClass implements IHelper {
    //This is the main class

    private int helperNumber = 0;

    public MainClass(int number)
    {
        this.helperNumber = number;
    }

    public void Help() {
        System.out.println("This is a helper method created from the interface.");
    }
}
