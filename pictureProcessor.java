import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*************************************************************************
    > File Name: pictureProcessor.java
    > Author: william
    > Mail: williamjwking@gmail.com
*/

public class pictureProcessor {
    private static void showGUI() {
        JFrame frame = new JFrame("helloworld");
        frame.setDefaultClosesOperation(JFrame.EXIT_ON_CLOSE);
        Container ct = frame.getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(JTextField);
        show.setContent("SHOW THE IMAGE");
        ct.add(show);
        ct.add(panel);
        
        frame.pack();
        frame.setVisible(true);
    }

    public class ImagePanel extends JPanel{
        private Image image;
        public ImagePanel(Image img){
            this.image = img;
            Dimension dime = new Dimension(image.getWidth(null),image.getHeight(null));
            this.setPreferredSize(dime);
            this.setMaximumSize(dime);
            this.setMinimumSize(dime);
            this.setSize(dime);
            this.setLayout(null);
        }
         
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(image, 0,0,null);
        }
    }

    public static void main(String[] args) {
    	Runnable tr = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				showGUI();
			}
		};
		javax.swing.SwingUtilities.invokeLater();
    }
    
    private JTextField path = new JTextField();
    private Button show = new Button();
    private Image img = new Image();
    private ImagePanel panel = new ImagePanel(img);
    
}

