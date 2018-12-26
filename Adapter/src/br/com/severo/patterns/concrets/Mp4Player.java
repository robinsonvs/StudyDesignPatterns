package br.com.severo.patterns.concrets;

import br.com.severo.patterns.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}
