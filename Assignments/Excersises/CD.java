import java.text.NumberFormat;

class CD{

  private String title, artist;
  private double cots;
  private int tracks;

  public CD(String title, String artist, double cost, int tracks){
    this.title = title;
    this.artist = artist;
    this.cost = cost;
    this.tracks = tracks;
  }

  @Override
  public String toString(){
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    String description;

    description = fmt.format(cost) + "\t" + tracks + "\t";
    description += title + "\t" + artist;

    return description;
  }

}
