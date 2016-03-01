/**
 * Created by nihughes on 01/03/2016.
 */
public class FizzBuzz {
    public void go(int maxNum) {
        for(int i = 1; i <= maxNum; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
