package designDemo.D5_01;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("我能播放Vlc"+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
