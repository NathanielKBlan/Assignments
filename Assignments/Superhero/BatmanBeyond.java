
public class BatmanBeyond extends Superhero{

  public BatmanBeyond(String name){
    super(name);
  }

  @Override
  public void attack(){
    System.out.println(name + " attacking for 20hp in damage.");
  }

  @Override
  public void displayHitPoints(){
    System.out.println(name + " has 250hp left.");
  }

}
