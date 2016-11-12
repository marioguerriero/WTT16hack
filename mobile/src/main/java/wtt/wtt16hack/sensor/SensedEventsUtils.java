package wtt.wtt16hack.sensor;

/**
 * Created by mario on 12/11/16.
 */

/**
 * A collection of static methods used to perform checks
 * on user events (fall, heart attack, etc)
 */
public class SensedEventsUtils {


    /**
     * Detect whether the user has fallen or not
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static boolean hasFallen(float x, float y, float z) {
        RealAccelData realAccelData = RealAccelData.getInstance();
        realAccelData.onSensorChanged(x, y, z);
        return realAccelData.getState() == RealAccelData.State.FALLEN;
    }

}
