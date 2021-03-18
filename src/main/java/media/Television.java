
package media;

public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = true;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public boolean setTurnOn(boolean newTurnOn) {
        this.turnOn = newTurnOn;
        return false;
    }

    public static void main(String[] args) {
    }
    
}
