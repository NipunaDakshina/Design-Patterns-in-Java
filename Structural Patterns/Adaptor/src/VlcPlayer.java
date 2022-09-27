public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. name :"+fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //do nothing
    }
}
