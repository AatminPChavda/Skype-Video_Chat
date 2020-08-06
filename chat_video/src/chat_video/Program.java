/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_video;

/**
 *
 * @author aatmin
 */
import java.io.DataOutputStream;
import java.net.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

public class Program
{
    public final static String SERVER = JOptionPane.showInputDialog("Please enter server ip");
    public static void main(String[] args) throws Exception
    {
        AudioFormat af = new AudioFormat(8000.0f,8,1,true,false);
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, af);
        TargetDataLine microphone = (TargetDataLine)AudioSystem.getLine(info);
        microphone.open(af);
        Socket conn = new Socket(SERVER,3000);
        microphone.start();
        DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
        int bytesRead = 0;
        byte[] soundData = new byte[1];
        Thread inThread = new Thread(new SoundReceiver(conn));
        inThread.start();
        while(bytesRead != -1)
        {
            bytesRead = microphone.read(soundData, 0, soundData.length);
            if(bytesRead >= 0)
            {
                dos.write(soundData, 0, bytesRead);
            }
        }
        System.out.println("IT IS DONE.");
    }
}
