import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.math.FastMath;

/** Sample 2 - How to use nodes as handles to manipulate objects in the scene.
 * You can rotate, translate, and scale objects by manipulating their parent nodes.
 * The Root Node is special: Only what is attached to the Root Node appears in the scene. */

 public class HelloNode extends SimpleApplication{

   int pitch = (int) Math.round(Math.random() * 360) + 0;
   int yaw = (int) Math.round(Math.random() * 360) + 0;
   int roll = (int) Math.round(Math.random() * 360) + 0;

   public static void main(String[] args) {
     HelloNode app = new HelloNode();
     app.start();
   }

   @Override
   public void simpleInitApp(){

     /** create a blue box at coordinates (1,1,1) */
     Box b1 = new Box(1, 1, 1);

     /** Assigns the box object to a spatial */
     Geometry blue = new Geometry("Box", b1);

     /* Translates the spatial to the coordinate (1, -1, 1) */
     blue.setLocalTranslation(new Vector3f(1, -1, 1));

     /* Creates a blue unshaded material to be used for blue */
     Material mat1 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
     mat1.setColor("Color", ColorRGBA.Blue);

     /* Sets the material to the spatial blue */
     blue.setMaterial(mat1);

     /** create a red box straight above the blue one at (1,3,1) */
     Box b2 = new Box(1, 1, 1);
     Geometry red = new Geometry("Box", b2);
     red.setLocalTranslation(new Vector3f(1, 3, 1));

     Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
     mat2.setColor("Color", ColorRGBA.Red);
     red.setMaterial(mat2);

     /** Creates a pivot node at (0,0,0) and attaches it to the root node */
     Node pivot = new Node("pivot");

     /** Nodes are automatically set to the origin, in case it fails to though, use the method bellow */
     pivot.setLocalTranslation(Vector3f.ZERO);

     /** Attaches the node to the scene */
     rootNode.attachChild(pivot);

     /** Attaches the two boxes to the *pivot* node. (And transitively to the root node.) */
     pivot.attachChild(blue);
     pivot.attachChild(red);

     /** Rotates the pivot node: Note that both boxes have rotated! */
     pivot.rotate(pitch*FastMath.DEG_TO_RAD, yaw*FastMath.DEG_TO_RAD, roll*FastMath.DEG_TO_RAD);
   }

 }
