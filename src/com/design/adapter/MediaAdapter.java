package com.design.adapter;

public class MediaAdapter implements MediaPlayer {
	
	AdvanceMediaPlayer advancedMusicPlayer;
	   public MediaAdapter(String audioType){
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new VlcPlayer();			
	      }  if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }	
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playvlc(fileName);
	      }else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playmp4(fileName);
	      }
	   }
	
//	AdvanceMediaPlayer advancemediaplayer;
//	public MediaAdapter(String audiotype)
//	{
//		if(audiotype.equalsIgnoreCase("vlc")){
//			advancemediaplayer=new VlcPlayer();
//		if(audiotype.equalsIgnoreCase("mp4")){
//			advancemediaplayer=new Mp4Player();
//		}
//		}
//	}
//	@Override
//	public void play(String audiotype, String filename) {
//		if(audiotype.equalsIgnoreCase("vlc"))
//			advancemediaplayer.playvlc(filename);
//		else if(audiotype.equalsIgnoreCase("mp4"))
//			advancemediaplayer.playmp4(filename);
//		
//	}
}
