import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        U1 u1 = new U1();
        u1.cargoCarried = 5000;
        System.out.println(u1.cargoCarried);
        System.out.println(u1.cargoLimit);
        System.out.println(u1.launch());
        File file = new File("phase-1.txt");
        Simulation simulation = new Simulation();
        System.out.println(simulation.loadItems(file));

    }
}