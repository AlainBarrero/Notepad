import javax.swing.*;

/**
 *A CLASS FOR CREATING ABOUT PANEL
 */
public class About extends JPanel{
	private static final long serialVersionUID = 1;
    public About(){
        //Create a Label & an image icon in it
        this.add(new JLabel(new ImageIcon(this.getClass().getResource("images/java.gif"))));

        //Create a Label & put a HTML script
        this.add(new JLabel("<html><li>JAVA Notepad</li><li><p>Ver# 2.0</li>"
                +"<li><p>Coded by: Salah Al-Thubaiti</li><li><p>KFUPM, CS</li><li>"
                +"<p>CopyRight (c) 2001-2002</li></html>"));
    }
}
