package assignment1;

import ch.aplu.robotsim.*;

public class circle {
    circle(){
        TurtleRobot t = new TurtleRobot();
        t.setTurtleSpeed(100);
        while (true){
            t.forward(4);
            t.left(4);
        }
     }
    
    public static void main (String[] args) {
        circle robo = new circle();
    }
}
