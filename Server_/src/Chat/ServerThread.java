/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import static Chat.Chat_Server.in;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author aatmin
 */
public class ServerThread extends Chat_Server 
{
    /*ObjectInputStream in;
    
    public ServerThread(ObjectInputStream in)
    {
        this.in=in;
    }
        
    public void run()
    {
        try
        {
                //in = new ObjectInputStream(s.getInputStream());
                Data data ;
                //String name = data.getName();
                //txt.append("New client " + name + " has been connected ...\n");
                while (true) 
                {
                    data = (Data) in.readObject();
                    
                    JFileChooser ch = new JFileChooser();
                    JFrame top = (JFrame) SwingUtilities.getWindowAncestor(a1);
                    int c = ch.showSaveDialog(top);
                    if (c == JFileChooser.APPROVE_OPTION) {
                    try {
                        FileOutputStream out = new FileOutputStream(ch.getSelectedFile());
                        out.write(data.getFile());
                        out.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(top, e, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    }
                    
                }
        }    
            catch(Exception ie)
            {
                System.out.println("socket close error");
            }
        }*/
}