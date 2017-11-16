import java.math.BigInteger;

class Paths{
  public static void main(String args[]){
    int n = 20;
    int k = 40;
    int nmk = 20;
    BigInteger fact1 = BigInteger.valueOf(n);
    BigInteger fact2 = BigInteger.valueOf(nmk);
    BigInteger fact3 = BigInteger.valueOf(k);
    BigInteger latticePaths1;
    BigInteger latticePaths2;
    //k choose n
    for(int i = n - 1; i >= 1; i--){
      fact1 = fact1.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact1 + " This is the first factorial");
    for(int i = k - 1; i >= 1; i--){
      fact3 = fact3.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact2 + " This is the second factorial");
    for(int i = nmk - 1; i >= 1; i--){
      fact2 = fact2.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact3 + " This is the third factorial");
    latticePaths1 = fact1.multiply(fact2);
    latticePaths2 = fact3.divide(latticePaths1);
    System.out.println("Number of lattice paths in 20x20 grid: " + latticePaths2);
  }
}
