
class NumberLetterCounts{
  public static void main(String args[]){
    String specialNs[] = {
      "hundred", "thousand"
    };
    String tens[] = {
      "ten", "twenty", "thirty", "forty", "fifty",
      "sixty", "seventy", "eighty", "ninety"
    };
    String digits[] = {
      "one", "two", "three", "four", "five",
      "six", "seven", "eight", "nine"
    };
    String specialsTT[] = {
      "eleven", "twelve", "thirteen", "fourteen",
      "fifteen", "sixteen", "seventeen", "eighteen",
      "nineteen"
    };
    String and = "and";
    String number;
    StringBuilder spl = new StringBuilder();
    int characters;
    for(int i = 1; i <= 5; i++){
      if(i < 10){
        spl.append(digits[i-1]);
      }
      if(i % 10 == 0 && i < 100){
        spl.append(tens[(i/10) - 1]);
      }
      if(i >= 10 && i < 19){
        spl.append(specialsTT[i - 10]);
      }
      if(i >= 20 && i < 29){
        spl.append(tens[1]);
        spl.append(digits[i-20]);
      }
      if(i >= 30 && i < 39){
        spl.append(tens[2]);
        spl.append(digits[i-30]);
      }
      if(i >= 40 && i < 49){
        spl.append(tens[3]);
        spl.append(digits[i-40]);
      }
      if(i >= 50 && i < 59){
        spl.append(tens[4]);
        spl.append(digits[i-50]);
      }
      if(i >= 60 && i < 69){
        spl.append(tens[5]);
        spl.append(digits[i-60]);
      }
      if(i >= 70 && i < 79){
        spl.append(tens[6]);
        spl.append(digits[i-70]);
      }
      if(i >= 80 && i < 89){
        spl.append(tens[7]);
        spl.append(digits[i-80]);
      }
      if(i >= 90 && i < 99){
        spl.append(tens[8]);
        spl.append(digits[i-90]);
      }
      if(i % 100 == 0 && i < 1000){
        spl.append(digits[(i/100) - 1]);
        spl.append(specialNs[0]);
      }
      if(i % 10 == 0 && i > 100 && i < 200){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
      }
      if(i >= 100 && i < 109){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-100]);
      }
      if(i >= 110 && i < 119){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 110]);
      }
      if(i >= 120 && i < 129){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 120]);
      }
      if(i >= 130 && i < 139){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 130]);
      }
      if(i >= 140 && i < 149){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 140]);
      }
      if(i >= 150 && i < 159){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 150]);
      }
      if(i >= 160 && i < 169){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 160]);
      }
      if(i >= 170 && i < 179){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 170]);
      }
      if(i >= 180 && i < 189){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 180]);
      }
      if(i >= 190 && i < 199){
        spl.append(digits[0]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 11]);
        spl.append(digits[i - 190]);
      }
      if(i % 10 == 0 && i > 200 && i <300){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
      }
      if(i >= 200 && i < 209){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-200]);
      }
      if(i >= 210 && i < 219){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 210]);
      }
      if(i >= 220 && i < 229){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 220]);
      }
      if(i >= 230 && i < 239){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 230]);
      }
      if(i >= 240 && i < 249){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 240]);
      }
      if(i >= 250 && i < 259){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 250]);
      }
      if(i >= 260 && i < 269){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 260]);
      }
      if(i >= 270 && i < 279){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 270]);
      }
      if(i >= 280 && i < 289){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 280]);
      }
      if(i >= 290 && i < 299){
        spl.append(digits[1]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 21]);
        spl.append(digits[i - 290]);
      }
      if(i % 10 == 0 && i > 300 && i < 400){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
      }
      if(i >= 300 && i < 309){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-300]);
      }
      if(i >= 310 && i < 319){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 310]);
      }
      if(i >= 320 && i < 329){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 320]);
      }
      if(i >= 330 && i < 339){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 330]);
      }
      if(i >= 340 && i < 349){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 340]);
      }
      if(i >= 350 && i < 359){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 350]);
      }
      if(i >= 360 && i < 369){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 360]);
      }
      if(i >= 370 && i < 379){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 370]);
      }
      if(i >= 380 && i < 389){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 380]);
      }
      if(i >= 390 && i < 399){
        spl.append(digits[2]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 31]);
        spl.append(digits[i - 390]);
      }
      if(i % 10 == 0 && i > 400 && i < 500){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
      }
      if(i >= 400 && i < 409){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-400]);
      }
      if(i >= 410 && i < 419){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 410]);
      }
      if(i >= 420 && i < 429){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 420]);
      }
      if(i >= 430 && i < 439){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 430]);
      }
      if(i >= 440 && i < 449){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 440]);
      }
      if(i >= 450 && i < 459){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 450]);
      }
      if(i >= 460 && i < 469){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 460]);
      }
      if(i >= 470 && i < 479){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 470]);
      }
      if(i >= 480 && i < 489){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 480]);
      }
      if(i >= 490 && i < 499){
        spl.append(digits[3]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 41]);
        spl.append(digits[i - 490]);
      }
      if(i % 10 == 0 && i > 500 && i < 600){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
      }
      if(i >= 500 && i < 509){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-500]);
      }
      if(i >= 510 && i < 519){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 510]);
      }
      if(i >= 520 && i < 529){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 520]);
      }
      if(i >= 530 && i < 539){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 530]);
      }
      if(i >= 540 && i < 549){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 540]);
      }
      if(i >= 550 && i < 559){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 550]);
      }
      if(i >= 560 && i < 569){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 560]);
      }
      if(i >= 570 && i < 579){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 570]);
      }
      if(i >= 580 && i < 589){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 580]);
      }
      if(i >= 590 && i < 599){
        spl.append(digits[4]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 51]);
        spl.append(digits[i - 590]);
      }
      if(i % 10 == 0 && i > 600 && i < 700){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
      }
      if(i >= 600 && i < 609){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-600]);
      }
      if(i >= 610 && i < 619){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 610]);
      }
      if(i >= 620 && i < 629){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 620]);
      }
      if(i >= 630 && i < 639){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 630]);
      }
      if(i >= 640 && i < 649){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 640]);
      }
      if(i >= 650 && i < 659){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 650]);
      }
      if(i >= 670 && i < 679){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 670]);
      }
      if(i >= 680 && i < 689){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 680]);
      }
      if(i >= 690 && i < 699){
        spl.append(digits[5]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 61]);
        spl.append(digits[i - 690]);
      }
      if(i % 10 == 0 && i > 700 && i < 800){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
      }
      if(i >= 700 && i < 709){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-700]);
      }
      if(i >= 710 && i < 719){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 710]);
      }
      if(i >= 720 && i < 729){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 720]);
      }
      if(i >= 730 && i < 739){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 730]);
      }
      if(i >= 740 && i < 749){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 740]);
      }
      if(i >= 750 && i < 759){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 750]);
      }
      if(i >= 760 && i < 769){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 760]);
      }
      if(i >= 770 && i < 779){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 770]);
      }
      if(i >= 780 && i < 789){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 780]);
      }
      if(i >= 790 && i < 799){
        spl.append(digits[6]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 71]);
        spl.append(digits[i - 790]);
      }
      if(i % 10 == 0 && i > 800 && i < 900){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
      }
      if(i >= 800 && i < 809){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-800]);
      }
      if(i >= 810 && i < 819){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 810]);
      }
      if(i >= 820 && i < 829){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 820]);
      }
      if(i >= 830 && i < 839){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 830]);
      }
      if(i >= 840 && i < 849){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 840]);
      }
      if(i >= 850 && i < 859){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 850]);
      }
      if(i >= 860 && i < 869){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 860]);
      }
      if(i >= 870 && i < 879){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 870]);
      }
      if(i >= 880 && i < 889){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 880]);
      }
      if(i >= 890 && i < 899){
        spl.append(digits[7]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 81]);
        spl.append(digits[i - 890]);
      }
      if(i % 10 == 0 && i > 900 && i < 1000){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
      }
      if(i >= 900 && i < 909){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(digits[i-900]);
      }
      if(i >= 910 && i < 919){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(specialsTT[i - 910]);
      }
      if(i >= 920 && i < 929){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 920]);
      }
      if(i >= 930 && i < 939){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 930]);
      }
      if(i >= 940 && i < 949){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 940]);
      }
      if(i >= 950 && i < 959){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 950]);
      }
      if(i >= 960 && i < 969){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 960]);
      }
      if(i >= 970 && i < 979){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 970]);
      }
      if(i >= 980 && i < 989){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 980]);
      }
      if(i >= 990 && i < 999){
        spl.append(digits[8]);
        spl.append(specialNs[0]);
        spl.append(and);
        spl.append(tens[(i/10) - 91]);
        spl.append(digits[i - 990]);
      }
      if(i == 1000){
        spl.append(digits[0]);
        spl.append(specialNs[1]);
      }
    }
    number = spl.toString();
    characters = spl.length();
    System.out.println(" This is the number of letters: " + characters);
  }
}
