package com.design.adapter;

public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playmp4(String filename) {

	}

	@Override
	public void playvlc(String filename) {
		System.out.println("Playing vlc file name "+filename);
		
	}
	
	

}
