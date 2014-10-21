package com.learnz.game.act;

public class GameLibJNIWrapper {
	
	static {
        System.loadLibrary("Game");
    }
 
    public static native void on_surface_created();
 
    public static native void on_surface_changed(int width, int height);
 
    public static native void on_draw_frame();

}
