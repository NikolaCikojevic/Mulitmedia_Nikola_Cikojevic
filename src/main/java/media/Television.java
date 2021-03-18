
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
    
    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }
    
     public void printAttribues() {
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Current program: " + this.getCurrentProgram());
        System.out.println("Turn on/of: " + this.getTurnOn());
    }
}
