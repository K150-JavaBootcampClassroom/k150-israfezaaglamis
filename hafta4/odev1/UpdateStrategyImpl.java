import java.util.HashMap;
import java.util.function.BiConsumer;

public class UpdateStrategyImpl implements IUpdateStrategy{


    @Override
    public void uptade(HashMap<String, Double> productsArray) {
       productsArray.forEach(
                (key, value)
                        -> System.out.println("Güncel durum : "+key + " = " + value));

    }
}


