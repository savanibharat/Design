package com.design.adapter;

public class AudioPlayer implements MediaPlayer{

	
	MediaAdapter mediaadapter;
	@Override
	public void play(String audiotype, String filename) {

		
		if(audiotype.equalsIgnoreCase("mp3"))
			System.out.println("playing mp3 file "+filename);
		else if(audiotype.equalsIgnoreCase("vlc") 
		         || audiotype.equalsIgnoreCase("mp4"))			{
			mediaadapter=new MediaAdapter(audiotype);
			mediaadapter.play(audiotype, filename);
			}
		else
		{
			System.out.println("invalid mdeia "+audiotype +"format not supported");
		}
	}
}
