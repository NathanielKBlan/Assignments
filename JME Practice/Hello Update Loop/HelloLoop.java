import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class HelloLoop extends SimpleApplication{

  public static void main(String[] args) {
    HelloLoop app = new HelloLoop();
    app.start();
  }

  protected Geometry player;
  protected Geometry npc;
  protected int s = 1;
  //int rotations = (int) Math.round(Math.random() * 3) + 20;
  //int i = 0;

  @Override
  public void simpleInitApp(){

    /** The blue box will be the player character */
    Box b = new Box(1, 1, 1);
    player = new Geometry("player", b);
    Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat.setColor("Color", ColorRGBA.Blue);
    player.setMaterial(mat);
    rootNode.attachChild(player);

    Box c = new Box(1, 1, 1);
    npc = new Geometry("NPC", c);
    Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    mat2.setColor("Color", ColorRGBA.Red);
    npc.setMaterial(mat2);
    npc.setLocalTranslation(4, 0, 0);
    rootNode.attachChild(npc);

  }

  /* Uses the main loop to trigger repeating actions. */
  @Override
  public void simpleUpdate(float tpf){

      player.rotate(0, 2*tpf, 0);
      npc.rotate(0, 4*tpf, 0);

  }

}
