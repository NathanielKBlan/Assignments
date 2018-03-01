class PracticeForTest{
  public static void main(String[] args){
    int i = 1;
    int j = 0;
    byte a = 123;
    float g = 2.73F;
    double b = 2.73;
    float d = (float) b;
    while(i <= 100){
      System.out.println(i);
      i++;
    }
    while(j <= 200){
      switch(j % 5){
        case 0:
        System.out.println(j);
        break;
      }
      j++;
    }
    System.out.println(a);
    System.out.println(g);
    System.out.println(b);
    System.out.println(d);
  }
}
