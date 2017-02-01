import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        String input = null;
        BigInteger number;
        
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            Long numberDouble = Long.parseLong(input);
            number = BigInteger.valueOf(numberDouble);

            
            System.out.println(factorial(number).toString());
        } catch (NumberFormatException ex) {
            System.out.println("Not a number !");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
}