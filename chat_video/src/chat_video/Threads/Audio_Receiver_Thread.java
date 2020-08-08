/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_video.Threads;

import chat_video.Audio_Receiver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aatmin
 */
public class Audio_Receiver_Thread implements Runnable
{
    @Override
    public void run()
    {
        try {
            Audio_Receiver ar=new Audio_Receiver();
            ar.receive_audio();
        } catch (Exception ex) {
            Logger.getLogger(Audio_Receiver_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
