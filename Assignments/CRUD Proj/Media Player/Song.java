public class Song{

  String artist;
  String name;
  double costUSD;

  public Song(String name){
    this("unknown", name, 0.99);
  }

  public Song(String artist, String name){
    this(artist, name, 0.99);
  }

  public Song(String name, double costUSD){
    this("unknown", name, costUSD);
  }

  public Song(String artist, String name, double costUSD){
    this.artist = artist;
    this.name = name;
    this.costUSD = costUSD;
  }

}
