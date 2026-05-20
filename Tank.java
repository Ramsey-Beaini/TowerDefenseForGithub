import java.util.ArrayList;
import java.awt.Color;

/**
 * TODO: Write the Tank class.
 *
 * The Tank is the standard enemy type with balanced health and speed.
 *
 * REQUIREMENTS:
 *  - Must extend Enemy.
 *  - Constructor takes one parameter: ArrayList<Waypoint> path.
 *  - Call super() with: health = 200, speed = 1, goldReward = 30, path = path.
 *  - Override getColor() to return Color.RED.
 *  - Include a JavaDoc comment above the class and above each method.
 */
public class Tank extends Enemy {
    
    
    // TODO: Write the constructor.
    public Tank(ArrayList<Waypoint> path){
        super(200, 1, 30, path);
    }
    

    // TODO: Override getColor() and return Color.RED.
    public Color getColor(){
        return Color.BLUE;
    }
    
    
}