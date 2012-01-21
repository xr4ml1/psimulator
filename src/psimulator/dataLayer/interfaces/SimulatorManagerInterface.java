package psimulator.dataLayer.interfaces;

import psimulator.dataLayer.Enums.SimulatorPlayerCommand;
import psimulator.dataLayer.Simulator.EventTableModel;
import psimulator.dataLayer.Simulator.SimulatorEvent;

/**
 *
 * @author Martin
 */
public interface SimulatorManagerInterface {

    public void addSimulatorEvent(SimulatorEvent simulatorEvent);
    public void deleteAllSimulatorEvents();
 
    public void pullTriggerTmp();
 
    // -------------------- SETTERS --------------------------
    public void setPlayerSpeed(int speed);
    
    public void setPlayerFunctionActivated(SimulatorPlayerCommand simulatorPlayerState);
    public void setConcreteRawSelected(int row);
    
    public void setRecordingActivated(boolean activated);
    public void setPlayingActivated(boolean activated);
    
    public void setPacketDetails(boolean activated);
    public void setNamesOfDevices(boolean activated);
    
    
    // -------------------- GETTERS --------------------------
    public EventTableModel getEventTableModel();
    public boolean isConnectedToServer();
    //
    public int getSimulatorPlayerSpeed();
    public boolean isRecording();
    public boolean isPlaying();
    public int getCurrentEventPosition();
    
}
