/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_video.Threads;

import chat_video.Video_Sender;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aatmin
 */
public class Video_Sender_Thread implements Runnable
{
    @Override
    public void run()
    {
        try {
            Video_Sender vs= new Video_Sender();
            vs.send_video();
        } catch (IOException ex) {
            Logger.getLogger(Video_Sender_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
