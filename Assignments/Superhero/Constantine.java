public class Constantine extends Superhero{

  public BatmanBeyond(String name){
    super("John Constantine");
  }

  @Override
  public void attack(){
    System.out.println("John Constantine attacking for 15hp in damage.");
  }

  @Override
  public void displayHitPoints(){
    System.out.println("John Constantine has 210hp left.");
  }

}
