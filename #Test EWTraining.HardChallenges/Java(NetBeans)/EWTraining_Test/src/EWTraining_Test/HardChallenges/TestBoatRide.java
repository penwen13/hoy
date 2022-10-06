/*TASK RP.BoatRide Compute Boat Ride Statistics*/
package EWTraining_Test.HardChallenges;

import java.util.*;
import java.util.concurrent.*;
import java.time.*;
import TowaStandard.*;
import EWTraining.HardChallenges.BoatRide.*;

public /*static*/ final class TestBoatRide {

    //##################################################################################################################
    private TestBoatRide() {
        /*TO AVOID OBJECT CONSTRUCTION*/
    }
    //##################################################################################################################
    //------------------------------------------------------------------------------------------------------------------
    private static final String strPRJ_SEGMENT = "EWTraining.HardChallenges";
    private static final String strRELEVANT_PART = "BoatRide";

    //                                                      //DO NOT CHANGE
    private static final String strLOGS = "Logs " + Std.OO_TECHNOLOGY_INSTANCE + '(' + Std.OS + ')';
    //                                                      //Data a log should be in directories:
    private static final PathX syspathMY_DESKTOP = PathX.getDesktop();
    private static final PathX syspathTEST = syspathMY_DESKTOP.addName("#Test " + strPRJ_SEGMENT);
    private static final PathX syspathDATA = syspathTEST.addName("Data").addName(strRELEVANT_PART);
    private static final PathX syspathLOGS = syspathTEST.addName(strLOGS).addName(strRELEVANT_PART);

    //                                                      //PARAMETERS FOR COMPARATIVE AND ARTIFICIAL TIME
    private static T0maskTuple t0maskTEST = new T0maskTuple(
            new PathX[]{new PathX(syspathMY_DESKTOP.root()), syspathMY_DESKTOP, syspathLOGS});
    private static T0anowTuple t0anowTEST = new T0anowTuple(AllTest.ztimeNOW_BASE, AllTest.arrnumDELTA_SECONDS);

//----------------------------------------------------------------------------------------------------------------------
    public static void subTest() {
        /*Assign null for NORMAL test (NO artificial time & automathic verification)*/
        TestBoatRide.t0anowTEST = null;
        TestBoatRide.t0maskTEST = null;
        /**/
        //
        /*All Test (for specific test, copy above and open)*/
        TestBoatRide.subTestBoatRide1();
        /**/
    }

//----------------------------------------------------------------------------------------------------------------------
    private static void subTestBoatRide1() {
        final String strTEST = "BoatRide1";
        Test.initializeLog(syspathLOGS, strTEST, t0anowTEST, t0maskTEST);

        /*Test*/
        Test.log("");
        Test.log("##################### TEST ##########");

        /*1*/
        {
            LocalDate dateTest = LocalDate.of(2021, 1, 1);
            Queue<BeBoatEvent> queuebeTest = TestBoatRide.queuebeTest6Events();

            Test.resetLog();
            Test.log("");
            Test.log(Test.toLog(dateTest, "dateTest") + ", " + Test.toLog(queuebeTest, "queuebeTest"));

            Test.log("");
            Tools.subTodayOperation(queuebeTest, dateTest, TestBoatRide.syspathLOGS);
        }
        /**/
        //
        /*2*/
        {
            LocalDate dateTest = LocalDate.of(2021, 1, 2);
            Queue<BeBoatEvent> queuebeTest = TestBoatRide.queuebeTest8Events();

            Test.resetLog();
            Test.log("");
            Test.log(Test.toLog(dateTest, "dateTest") + ", " + Test.toLog(queuebeTest, "queuebeTest"));

            Test.log("");
            Tools.subTodayOperation(queuebeTest, dateTest, TestBoatRide.syspathLOGS);
        }
        /**/
        //
        /*3*/
        {
            LocalDate dateTest = LocalDate.of(2021, 1, 3);
            Queue<BeBoatEvent> queuebeTest = new ConcurrentLinkedDeque();

            Test.resetLog();
            Test.log("");
            Test.log(Test.toLog(dateTest, "dateTest") + ", " + Test.toLog(queuebeTest, "queuebeTest"));

            Test.log("");
            Tools.subTodayOperation(queuebeTest, dateTest, TestBoatRide.syspathLOGS);
        }
        /**/

        BclassAbstract.writeSummary();

        Test.finalizeLog();
    }

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    private static Queue<BeBoatEvent> queuebeTest6Events() {
        BeBoatEvent[] arrbe = new BeBoatEvent[]{
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(5, 0, 0)),
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(6, 0, 0)),
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(7, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(8, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(9, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(10, 0, 0)),};

        return Std.newQueue(arrbe);
    }

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    private static Queue<BeBoatEvent> queuebeTest8Events() {
        BeBoatEvent[] arrbe = new BeBoatEvent[]{
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(5, 0, 0)),
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(6, 0, 0)),
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(7, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(8, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(9, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(10, 0, 0)),
            new BeBoatEvent(DoraEventEnum.DEPARTURE, LocalTime.of(11, 0, 0)),
            new BeBoatEvent(DoraEventEnum.ARRIVAL, LocalTime.of(12, 0, 0)),};

        return Std.newQueue(arrbe);
    }

    //------------------------------------------------------------------------------------------------------------------
}

//======================================================================================================================
/*END-TASK*/
