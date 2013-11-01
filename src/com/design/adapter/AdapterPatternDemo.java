package com.design.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		
	AudioPlayer audio=new AudioPlayer();
	audio.play("mp3", "abc.mp3");
	audio.play("vlc", "ghi.vlc");
	audio.play("avi", "jkl.avi");
	audio.play("mp4", "def.mp4");
	}
}
