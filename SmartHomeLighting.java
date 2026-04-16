import java.util.*;

interface LightAction {
    void execute();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Lights ON due to motion");
        LightAction night = () -> System.out.println("Dim lights for night");
        LightAction voice = () -> System.out.println("Lights ON by voice command");

        motion.execute();
        night.execute();
        voice.execute();
    }
}