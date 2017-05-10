package backend;

import java.util.ArrayList;
import java.util.Random;
import static backend.StaticContent.ACTIVEBOTS;
import static backend.StaticContent.iMax;
import static backend.StaticContent.eMax;

public class BotsWorkFlow {

    double currentError = 9999;
    Random random = new Random();
    private final ArrayList<Robot> swarm;
    private RoboPosition globalBestPos;
    private final ArrayList<RoboPosition> localBestPos;
    private final double[] fvalueList;
    public static double xaxis;
    public static double yaxis;
    public static ArrayList<ArrayList<RoboPosition>> graphData = new ArrayList<>();

    private final double[] localBest;

    private double globalBestfitness;

    public BotsWorkFlow() {
        this.localBest = new double[ACTIVEBOTS];
        this.fvalueList = new double[ACTIVEBOTS];
        this.localBestPos = new ArrayList<>();
        this.swarm = new ArrayList<>();
    }

    public void createWorkflow() {

        FunctionalMethods fobj = new FunctionalMethods();
        int sval = 0;

        // Create Swarm of 40 Particles and fitness values 
        for (int i = 0; i < ACTIVEBOTS; i++) {
            swarm.add(fobj.createSwarm());

        }

        // Create a list for storing Graph co-ordinates 
        for (int i = 0; i < ACTIVEBOTS; i++) {
            ArrayList<RoboPosition> rp = new ArrayList<>();
            rp.add(swarm.get(i).getPosition());
            graphData.add(rp);
        }

        // Calculates fittness Value for each Robots
        for (int i = 0; i < ACTIVEBOTS; i++) {
            fvalueList[i] = swarm.get(i).getfValue();

        }

        // Calculate Local Best Fitness and Location of the same 
        for (int i = 0; i < ACTIVEBOTS; i++) {
            localBest[i] = fvalueList[i];
            localBestPos.add(swarm.get(i).getPosition());
        }

        while (sval < iMax && currentError > eMax) {

            //  update the local best values (local best fitness and Position)
            for (int i = 0; i < ACTIVEBOTS; i++) {
                if (fvalueList[i] < localBest[i]) {
                    localBest[i] = fvalueList[i];
                    localBestPos.set(i, swarm.get(i).getPosition());
                }
            }

            // get the fitness Index (The least fitness among the available particles)
            int findex = fobj.getFitnessIndex(fvalueList);

            // update the global best values (global best fitness and Position)
            if (sval == 0 || fvalueList[findex] < globalBestfitness) {
                globalBestfitness = fvalueList[findex];
                globalBestPos = swarm.get(findex).getPosition();
            }

            for (int i = 0; i < ACTIVEBOTS; i++) {
                Robot robo = swarm.get(i);
                // Set New Speed Based on the Global Best
                robo.setSpeed(fobj.calculateNewSpeed(localBestPos, globalBestPos, robo, sval, i));

                // Set New Position Based on the Global Best
                RoboPosition rp = fobj.calculateNewPos(robo);
                robo.setPosition(rp);
                // Filling data for graph
                graphData.get(i).add(rp);

            }

            currentError = FunctionalMethods.calculatefitness(globalBestPos) - 0;
            System.out.print("GlobalBest Position for Iteration " + sval + ": (" + globalBestPos.getxAxis() + "," + globalBestPos.getyAxis() + ")");
            System.out.println("   FitnesValue: " + FunctionalMethods.calculatefitness(globalBestPos));
            sval++;

            // Update Fitness after each Iterations             
            for (int i = 0; i < ACTIVEBOTS; i++) {
                fvalueList[i] = swarm.get(i).getfValue();
            }

        }
        System.out.println("");
        System.out.println("Exit found at : (" + globalBestPos.getxAxis() + "," + globalBestPos.getyAxis() + ")");
    }

}
