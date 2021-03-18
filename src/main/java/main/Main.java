
package main;

import media.Television;

import media.Radio;

public class Main {

    public static void main(String[] args) {
        
        Television rts = new Television(1, 2, false);
        rts.printAttribues();
        
        Radio bg = new Radio(92.5, 700, 'A', 'F');
        bg.printAttributes();
    }
    
}
