public class OperatorLogika {
    public static void main(String args[]) {
      boolean a = true, b=true;
      
      System.out.println("A\tB\tA && B\tA OR B\tA XOR B\tNOT A");
      
      for(int i=0;i<2;i++) {
          for(int j=0;j<2;j++){
              System.out.println(a+"\t"+b+"\t"+ (a && b)+"\t"+(a||b)+"\t"+(a^b)+"\t"+(!a));
              b=!b;
          }
          a=!a;
      }
    }
}