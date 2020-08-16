/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_video.Threads;

import chat_video.Video_Receiver;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aatmin
 */
public class Video_Receiver_Thread implements Runnable
{
    @Override
    public void run() 
    {
        try {
            Video_Receiver vr=new Video_Receiver();
            vr.receive_video();
        } catch (IOException ex) {
            Logger.getLogger(Video_Receiver_Thread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Video_Receiver_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
