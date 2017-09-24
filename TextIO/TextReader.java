
class TextReader{
  static TextIO io = new TextIO();
  static String student;
  static int fScore;
  static int sScore;

  public static void main(String[] args){
    TextIO.readFile("testdata.txt");
    student = TextIO.getln();
    System.out.println(student);
    fScore = TextIO.getInt();
    System.out.println(fScore);
    sScore = TextIO.getInt();
    System.out.println(sScore);
  }
}
