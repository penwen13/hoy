/*TASK RP.BoatRide Compute Boat Ride Statistics*/
package EWTraining.HardChallenges.BoatRide;

import java.time.*;
import TowaStandard.*;

//                                                          //AUTHOR: Towa (GLG-Gerardo Lopez).
//                                                          //CO-AUTHOR: Towa (EW.Training).
//                                                          //DATE: February 5, 2021.
//
//======================================================================================================================
public final class BeBoatEvent extends BsysAbstract {

    //------------------------------------------------------------------------------------------------------------------
    /*CONSTANTS*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*INITIALIZER*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*INSTANCE VARIABLES*/
    //
    //                                                      //DEPART or ARRIVE
    public final DoraEventEnum dora;

    public final LocalTime timeDepartsOrArrives;

    //------------------------------------------------------------------------------------------------------------------
    /*COMPUTED VARIABLES*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*STANDARD METHODS TO SUPPORT TESTING AND DEBUGGING*/
    //
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toLogShort() {
        return "<" + Test.toLog(this.dora) + ", " + Test.toLog(this.timeDepartsOrArrives) + ">";
    }

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    @Override
    public String toLogFull() {
        return this.toLogShort();
    }

    //------------------------------------------------------------------------------------------------------------------
    /*OBJECT CONSTRUCTORS*/
    //
    //------------------------------------------------------------------------------------------------------------------
    public BeBoatEvent(
            DoraEventEnum dora_I,
            LocalTime timeDepartsOrArrives_I
    ) {
        super();

        /*FUSE-BOX*/ {
            Test.abortIfNull(dora_I, "dora_I");
            Test.abortIfNull(timeDepartsOrArrives_I, "timeDepartsOrArrives_I");
        }
        /*END-FUSE-BOX*/

        this.dora = dora_I;
        this.timeDepartsOrArrives = timeDepartsOrArrives_I;
    }

    //------------------------------------------------------------------------------------------------------------------
    /*TRANSFORMATION METHODS*/
    //
    //------------------------------------------------------------------------------------------------------------------
    /*ACCESS METHODS*/
    //
    //------------------------------------------------------------------------------------------------------------------
}

//======================================================================================================================
/*END-TASK*/
