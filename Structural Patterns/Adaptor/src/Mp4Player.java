public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String fileName) {
        //do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. name : "+fileName);
    }
}
