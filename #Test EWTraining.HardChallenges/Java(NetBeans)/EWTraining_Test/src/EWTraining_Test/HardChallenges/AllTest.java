/*TASK RP.(Test)HardChallenges*/
package EWTraining_Test.HardChallenges;

import java.util.*;
import java.time.*;
import TowaStandard.*;

//                                                          //AUTHOR: Towa (GLG-Gerardo Lopez).
//                                                          //CO-AUTHOR: Towa (EW.Training).
//                                                          //DATE: February 4, 2021.
//======================================================================================================================
public /*static*/ final class AllTest {

    //##################################################################################################################
    private AllTest() {
        /*TO AVOID OBJECT CONSTRUCTION*/
    }
    //##################################################################################################################
    //------------------------------------------------------------------------------------------------------------------
    /*CONSTANTS*/
    //
    /*[Glg,Feb13,2021] ZonedTime is not yet implemented in Java
    //                                                      //First ztimeNow (for masking time).
    //                                                      //Zoned time, internally is handled in milliseconds
    public static final ZonedTime ztimeNOW_BASE = new ZonedTime(new Date(2055, 3, 31),  new Time(0, 0, 0), 0,
        TimeZoneX.Here());
    */
    //                                                      //First ztimeNow (for masking time)
    public static final ZonedDateTime ztimeNOW_BASE = ZonedDateTime.of(2055, 3, 31, 2, 0, 0, 0, TimeZoneX.here());
    //                                                      //Deltas for dtNow
    public static final double[] arrnumDELTA_SECONDS = {3600, 3600 * 2, 3600 * 3, 3600 * 4};

    //------------------------------------------------------------------------------------------------------------------
    public static void subAllTest() {
        /*All Test*/
        TestAxStandard.subTest();
        TestBoatRide.subTest();
        /**/
    }

    //------------------------------------------------------------------------------------------------------------------
}

//======================================================================================================================
/*END-TASK*/
