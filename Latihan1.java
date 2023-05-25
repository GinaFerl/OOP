public class Latihan1 {
    public static void main(String args[]) {
      int number1 = 10;
      int number2 = 23;
      int number3 = 5;
      
      int larger = (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);

      System.out.println("Nilai tertingginya adalah angka = " + larger);
    }
}