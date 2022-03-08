public class PowerCalculator {
    public static void main(String[] args) {
      // initialize values
      int power = 3;
      int number = 4;
      int result = 1;
      System.out.print(number +" raised to power " + power +" is : ");
      // loop till power is 0
      while (power > 0) {
        // multiply number by itself
        result = result * number;
        // reduce loop counter
        power--;
      }
      System.out.print(result);
    }
  }