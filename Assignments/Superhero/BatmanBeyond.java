
public class BatmanBeyond extends Superhero{

  public BatmanBeyond(String name){
    super("Terry McGuiness");
  }

  @Override
  public void attack(){
    System.out.println("Terry McGuiness attacking for 20hp in damage.");
  }

  @Override
  public void displayHitPoints(){
    System.out.println("Terry McGuiness has 250hp left.");
  }

}
