package rescuebots;

import backend.BotsWorkFlow;
import static backend.BotsWorkFlow.graphData;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.util.Duration;

/**
 *
 * @author VinothPMoorthy
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Circle R1;
    @FXML
    private Circle R2;
    @FXML
    private Circle R3;
    @FXML
    private Circle R4;
    @FXML
    private Circle R5;
    @FXML
    private Circle R6;
    @FXML
    private Circle R7;
    @FXML
    private Circle R8;
    @FXML
    private Circle R9;
    @FXML
    private Circle R10;
    @FXML
    private Circle R11;
    @FXML
    private Circle R12;
    @FXML
    private Circle R13;
    @FXML
    private Circle R15;
    @FXML
    private Circle R16;
    @FXML
    private Circle R17;
    @FXML
    private Circle R18;
    @FXML
    private Circle R19;
    @FXML
    private Circle R20;
    @FXML
    private Circle R21;
    @FXML
    private Circle R22;
    @FXML
    private Circle R23;
    @FXML
    private Circle R24;
    @FXML
    private Circle R25;
    @FXML
    private Circle R26;
    @FXML
    private Circle R27;
    @FXML
    private Circle R28;
    @FXML
    private Circle R29;
    @FXML
    private Circle R30;
    @FXML
    private Circle R31;
    @FXML
    private Circle R32;
    @FXML
    private Circle R33;
    @FXML
    private Circle R34;
    @FXML
    private Circle R35;
    @FXML
    private Circle R36;
    @FXML
    private Circle R37;
    @FXML
    private Circle R38;
    @FXML
    private Circle R39;
    @FXML
    private Circle R40;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int size = graphData.get(0).size();

        // Robot  40         
        Polyline r40 = new Polyline();

        r40.getPoints().add(new Double(100.0));
        r40.getPoints().add(new Double(100.0));
        r40.getPoints().add(new Double(BotsWorkFlow.xaxis));
        r40.getPoints().add(new Double(BotsWorkFlow.yaxis));

        PathTransition rt40 = new PathTransition();
        rt40.setDuration(Duration.seconds(10));
        rt40.setNode(R40);
        rt40.setPath(r40);
        rt40.play();
        long size1 = 100;
        try {
            sleep(size1);
        } catch (InterruptedException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

// Robot  1         
        Polyline r1 = new Polyline();
        for (int i = 0; i < size; i++) {
            r1.getPoints().add(new Double(graphData.get(0).get(i).getxAxis()));
            r1.getPoints().add(new Double(graphData.get(0).get(i).getyAxis()));
        }

        PathTransition rt1 = new PathTransition();
        rt1.setDuration(Duration.seconds(15));
        rt1.setNode(R1);
        rt1.setPath(r1);
        rt1.play();

// Robot  2         
        Polyline r2 = new Polyline();
        for (int i = 0; i < size; i++) {
            r2.getPoints().add(new Double(graphData.get(1).get(i).getxAxis()));
            r2.getPoints().add(new Double(graphData.get(1).get(i).getyAxis()));
        }

        PathTransition rt2 = new PathTransition();
        rt2.setDuration(Duration.seconds(15));
        rt2.setNode(R2);
        rt2.setPath(r2);
        rt2.play();

// Robot  3         
        Polyline r3 = new Polyline();
        for (int i = 0; i < size; i++) {
            r3.getPoints().add(new Double(graphData.get(2).get(i).getxAxis()));
            r3.getPoints().add(new Double(graphData.get(2).get(i).getyAxis()));
        }

        PathTransition rt3 = new PathTransition();
        rt3.setDuration(Duration.seconds(15));
        rt3.setNode(R3);
        rt3.setPath(r3);
        rt3.play();

// Robot  4         
        Polyline r4 = new Polyline();
        for (int i = 0; i < size; i++) {
            r4.getPoints().add(new Double(graphData.get(3).get(i).getxAxis()));
            r4.getPoints().add(new Double(graphData.get(3).get(i).getyAxis()));
        }

        PathTransition rt4 = new PathTransition();
        rt4.setDuration(Duration.seconds(15));
        rt4.setNode(R4);
        rt4.setPath(r4);
        rt4.play();

        // Robot  5        
        Polyline r5 = new Polyline();
        for (int i = 0; i < size; i++) {
            r5.getPoints().add(new Double(graphData.get(4).get(i).getxAxis()));
            r5.getPoints().add(new Double(graphData.get(4).get(i).getyAxis()));
        }

        PathTransition rt5 = new PathTransition();
        rt5.setDuration(Duration.seconds(15));
        rt5.setNode(R5);
        rt5.setPath(r5);
        rt5.play();

        // Robot  6         
        Polyline r6 = new Polyline();
        for (int i = 0; i < size; i++) {
            r6.getPoints().add(new Double(graphData.get(5).get(i).getxAxis()));
            r6.getPoints().add(new Double(graphData.get(5).get(i).getyAxis()));
        }

        PathTransition rt6 = new PathTransition();
        rt6.setDuration(Duration.seconds(15));
        rt6.setNode(R6);
        rt6.setPath(r6);
        rt6.play();

        // Robot  7         
        Polyline r7 = new Polyline();
        for (int i = 0; i < size; i++) {
            r7.getPoints().add(new Double(graphData.get(6).get(i).getxAxis()));
            r7.getPoints().add(new Double(graphData.get(6).get(i).getyAxis()));
        }

        PathTransition rt7 = new PathTransition();
        rt7.setDuration(Duration.seconds(15));
        rt7.setNode(R7);
        rt7.setPath(r7);
        rt7.play();

        // Robot  8         
        Polyline r8 = new Polyline();
        for (int i = 0; i < size; i++) {
            r8.getPoints().add(new Double(graphData.get(7).get(i).getxAxis()));
            r8.getPoints().add(new Double(graphData.get(7).get(i).getyAxis()));
        }

        PathTransition rt8 = new PathTransition();
        rt8.setDuration(Duration.seconds(15));
        rt8.setNode(R8);
        rt8.setPath(r8);
        rt8.play();

        // Robot  9         
        Polyline r9 = new Polyline();
        for (int i = 0; i < size; i++) {
            r9.getPoints().add(new Double(graphData.get(8).get(i).getxAxis()));
            r9.getPoints().add(new Double(graphData.get(8).get(i).getyAxis()));
        }

        PathTransition rt9 = new PathTransition();
        rt9.setDuration(Duration.seconds(15));
        rt9.setNode(R9);
        rt9.setPath(r9);
        rt9.play();

        // Robot  10         
        Polyline r10 = new Polyline();
        for (int i = 0; i < size; i++) {
            r10.getPoints().add(new Double(graphData.get(9).get(i).getxAxis()));
            r10.getPoints().add(new Double(graphData.get(9).get(i).getyAxis()));
        }

        PathTransition rt10 = new PathTransition();
        rt10.setDuration(Duration.seconds(15));
        rt10.setNode(R10);
        rt10.setPath(r10);
        rt10.play();

        // Robot  11         
        Polyline r11 = new Polyline();
        for (int i = 0; i < size; i++) {
            r11.getPoints().add(new Double(graphData.get(10).get(i).getxAxis()));
            r11.getPoints().add(new Double(graphData.get(10).get(i).getyAxis()));
        }

        PathTransition rt11 = new PathTransition();
        rt11.setDuration(Duration.seconds(15));
        rt11.setNode(R11);
        rt11.setPath(r11);
        rt11.play();

        // Robot  12         
        Polyline r12 = new Polyline();
        for (int i = 0; i < size; i++) {
            r12.getPoints().add(new Double(graphData.get(11).get(i).getxAxis()));
            r12.getPoints().add(new Double(graphData.get(11).get(i).getyAxis()));
        }

        PathTransition rt12 = new PathTransition();
        rt12.setDuration(Duration.seconds(15));
        rt12.setNode(R12);
        rt12.setPath(r12);
        rt12.play();

        // Robot  13         
        Polyline r13 = new Polyline();
        for (int i = 0; i < size; i++) {
            r13.getPoints().add(new Double(graphData.get(12).get(i).getxAxis()));
            r13.getPoints().add(new Double(graphData.get(12).get(i).getyAxis()));
        }

        PathTransition rt13 = new PathTransition();
        rt13.setDuration(Duration.seconds(15));
        rt13.setNode(R13);
        rt13.setPath(r13);
        rt13.play();

        // Robot  15         
        Polyline r15 = new Polyline();
        for (int i = 0; i < size; i++) {
            r15.getPoints().add(new Double(graphData.get(14).get(i).getxAxis()));
            r15.getPoints().add(new Double(graphData.get(14).get(i).getyAxis()));
        }

        PathTransition rt15 = new PathTransition();
        rt15.setDuration(Duration.seconds(15));
        rt15.setNode(R15);
        rt15.setPath(r15);
        rt15.play();

        // Robot  16         
        Polyline r16 = new Polyline();
        for (int i = 0; i < size; i++) {
            r16.getPoints().add(new Double(graphData.get(15).get(i).getxAxis()));
            r16.getPoints().add(new Double(graphData.get(15).get(i).getyAxis()));
        }

        PathTransition rt16 = new PathTransition();
        rt16.setDuration(Duration.seconds(15));
        rt16.setNode(R16);
        rt16.setPath(r16);
        rt16.play();

        // Robot  17         
        Polyline r17 = new Polyline();
        for (int i = 0; i < size; i++) {
            r17.getPoints().add(new Double(graphData.get(16).get(i).getxAxis()));
            r17.getPoints().add(new Double(graphData.get(16).get(i).getyAxis()));
        }

        PathTransition rt17 = new PathTransition();
        rt17.setDuration(Duration.seconds(15));
        rt17.setNode(R17);
        rt17.setPath(r17);
        rt17.play();

        // Robot  18         
        Polyline r18 = new Polyline();
        for (int i = 0; i < size; i++) {
            r18.getPoints().add(new Double(graphData.get(17).get(i).getxAxis()));
            r18.getPoints().add(new Double(graphData.get(17).get(i).getyAxis()));
        }

        PathTransition rt18 = new PathTransition();
        rt18.setDuration(Duration.seconds(15));
        rt18.setNode(R18);
        rt18.setPath(r18);
        rt18.play();

        // Robot  19         
        Polyline r19 = new Polyline();
        for (int i = 0; i < size; i++) {
            r19.getPoints().add(new Double(graphData.get(18).get(i).getxAxis()));
            r19.getPoints().add(new Double(graphData.get(18).get(i).getyAxis()));
        }

        PathTransition rt19 = new PathTransition();
        rt19.setDuration(Duration.seconds(15));
        rt19.setNode(R19);
        rt19.setPath(r19);
        rt19.play();

        // Robot  20         
        Polyline r20 = new Polyline();
        for (int i = 0; i < size; i++) {
            r20.getPoints().add(new Double(graphData.get(19).get(i).getxAxis()));
            r20.getPoints().add(new Double(graphData.get(19).get(i).getyAxis()));
        }

        PathTransition rt20 = new PathTransition();
        rt20.setDuration(Duration.seconds(15));
        rt20.setNode(R20);
        rt20.setPath(r20);
        rt20.play();

        // Robot  21         
        Polyline r21 = new Polyline();
        for (int i = 0; i < size; i++) {
            r21.getPoints().add(new Double(graphData.get(20).get(i).getxAxis()));
            r21.getPoints().add(new Double(graphData.get(20).get(i).getyAxis()));
        }

        PathTransition rt21 = new PathTransition();
        rt21.setDuration(Duration.seconds(15));
        rt21.setNode(R21);
        rt21.setPath(r21);
        rt21.play();

        // Robot  22
        Polyline r22 = new Polyline();
        for (int i = 0; i < size; i++) {
            r22.getPoints().add(new Double(graphData.get(21).get(i).getxAxis()));
            r22.getPoints().add(new Double(graphData.get(21).get(i).getyAxis()));
        }

        PathTransition rt22 = new PathTransition();
        rt22.setDuration(Duration.seconds(15));
        rt22.setNode(R22);
        rt22.setPath(r22);
        rt22.play();

        // Robot  23        
        Polyline r23 = new Polyline();
        for (int i = 0; i < size; i++) {
            r23.getPoints().add(new Double(graphData.get(22).get(i).getxAxis()));
            r23.getPoints().add(new Double(graphData.get(22).get(i).getyAxis()));
        }

        PathTransition rt23 = new PathTransition();
        rt23.setDuration(Duration.seconds(15));
        rt23.setNode(R23);
        rt23.setPath(r23);
        rt23.play();

        // Robot  24         
        Polyline r24 = new Polyline();
        for (int i = 0; i < size; i++) {
            r24.getPoints().add(new Double(graphData.get(23).get(i).getxAxis()));
            r24.getPoints().add(new Double(graphData.get(23).get(i).getyAxis()));
        }

        PathTransition rt24 = new PathTransition();
        rt24.setDuration(Duration.seconds(15));
        rt24.setNode(R24);
        rt24.setPath(r24);
        rt24.play();

        // Robot  25         
        Polyline r25 = new Polyline();
        for (int i = 0; i < size; i++) {
            r25.getPoints().add(new Double(graphData.get(24).get(i).getxAxis()));
            r25.getPoints().add(new Double(graphData.get(24).get(i).getyAxis()));
        }

        PathTransition rt25 = new PathTransition();
        rt25.setDuration(Duration.seconds(15));
        rt25.setNode(R25);
        rt25.setPath(r25);
        rt25.play();

        // Robot  26         
        Polyline r26 = new Polyline();
        for (int i = 0; i < size; i++) {
            r26.getPoints().add(new Double(graphData.get(25).get(i).getxAxis()));
            r26.getPoints().add(new Double(graphData.get(25).get(i).getyAxis()));
        }

        PathTransition rt26 = new PathTransition();
        rt26.setDuration(Duration.seconds(15));
        rt26.setNode(R26);
        rt26.setPath(r26);
        rt26.play();

        // Robot  27         
        Polyline r27 = new Polyline();
        for (int i = 0; i < size; i++) {
            r27.getPoints().add(new Double(graphData.get(26).get(i).getxAxis()));
            r27.getPoints().add(new Double(graphData.get(26).get(i).getyAxis()));
        }

        PathTransition rt27 = new PathTransition();
        rt27.setDuration(Duration.seconds(15));
        rt27.setNode(R27);
        rt27.setPath(r27);
        rt27.play();

        // Robot  28         
        Polyline r28 = new Polyline();
        for (int i = 0; i < size; i++) {
            r28.getPoints().add(new Double(graphData.get(27).get(i).getxAxis()));
            r28.getPoints().add(new Double(graphData.get(27).get(i).getyAxis()));
        }

        PathTransition rt28 = new PathTransition();
        rt28.setDuration(Duration.seconds(15));
        rt28.setNode(R28);
        rt28.setPath(r28);
        rt28.play();

        // Robot  29         
        Polyline r29 = new Polyline();
        for (int i = 0; i < size; i++) {
            r29.getPoints().add(new Double(graphData.get(28).get(i).getxAxis()));
            r29.getPoints().add(new Double(graphData.get(28).get(i).getyAxis()));
        }

        PathTransition rt29 = new PathTransition();
        rt29.setDuration(Duration.seconds(15));
        rt29.setNode(R29);
        rt29.setPath(r29);
        rt29.play();

        // Robot  30       
        Polyline r30 = new Polyline();
        for (int i = 0; i < size; i++) {
            r30.getPoints().add(new Double(graphData.get(29).get(i).getxAxis()));
            r30.getPoints().add(new Double(graphData.get(29).get(i).getyAxis()));
        }

        PathTransition rt30 = new PathTransition();
        rt30.setDuration(Duration.seconds(15));
        rt30.setNode(R30);
        rt30.setPath(r30);
        rt30.play();

        // Robot  31         
        Polyline r31 = new Polyline();
        for (int i = 0; i < size; i++) {
            r31.getPoints().add(new Double(graphData.get(30).get(i).getxAxis()));
            r31.getPoints().add(new Double(graphData.get(30).get(i).getyAxis()));
        }

        PathTransition rt31 = new PathTransition();
        rt31.setDuration(Duration.seconds(15));
        rt31.setNode(R31);
        rt31.setPath(r31);
        rt31.play();

        // Robot  32         
        Polyline r32 = new Polyline();
        for (int i = 0; i < size; i++) {
            r32.getPoints().add(new Double(graphData.get(31).get(i).getxAxis()));
            r32.getPoints().add(new Double(graphData.get(31).get(i).getyAxis()));
        }

        PathTransition rt32 = new PathTransition();
        rt32.setDuration(Duration.seconds(15));
        rt32.setNode(R32);
        rt32.setPath(r32);
        rt32.play();

        // Robot  33         
        Polyline r33 = new Polyline();
        for (int i = 0; i < size; i++) {
            r33.getPoints().add(new Double(graphData.get(32).get(i).getxAxis()));
            r33.getPoints().add(new Double(graphData.get(32).get(i).getyAxis()));
        }

        PathTransition rt33 = new PathTransition();
        rt33.setDuration(Duration.seconds(15));
        rt33.setNode(R33);
        rt33.setPath(r33);
        rt33.play();

// Robot  34
        Polyline r34 = new Polyline();
        for (int i = 0; i < size; i++) {
            r34.getPoints().add(new Double(graphData.get(33).get(i).getxAxis()));
            r34.getPoints().add(new Double(graphData.get(33).get(i).getyAxis()));
        }

        PathTransition rt34 = new PathTransition();
        rt34.setDuration(Duration.seconds(15));
        rt34.setNode(R34);
        rt34.setPath(r34);
        rt34.play();

        // Robot  35         
        Polyline r35 = new Polyline();
        for (int i = 0; i < size; i++) {
            r35.getPoints().add(new Double(graphData.get(34).get(i).getxAxis()));
            r35.getPoints().add(new Double(graphData.get(34).get(i).getyAxis()));
        }

        PathTransition rt35 = new PathTransition();
        rt35.setDuration(Duration.seconds(15));
        rt35.setNode(R35);
        rt35.setPath(r35);
        rt35.play();

        // Robot  36        
        Polyline r36 = new Polyline();
        for (int i = 0; i < size; i++) {
            r36.getPoints().add(new Double(graphData.get(35).get(i).getxAxis()));
            r36.getPoints().add(new Double(graphData.get(35).get(i).getyAxis()));
        }

        PathTransition rt36 = new PathTransition();
        rt36.setDuration(Duration.seconds(15));
        rt36.setNode(R36);
        rt36.setPath(r36);
        rt36.play();

        // Robot  37         
        Polyline r37 = new Polyline();
        for (int i = 0; i < size; i++) {
            r37.getPoints().add(new Double(graphData.get(36).get(i).getxAxis()));
            r37.getPoints().add(new Double(graphData.get(36).get(i).getyAxis()));
        }

        PathTransition rt37 = new PathTransition();
        rt37.setDuration(Duration.seconds(15));
        rt37.setNode(R37);
        rt37.setPath(r37);
        rt37.play();

        // Robot  38         
        Polyline r38 = new Polyline();
        for (int i = 0; i < size; i++) {
            r38.getPoints().add(new Double(graphData.get(37).get(i).getxAxis()));
            r38.getPoints().add(new Double(graphData.get(37).get(i).getyAxis()));
        }

        PathTransition rt38 = new PathTransition();
        rt38.setDuration(Duration.seconds(15));
        rt38.setNode(R38);
        rt38.setPath(r38);
        rt38.play();

        // Robot  39
        Polyline r39 = new Polyline();
        for (int i = 0; i < size; i++) {
            r39.getPoints().add(new Double(graphData.get(38).get(i).getxAxis()));
            r39.getPoints().add(new Double(graphData.get(38).get(i).getyAxis()));
        }
        PathTransition rt39 = new PathTransition();
        rt39.setDuration(Duration.seconds(15));
        rt39.setNode(R39);
        rt39.setPath(r39);
        rt39.play();

    }

}
