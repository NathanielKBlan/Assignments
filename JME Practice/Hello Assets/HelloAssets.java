import com.jme3.app.SimpleApplication;
import com.jme3.font.BitmapText;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.asset.plugins.ZipLocator;
import com.jme3.export.binary.BinaryExporter;
import java.io.IOException;
import java.io.File;

public class HelloAssets extends SimpleApplication{

    public static void main(String[] args) {
      HelloAssets app = new HelloAssets();
      app.start();
    }

    @Override
    public void simpleInitApp(){

      /** Important code bellow!!!
      * Since I am not using the software development kit this code will serve
      * to convert model files to a j3o format */

      //BinaryExporter b = new BinaryExporter();
      //Spatial gameLevel = assetManager.loadModel("assets/Scenes/town/main.scene");

      //try{
        //b.getInstance().save(gameLevel, new File("assets/Scenes/town/" + "main.j3o"));
      //}catch(IOException e){
        //System.out.println("Uhh oh.");
      //}


      /** Registers a ziplocator */
      //assetManager.registerLocator("town.zip", ZipLocator.class);
      //Spatial gameLevel = assetManager.loadModel("main.scene");
      //gameLevel.setLocalTranslation(0, -5.2f, 0);
      //gameLevel.setLocalScale(2);
      //rootNode.attachChild(gameLevel);

      /** Same as previous lines of code in that it loads a scene,
      * except this will do so with a j3o file which jme3 uses allot */
      Spatial gameLevel = assetManager.loadModel("assets/Scenes/town/main.j3o");
      gameLevel.setLocalTranslation(0, -5.2f, 0);
      gameLevel.setLocalScale(2);
      rootNode.attachChild(gameLevel);

      /** Creats a spatial called teapot using a saved model and assigning a default material to it*/
      Spatial teapot = assetManager.loadModel("Models/Teapot/Teapot.obj");
      Material mat_default = new Material(assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
      teapot.setMaterial(mat_default);
      rootNode.attachChild(teapot);

      /** Creates a wall with a simple texture from test_data*/
      Box box = new Box(2.5f, 2.5f, 1.0f);
      Spatial wall = new Geometry("Box", box);
      Material mat_brick = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
      mat_brick.setTexture("ColorMap", assetManager.loadTexture("Textures/Terrain/BrickWall/BrickWall.jpg"));
      wall.setMaterial(mat_brick);
      wall.setLocalTranslation(2.0f, -2.5f, 0.0f);
      rootNode.attachChild(wall);

      /** Displays a line of text with a default font*/
      guiNode.detachAllChildren();
      guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
      BitmapText helloText = new BitmapText(guiFont, false);
      helloText.setSize(guiFont.getCharSet().getRenderedSize());
      helloText.setText("Hello World!");
      helloText.setLocalTranslation(300, helloText.getLineHeight(), 0);
      guiNode.attachChild(helloText);

      /** Creates a ninja and displays it*/
      //Loads a model from test_data (OgreXML + material + texture)
      Spatial ninja = assetManager.loadModel("Models/Ninja/Ninja.mesh.xml");
      ninja.scale(0.05f, 0.05f, 0.05f);
      ninja.rotate(0.0f, -3.0f, 0.0f);
      ninja.setLocalTranslation(0.0f, -5.0f, -2.0f);
      rootNode.attachChild(ninja);

      //Model needs light to be visible
      DirectionalLight sun = new DirectionalLight();
      sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f).normalizeLocal());
      rootNode.addLight(sun);
    }
}
