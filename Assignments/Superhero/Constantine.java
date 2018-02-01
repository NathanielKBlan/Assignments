
public class Constantine extends Superhero{

  public Constantine(String name){
    super(name);
  }

  @Override
  public void attack(){
    System.out.println(name + " attacking for 15hp in damage.");
  }

  @Override
  public void displayHitPoints(){
    System.out.println(name + " has 210hp left.");
  }

}
