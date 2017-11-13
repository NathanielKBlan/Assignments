class MaximumPathSumI{
  static int[][] nums =           {{75},
                                 {95,64},
                                {17,47,82},
                               {18,35,87,10},
                              {20,4,82,47,65},
                             {19,1,23,75,3,34},
                            {88,2,77,73,7,63,67},
                           {99,65,4,28,6,16,70,92},
                         {41,41,26,56,83,40,80,70,33},
                        {41,48,72,33,47,32,37,16,94,29},
                       {53,71,44,65,25,43,91,52,97,51,14},
                      {70,11,33,28,77,73,17,78,39,68,17,57},
                     {91,71,52,38,17,14,91,43,58,50,27,29,48},
                    {63,66,4,68,89,53,67,30,73,16,69,87,40,31},
                   {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23}};
  static int test[][] = {{3},
                        {7,4},
                       {2,4,6},
                      {8,5,9,3}};
  static int sumLeft = 0;
  static int sumRight = 0;
  static int sum = 0;
  static int location = 0;
  static int triangles = 0;
  public static void main(String[] args){
    int r = 0;
    while(r < 3){
      getGreaterSum(r);
      r++;
    }
  }

  static void getGreaterSum(int r){
    if(getLeftSum(r) > getRightSum(r)){
      location += 0;
      //System.out.println(getLeftSum(r));
    }
    if(getRightSum(r) > getLeftSum(r)){
      location += 1;
      System.out.println(getRightSum(r));
    }
  }

  static int getLeftSum(int r){
    sumLeft = 0;
    for(int i = r; i < test.length; i++){
      sumLeft += test[i][location];
    }
    return sumLeft;
  }

  static int getRightSum(int r){
    sumRight = 0;
    if(r == 0){
      sumRight += test[r][location];
    }
    for(int c = r; c < test.length; c++){
        if(c < 1 || r < 1){
          sumRight += test[c][location];
        }
        if(c > 1 && r > 1){
          sumRight += test[c][test[c].length -  r];
        }
    }
    return sumRight;
  }
}
