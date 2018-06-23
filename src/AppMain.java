import com.lab3.GasEngine;
import com.lab3.HybridEngine;

public class AppMain {

    public static void main(String[] args) {
        GasEngine gasEngine = new GasEngine(12.0, 321);
        gasEngine.printInfo();

        HybridEngine hybridEngine = new HybridEngine(321.0, 3213.1);
        System.out.println("HybridEngine power = " + hybridEngine.getPower());
        System.out.println("HybridEngine volume = " + hybridEngine.getVolume());

        hybridEngine.foo();
        gasEngine.foo();

    }
}