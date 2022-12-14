public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filaName) {

        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. name : "+filaName);
        }
        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filaName);
        }
        else{
            System.out.println("Invalid media "+audioType+" format not supported");
        }
    }
}
