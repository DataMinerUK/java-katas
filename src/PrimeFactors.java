import java.util.*;

/**
 * Created by nihughes on 01/03/2016.
 */
public class PrimeFactors {
    public ArrayList<Integer> go(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        if(num == 1){
            return primeFactors;
        }
        else {
            int i = 2;

            while(num > 1){
                if(num % i == 0){
                    primeFactors.add(i);
                    num = num/i;
                }
                else {
                    i++;
                }
            }
            return primeFactors;
        }
    }

}
