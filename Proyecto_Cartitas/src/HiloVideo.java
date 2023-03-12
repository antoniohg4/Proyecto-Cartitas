


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class HiloVideo extends javax.swing.JFrame implements Runnable{
    private Thread hilo = null;
    private Player player = null;

    public HiloVideo(){
      hilo = new Thread(this);
      hilo.start();
    }
    
    @Override
    public void run() {
        try {
            JFrame frame = new JFrame();
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            
            //File file = new File("/resources/vid/trailer.mp4");
            
            //System.out.println(file);
            
            //URL mediaURL = file.toURI().toURL();
            Player mediaPlayer = Manager.createRealizedPlayer(new URL("https://www.youtube.com/watch?v=wWv1j0ElUAQ"));
            
            Component video = mediaPlayer.getVisualComponent();
            Component controls = mediaPlayer.getControlPanelComponent();
            
            if (video != null) {
                frame.add(video, BorderLayout.CENTER);
            }
            if (controls != null) {
                frame.add(controls, BorderLayout.SOUTH);
            }
            
            frame.setSize(300, 300);
            frame.setVisible(true);
            
            
        } catch (IOException ex) {
            Logger.getLogger(HiloVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoPlayerException ex) {
            Logger.getLogger(HiloVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CannotRealizeException ex) {
            Logger.getLogger(HiloVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
