import java.math.BigInteger;

class PowerDigitSum{
  public static void main(String[] args){
    BigInteger num = BigInteger.valueOf(1);
    int multpl = 2;
    int sum = 0;
    int lengthOfCint;
    String cint;
    String seperate[] = new String[100];
    for(int i = 1; i <= 1000; i++){
      num = num.multiply(BigInteger.valueOf(2));
    }
    cint = num.toString();
    lengthOfCint = cint.length();
    seperate = cint.split("");
    for(int i = 0; i <= lengthOfCint - 1; i++){
      sum = sum + Integer.parseInt(seperate[i]);
    }
    System.out.println(sum + " This is the sum of all the integers in 2^1000");
  }
}
