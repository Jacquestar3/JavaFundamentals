package com.fundamentals.java;
/*
*This class demonstrates an Abstract Class
*
* */
public abstract class AbstractCellPhone  implements MyFirstInterface{
    /*
    * volume
    * screen
    * number key
    * send key
      * */
    private int volume;
    private int[] numberKeys;
    private int sendKey;
    private String screen;

    public AbstractCellPhone(int vol, int[] nKeys, int sKey, String screen) {
        this.volume = vol;
        this.numberKeys = nKeys;
        this.sendKey = sKey;
        this.screen = getScreen();
    }  // end Constructor


    public abstract void receiveCall();

    public abstract void sendCall();

    public abstract void endCall();

    public int getVolume() {
        return volume;
    }

    public int[] getNumberKeys() {
        return  numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }

    public String getScreen() {
        return screen;
    }
}


