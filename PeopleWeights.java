import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double [] Weights = new double[5];
      
      for (int i = 0; i < Weights.length; ++i) {
         System.out.println("Enter weight " + (i + 1) + ": ");
         Weights[i] = scnr.nextDouble();         
      }
      System.out.println("");
      System.out.println("You entered: " + Weights[0] + " " + Weights[1] + " " + Weights[2] + " " + Weights[3] + " " + Weights[4] + " ");
      
      double sumVal = 0.0;
      for (int i = 0; i < Weights.length; ++i) {
         sumVal = sumVal + Weights[i];
      }
      System.out.println("Total weight: " + sumVal);

      double avgVal = 0.0;
      for (int i = 0; i < Weights.length; ++i) {
         avgVal = sumVal / Weights.length;
      }
      System.out.println("Average weight: " + avgVal);
      
      double maxWeight = Weights[0];
      for (int i = 0; i < Weights.length; ++i) {
         if (Weights[i] > maxWeight) {
            maxWeight = Weights[i];
         }
      }
      System.out.println("Max weight: " + maxWeight);
      
      return;
   }
}
