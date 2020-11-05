package designDemo.D5_01;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("我能播放MP4"+filename);
    }
}
