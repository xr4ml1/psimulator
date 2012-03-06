package psimulator.dataLayer;

import java.awt.Color;
import shared.SimulatorEvents.SerializedComponents.PacketType;

/**
 *
 * @author Martin Švihlík <svihlma1 at fit.cvut.cz>
 */
public class ColorMixerSingleton {

    //public static Color mainToolbarColor = new Color(198, 83, 83);
    public static Color mainToolbarColor = new Color(164, 194, 245);
    //public static Color editToolbarColor = new Color(213, 129, 129);
    public static Color editToolbarColor = Color.LIGHT_GRAY;
    public static Color drawPanelColor = Color.WHITE;
    
    private static ColorMixerSingleton colorMixerSignletonObject;

    /** A private Constructor prevents any other class from instantiating. */
    private ColorMixerSingleton () {
        //	 Optional Code
    }

    public static synchronized ColorMixerSingleton getSingletonObject() {
        if (colorMixerSignletonObject == null) {
            colorMixerSignletonObject = new ColorMixerSingleton();
        }
        return colorMixerSignletonObject;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    public static Color getColorAccodringToPacketType(PacketType packetType){
        switch(packetType){
            case TCP:
                return Color.GREEN;
            case UDP:
                return Color.BLUE;
            case ICMP:
                return Color.GRAY;
            case ARP:
                return Color.YELLOW;
            case GENERIC:
            default:
                return Color.PINK;
        }
    }
}
