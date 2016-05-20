package javasound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JavaSoundPlay {
	private boolean released = false;
	private Clip clip = null;
	private FloatControl volumeC = null;
	private boolean playing = false;
	
	public JavaSoundPlay(File f) {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(f);
			clip = AudioSystem.getClip();
			clip.open(stream);
			clip.addLineListener(new Listener());
			volumeC = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
			released = true;
		} catch(IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
			exc.printStackTrace();
			released = false;
		}
	}

	//true если звук успешно загружен, false если произошла ошибка
	public boolean isReleased() {
		return released;
	}
	
	//проигрывается ли звук в данный момент
	public boolean isPlaying() {
		return playing;
	}

	//Запуск
	/*
	  breakOld определяет поведение, если звук уже играется
	  Если reakOld==true, то звук будет прерван и запущен заново
	  Иначе ничего не произойдёт
	*/
	public void play(boolean breakOld) {
		if (released) {
			if (breakOld) {
				clip.stop();
				clip.setFramePosition(0);
				clip.start();
				playing = true;
			} else if (!isPlaying()) {
				clip.setFramePosition(0);
				clip.start();
				playing = true;
			}
		}
	}
	
	//То же самое, что и play(true)
	public void play() {
		play(true);
	}
	
	//Останавливает воспроизведение
	public void stop() {
		if (playing) {
			clip.stop();
		}
	}


	//Дожидается окончания проигрывания звука
	public void join() {
		if (!released) return;
		synchronized(clip) {
			try {
				while (playing) clip.wait();
			} catch (InterruptedException exc) {}
		}
	}
	
	//Статический метод, для удобства
	public static JavaSoundPlay playSound(String s) {
		File f = new File(s);
		JavaSoundPlay snd = new JavaSoundPlay(f);
		snd.play();
		return snd;
	}

	private class Listener implements LineListener {
		public void update(LineEvent ev) {
			if (ev.getType() == LineEvent.Type.STOP) {
				playing = false;
				synchronized(clip) {
					clip.notify();
				}
			}
		}
	}
public static void main(String args[]){
    String fileName = new String("e:\\audio1.wav");
    System.out.println("Playing - " + fileName);
    JavaSoundPlay.playSound(fileName).join();
}
}






