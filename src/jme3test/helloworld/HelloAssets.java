import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;
//Add o testData para funcionar

/** Sample 3 - how to load an OBJ model, and OgreXML model,
 * a material/texture, or text. */
public class HelloAssets extends SimpleApplication {
    
    
        private double angulo, angulo2, angulo3, angulo4, angulo5, angulo6, angulo7, angulo8, angulo9= 0;
    
        Sphere sol = new Sphere(32, 32, 5f);
        Geometry geom = new Geometry("Sphere", sol);
        
        Sphere mercurio = new Sphere(32, 32, 1f);
        Geometry geom2 = new Geometry("Sphere", mercurio);
        
        Sphere venus = new Sphere(32, 32, 2.2f);
        Geometry geom3 = new Geometry("Sphere", venus);
        
        Sphere terra = new Sphere(32, 32, 2.2f);
        Geometry geom4 = new Geometry("Sphere", terra);
        
        Sphere marte = new Sphere(32, 32, 1.5f);
        Geometry geom5 = new Geometry("Sphere", marte);
        
        Sphere jupiter = new Sphere(32, 32, 4f);
        Geometry geom6 = new Geometry("Sphere", jupiter);
        
        Sphere saturno = new Sphere(32, 32, 3f);
        Geometry geom7 = new Geometry("Sphere", saturno);
        
        Sphere urano = new Sphere(32, 32, 2f);
        Geometry geom8 = new Geometry("Sphere", urano);
        
        Sphere neptuno = new Sphere(32, 32, 2f);
        Geometry geom9 = new Geometry("Sphere", neptuno);
        
        
        Vector3f sol1= new Vector3f(0.0f, 1.0f, 1.0f);
        Vector3f mercurio1 = new Vector3f(1.0f, 10.0f, 10.0f);
        Vector3f venus1= new Vector3f(20.0f, 1.0f, 1.0f);
        Vector3f terra1 = new Vector3f(11.0f, 1.0f, 1.0f);
        Vector3f marte1 = new Vector3f(14.0f, 1.0f, 1.0f);
        Vector3f jupiter1 = new Vector3f(17.0f, 1.0f, 1.0f);
        Vector3f saturno1 = new Vector3f(20.0f, 1.0f, 1.0f);
        Vector3f urano1 = new Vector3f(23f, 1.0f, 1.0f);
        Vector3f neptuno1 = new Vector3f(26f, 1.0f, 1.0f);
       
        
        Vector3f camera = new Vector3f(0f, 0f, 100f);

    public static void main(String[] args) {
        HelloAssets app = new HelloAssets();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(true);
        flyCam.setDragToRotate(true);
        inputManager.setCursorVisible(true);
        cam.setLocation(camera);

       
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat3 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat4 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat5 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat6 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat7 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat8 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat9 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Material mat10 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
         //"Texturizar"
        mat.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_sun.jpg"));
        mat2.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_mercury.jpg"));
        mat3.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_venus_surface.jpg"));
        mat4.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_earth_daymap.jpg"));
        mat5.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_mars.jpg"));
        mat6.setTexture("ColorMap", assetManager.loadTexture("Textures/8k_jupiter.jpg"));
        mat7.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_saturn.jpg"));
        mat8.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_uranus.jpg"));
        mat9.setTexture("ColorMap", assetManager.loadTexture("Textures/2k_neptune.jpg"));
        
        geom.setMaterial(mat);
        geom2.setMaterial(mat2);
        geom3.setMaterial(mat3);
        geom4.setMaterial(mat4);
        geom5.setMaterial(mat5);
        geom6.setMaterial(mat6);
        geom7.setMaterial(mat7);
        geom8.setMaterial(mat8);
        geom9.setMaterial(mat9);

        
        rootNode.attachChild(geom);
        rootNode.attachChild(geom2);
        rootNode.attachChild(geom3);
        rootNode.attachChild(geom4);
        rootNode.attachChild(geom5);
        rootNode.attachChild(geom6);
        rootNode.attachChild(geom7);
        rootNode.attachChild(geom8);
        rootNode.attachChild(geom9);
       
        
        
    }
    
    @Override
    public void simpleUpdate(float tpf) {
        angulo = angulo + 0.04;
        angulo2 = angulo2 + 0.02;
        angulo3 = angulo3 + 0.015;
        angulo4 = angulo4 + 0.0097;
        angulo5 = angulo5 + 0.0085;
        angulo6 = angulo6 + 0.0080;
        angulo7 = angulo7 + 0.007;
        angulo8 = angulo8 + 0.0065;
        angulo9 = angulo9 + 0.0050;
           
        float r = FastMath.DEG_TO_RAD;
        double Merc = FastMath.DEG_TO_RAD*angulo;
        double Ven = FastMath.DEG_TO_RAD*angulo2;
        double Tier = FastMath.DEG_TO_RAD*angulo3;
        double Marte = FastMath.DEG_TO_RAD*angulo4;
        double Jupi = FastMath.DEG_TO_RAD*angulo5;
        double Satur = FastMath.DEG_TO_RAD*angulo6;
        double Uran = FastMath.DEG_TO_RAD*angulo7;
        double Neptu = FastMath.DEG_TO_RAD*angulo8;
         
        
        int rMer = 7;
        int rVenus = 12;
        int rTierra = 17;
        int rMarte = 22;
        int rJupiter = 32;
        int rSaturno = 40;
        int rUrano = 44;
        int rNeptuno = 48;
        
        
        float xMer = (float) Math.sin(Merc)*rMer;
        float yMer = (float) Math.cos(Merc)*rMer;
        
        float xVenus = (float) Math.sin(Ven)*rVenus;
        float yVenus = (float) Math.cos(Ven)*rVenus;
        
        float xTierra = (float) Math.sin(Tier)*rTierra;
        float yTierra = (float) Math.cos(Tier)*rTierra;
        
        float xMarte = (float) Math.sin(Marte)*rMarte;
        float yMarte = (float) Math.cos(Marte)*rMarte;
        
        float xJupiter = (float) Math.sin(Jupi)*rJupiter;
        float yJupiter = (float) Math.cos(Jupi)*rJupiter;
        
        float xSaturno = (float) Math.sin(Satur)*rSaturno;
        float ySaturno = (float) Math.cos(Satur)*rSaturno;
        
        float xUrano = (float) Math.sin(Uran)*rUrano;
        float yUrano = (float) Math.cos(Uran)*rUrano;
        
        float xNeptuno = (float) Math.sin(Neptu)*rNeptuno;
        float yNeptuno = (float) Math.cos(Neptu)*rNeptuno;
        
        
        geom.rotate(r,0f,0f);
        geom2.rotate(r,0f,0f);
        geom3.rotate(r,0f,0f);
        geom4.rotate(r,0f,0f);
        geom5.rotate(r,0f,0f);
        geom6.rotate(r,0f,0f);
        geom7.rotate(r,0f,0f);
        geom8.rotate(r,0f,0f);
        geom9.rotate(r,0f,0f);
       
        
        Vector3f orbMercurio = new Vector3f (xMer , yMer, 0);
        Vector3f orbVenus = new Vector3f (xVenus , yVenus, 0);
        Vector3f orbTierra = new Vector3f (xTierra , yTierra, 0);
        Vector3f orbMarte = new Vector3f (xMarte , yMarte, 0);
        Vector3f orbJupiter = new Vector3f (xJupiter , yJupiter, 0);
        Vector3f orbSaturno = new Vector3f (xSaturno , ySaturno, 0);
        Vector3f orbUrano = new Vector3f (xUrano , yUrano, 0);
        Vector3f orbNeptuno = new Vector3f (xNeptuno , yNeptuno, 0);
        
        geom2.setLocalTranslation(orbMercurio);
        geom3.setLocalTranslation(orbVenus);
        geom4.setLocalTranslation(orbTierra);
        geom5.setLocalTranslation(orbMarte);
        geom6.setLocalTranslation(orbJupiter);
        geom7.setLocalTranslation(orbSaturno);
        geom8.setLocalTranslation(orbUrano);
        geom9.setLocalTranslation(orbNeptuno);
        
    }
    
}

   