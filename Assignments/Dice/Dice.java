import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.scene.Spatial;
import com.jme3.math.FastMath;
import com.jme3.asset.plugins.ZipLocator;
import com.jme3.export.binary.BinaryExporter;
import java.io.IOException;
import java.io.File;
import com.jme3.light.DirectionalLight;
import com.jme3.scene.Node;
import com.jme3.math.Matrix3f;
import com.jme3.math.Quaternion;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.font.BitmapText;
import java.util.ArrayList;

public class Dice extends SimpleApplication{

  int pitch;
  int pitch2;
  int yaw;
  int yaw2;
  int face;
  int face2;
  int face3;
  int face4;
  int r = 0;
  int doubles = 0;
  int rolls = 0;

  double average;

  Node pivot;
  Node pivot2;

  public static void main(String[] args) {
    Dice app = new Dice();
    app.start();

  }

  BitmapText helloText;
  Spatial dice1;
  Spatial dice2;
  ArrayList<Integer> times = new ArrayList<Integer>();

  @Override
  public void simpleInitApp(){

    dice1 = assetManager.loadModel("assets/Formats/dice.j3o");
    dice1.setLocalScale(1.0f);

    dice2 = assetManager.loadModel("assets/Formats/dice.j3o");
    dice2.setLocalTranslation(0, 0, 0);
    dice2.setLocalScale(1.0f);

    DirectionalLight sun = new DirectionalLight();
    sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f).normalizeLocal());
    rootNode.addLight(sun);

    pivot = new Node("pivot");
    pivot.setLocalTranslation(0, 0, 0);
    dice1.setLocalTranslation(0, 0, 0);

    rootNode.attachChild(pivot);

    pivot.attachChild(dice1);

    pivot2 = new Node("pivot2");
    pivot2.setLocalTranslation(5.0f, 0, 0);

    rootNode.attachChild(pivot2);

    pivot2.attachChild(dice2);

    initKeys();

  }

  private void initKeys(){
    inputManager.addMapping("Rotate", new KeyTrigger(KeyInput.KEY_R));
    inputManager.addListener(actionListener, "Rotate");
  }

  private final ActionListener actionListener = new ActionListener() {
        @Override
        public void onAction(String name, boolean keyPressed, float tpf) {
                if (name.equals("Rotate") && keyPressed) {
                    pitch = (int) Math.round(Math.random() * 360) + 0;
                    yaw = (int) Math.round(Math.random() * 360) + 0;
                    pitch2 = (int) Math.round(Math.random() * 360) + 0;
                    yaw2 = (int) Math.round(Math.random() * 360) + 0;
                    face = (int) Math.round(yaw/90.0) * 90;
                    face2 = (int) Math.round(pitch/90.0) * 90;
                    face3 = (int) Math.round(yaw2/90.0) * 90;
                    face4 = (int) Math.round(pitch2/90.0) * 90;

                    FaceValue val = new FaceValue(face, face2);
                    FaceValue val2 = new FaceValue(face3, face4);

                    float[] angles = {face2*FastMath.DEG_TO_RAD, face*FastMath.DEG_TO_RAD, 0.0f};
                    float[] angles2 = {face4*FastMath.DEG_TO_RAD, face3*FastMath.DEG_TO_RAD, 0.0f};
                    Quaternion q = new Quaternion(angles);
                    Quaternion q2 = new Quaternion(angles2);
                    pivot.setLocalRotation(q);
                    pivot2.setLocalRotation(q2);
                    r++;

                    guiNode.detachAllChildren();
                    guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
                    BitmapText helloText = new BitmapText(guiFont, false);
                    helloText.setSize(guiFont.getCharSet().getRenderedSize());

                    helloText.setLocalTranslation(300, helloText.getLineHeight(), 0);

                    if(val.value() == val2.value() && r >= 1){
                        rolls++;
                        times.add(rolls);
                        System.out.print("[ ");
                        for(int i = 0; i < times.size(); i++){
                          System.out.print(times.get(i) + " ");
                        }
                        System.out.print("]");
                        helloText.setText("Congrats! You rolled a double and it only took you " + rolls + " tries. It takes " + average + " rolls on average to roll a double.");
                        rolls = 0;
                    }else{
                        rolls++;
                        helloText.setText("Rolls to double: " + rolls + ".");
                    }

                    guiNode.attachChild(helloText);
                }
        }
    };

    @Override
    public void simpleUpdate(float tpf){
      pitch = (int) Math.round(Math.random() * 360) + 0;
      yaw = (int) Math.round(Math.random() * 360) + 0;
      pitch2 = (int) Math.round(Math.random() * 360) + 0;
      yaw2 = (int) Math.round(Math.random() * 360) + 0;
      face = (int) Math.round(yaw/90.0) * 90;
      face2 = (int) Math.round(pitch/90.0) * 90;
      face3 = (int) Math.round(yaw2/90.0) * 90;
      face4 = (int) Math.round(pitch2/90.0) * 90;

      FaceValue val = new FaceValue(face, face2);
      FaceValue val2 = new FaceValue(face3, face4);

      float[] angles = {face2*FastMath.DEG_TO_RAD, face*FastMath.DEG_TO_RAD, 0.0f};
      float[] angles2 = {face4*FastMath.DEG_TO_RAD, face3*FastMath.DEG_TO_RAD, 0.0f};
      Quaternion q = new Quaternion(angles);
      Quaternion q2 = new Quaternion(angles2);
      pivot.setLocalRotation(q);
      pivot2.setLocalRotation(q2);
      r++;

      guiNode.detachAllChildren();
      guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
      BitmapText helloText = new BitmapText(guiFont, false);
      helloText.setSize(guiFont.getCharSet().getRenderedSize());

      helloText.setLocalTranslation(300, helloText.getLineHeight(), 0);

      if(val.value() == val2.value() && r != 0){
          rolls++;
          doubles++;
          times.add(rolls);
          if(doubles == 2000){
            for(int i = 0; i < times.size(); i++){
              average = average + times.get(i);
            }
            average = average / times.size();
            System.out.println(average);
          }
          helloText.setText("Congrats! You rolled a double and it only took you " + rolls + " tries.");
          rolls = 0;
      }else{
          rolls++;
          helloText.setText("Rolls to double: " + rolls + ".");
      }

      guiNode.attachChild(helloText);
    }

}
