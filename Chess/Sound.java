import java.io.*;
import sun.audio.*;

/**
 * @author alvin alexander, devdaily.com.
 */
public class Sound
{
    public static void main(String[] args) 
    throws Exception
    {
        {
            // open the sound file as a Java input stream
            String sound = "E://Chess//sound.wav.wav";
            InputStream in = new FileInputStream(sound);

            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);

            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
        }
    }
}