import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nihughes on 01/03/2016.
 */
public class PrimeFactorsTest {

    private PrimeFactors pf;

    @Before
    public void beforeEach(){
        pf = new PrimeFactors();
    }

    @Test
    public void getPrimeFactorsOf1(){
        assertEquals(Collections.emptyList(),pf.go(1) );
    }

    @Test
    public void getPrimeFactorsOf30(){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        primeFactors.add(2);
        primeFactors.add(3);
        primeFactors.add(5);
        assertEquals(primeFactors,pf.go(30) );
    }

}
