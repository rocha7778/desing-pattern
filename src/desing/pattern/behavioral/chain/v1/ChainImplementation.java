package desing.pattern.behavioral.chain.v1;

import java.util.jar.Manifest;

public class ChainImplementation {

    public static void main(String args[]) {

        SpellChekerProcessing p1 = new SpellChekerProcessing();
        HeaderTextProcessor p2 = new HeaderTextProcessor();
        p1.setSucessor(p2);

        String result = p1.handle("Aren't labdas really sexy?!!!");
        System.out.println(result);
    }

}
