package backend;

import static backend.StaticContent.xMax;
import static backend.StaticContent.xMin;
import static backend.StaticContent.yMax;
import static backend.StaticContent.yMin;
import static backend.StaticContent.vMax;
import static backend.StaticContent.vMin;
import static backend.StaticContent.C1;
import static backend.StaticContent.C2;
import static backend.StaticContent.iMax;
import static backend.StaticContent.wMax;
import static backend.StaticContent.wMin;
import java.util.ArrayList;
import java.util.Random;

public class FunctionalMethods {

    Random random = new Random();

    public Robot createSwarm() {

        Robot bot = new Robot();
        String type;

        type = "MovingBot";
        // randomize location inside a space defined in Problem Set

        double x = xMin + random.nextDouble() * (xMax - xMin);
        double y = yMin + random.nextDouble() * (yMax - yMin);
        RoboPosition position = new RoboPosition(x, y);

        // randomize velocity in the range defined in Problem Set
        double vx = vMin + random.nextDouble() * (vMax - vMin);
        double vy = vMin + random.nextDouble() * (vMax - vMin);
        RoboSpeed speed = new RoboSpeed(vx, vy);

        bot.setPosition(position);
        bot.setSpeed(speed);
        bot.setRoboType(type);
        return bot;

    }

    public int getFitnessIndex(double[] list) {
        int pos = 0;
        double minValue = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < minValue) {
                pos = i;
                minValue = list[i];
            }
        }

        return pos;
    }

    public RoboSpeed calculateNewSpeed(ArrayList<RoboPosition> localBestPos, RoboPosition globalBestPos, Robot robo, int sval, int i) {

        double r1 = random.nextDouble();
        double r2 = random.nextDouble();
        double tmp = (((double) sval) / iMax);

        double w = wMax - tmp * (wMax - wMin);
        double nvx = (w * robo.getSpeed().getvMin())
                + (r1 * C1) * (localBestPos.get(i).getxAxis() - robo.getPosition().getxAxis())
                + (r2 * C2) * (globalBestPos.getxAxis() - robo.getPosition().getxAxis());
        double nvy = (w * robo.getSpeed().getvMax())
                + (r1 * C1) * (localBestPos.get(i).getyAxis() - robo.getPosition().getyAxis())
                + (r2 * C2) * (globalBestPos.getyAxis() - robo.getPosition().getyAxis());
        RoboSpeed rspd = new RoboSpeed(nvx, nvy);
        return rspd;
    }

    public RoboPosition calculateNewPos(Robot robo) {
        double npx = robo.getPosition().getxAxis() + robo.getSpeed().getvMin();
        double npy = robo.getPosition().getyAxis() + robo.getSpeed().getvMax();
        RoboPosition rpos = new RoboPosition(npx, npy);
        return rpos;
    }

    public static double calculatefitness(RoboPosition position) {
        double fValue = 0;
        double fx = 380;
        double fy = 280;
        BotsWorkFlow.xaxis = fx;
        BotsWorkFlow.yaxis = fy;
        fValue = Math.sqrt(Math.pow((position.getxAxis() - fx), 2) + Math.pow((position.getyAxis() - fy), 2));
        return fValue;
    }
}
