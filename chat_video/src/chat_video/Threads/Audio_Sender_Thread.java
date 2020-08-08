/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_video.Threads;

import chat_video.Audio_Sender;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aatmin
 */
public class Audio_Sender_Thread implements Runnable
{
    @Override
    public void run()
    {
        
        try {
            Audio_Sender as= new Audio_Sender();
            as.send_audio();
        } catch (Exception ex) {
            Logger.getLogger(Audio_Sender_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
