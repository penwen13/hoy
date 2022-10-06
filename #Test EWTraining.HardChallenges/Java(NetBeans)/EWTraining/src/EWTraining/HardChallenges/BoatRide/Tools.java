/*TASK RP.BoatRide Compute Boat Ride Statistics*/
package EWTraining.HardChallenges.BoatRide;

import java.util.*;
import java.io.*;
import java.text.*;
import java.time.*;
import TowaStandard.*;

//                                                          //AUTHOR: Towa (GLG-Gerardo Lopez).
//                                                          //CO-AUTHOR: Towa (EW.Training).
//                                                          //DATE: February 4, 2021.
//
//======================================================================================================================
public /*static*/ final class Tools {

    //##################################################################################################################
    private Tools() {
        /*TO AVOID OBJECT CONSTRUCTION*/
    }

    //##################################################################################################################
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //To implement some tools.
    //
    //------------------------------------------------------------------------------------------------------------------
    /*CONSTANTS*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*INITIALIZER*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*METHODS*/
    //
    /*TASK BoatRide1*/
    //------------------------------------------------------------------------------------------------------------------
    public static void subTodayOperation(
            //                                              //Simulate today's operation.

            //                                              //This simulate all daily events, they are in sequence
            //                                              //      (.Peek is the earliest).
            //                                              //Quantity of Departures and Arrivels should be the same.
            Queue<BeBoatEvent> queuebeEvents_M,
            LocalDate date_I,
            //                                              //Folder to contain statistics
            PathX syspathStatistics_I
    ) {
        /*FUSE-BOX*/ {
            Test.abortIfNull(queuebeEvents_M, "queuebeEvents_M");
            Test.abortIfNull(date_I, "date_I");
            Test.abortIfNull(syspathStatistics_I, "syspathStatistics_I");
            if ( //
                    !syspathStatistics_I.isDirectory() //
                    ) {
                Test.abort(Test.toLog(syspathStatistics_I, "syspathStatistics_I") + " should a directory");
            }
        }
        /*END-FUSE-BOX*/

        //                                                  //Initialize accumulators
        int intRides = 0;
        int intCumulativeSecs = 0;

        /*WHILE-DO*/
        while ( //
                queuebeEvents_M.size() > 0 //
                ) {
            //                                              //To easy code
            BeBoatEvent be = queuebeEvents_M.peek();

            if ( //
                    be.dora == DoraEventEnum.DEPARTURE //
                    ) {
                intRides++;
                intCumulativeSecs = intCumulativeSecs - be.timeDepartsOrArrives.toSecondOfDay();
            } //
            else {
                //                                          //It's an arrival.

                //                                          //Ride lapse time = arrival - departure
                intCumulativeSecs = intCumulativeSecs + be.timeDepartsOrArrives.toSecondOfDay();
            }

            //                                              //Advance to next event on queue
            queuebeEvents_M.remove();
        }

        //                                                  //Compute and display statistics
        PathX syspath = syspathStatistics_I.addName(Std.toText(date_I) + ".txt");
        FileX sysfile = new FileX(syspath);
        PrintWriter systextwriter = TextWriterX.of(sysfile);

        //                                                  //To easy code
        double numAverageHrs = ((double) intCumulativeSecs / 3600) / intRides;

        //                                                  //Show up to date statistics (a log file)
        TextWriterX.writeLine(systextwriter, "");
        String str = MessageFormat.format("Total Rides: {0}, Average Time: {1}hs", Std.toText(intRides),
                Std.toText(numAverageHrs, "#,##0.0"));
        TextWriterX.writeLine(systextwriter, str);

        systextwriter.close();
    }

    //------------------------------------------------------------------------------------------------------------------
    /*END-TASK*/
    //
    //------------------------------------------------------------------------------------------------------------------
}

//======================================================================================================================
/*END-TASK*/
