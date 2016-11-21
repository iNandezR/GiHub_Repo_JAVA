import javax.swing.*;
import java.awt.event.*;

public class JavaMenus extends JFrame {

	public JavaMenus()
	{
		super("Java Menu Example");
		
		ClassLoader ldr = this.getClass().getClassLoader();
		
		java.net.URL screamURL = ldr.getResource("scream.png");
		java.net.URL bruceURL = ldr.getResource("bruceLee.png");

		ImageIcon scream = new ImageIcon( screamURL );
		ImageIcon bruce = new ImageIcon( bruceURL );
		
		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenuItem ItemNew = new JMenuItem("New");
		ItemNew.setMnemonic('N');
		file.add(ItemNew);
		JMenuItem ItemOpen = new JMenuItem("Open");
		ItemOpen.setMnemonic('O');
		file.add(ItemOpen);	
		JMenuItem ItemEdit = new JMenuItem("Edit");
		ItemEdit.setMnemonic('E');
		file.add(ItemEdit);
		JMenuItem ItemExit = new JMenuItem("Exit");
		ItemExit.setMnemonic('x');
		file.add(ItemExit);
		
		JMenu info = new JMenu("Info");
		file.setMnemonic('I');
		JMenuItem ItemWelcome = new JMenuItem("Welcome");
		ItemWelcome.setMnemonic('W');
		info.add(ItemWelcome);
		JMenuItem ItemAbout = new JMenuItem("About");
		ItemAbout.setMnemonic('A');
		info.add(ItemAbout);

		final JLabel label1 = new JLabel(" Welcome");
	     	add("South", label1);
	      	this.setSize(100, 100);
		setVisible(true);
		final JLabel label2 = new JLabel();
     		add("North", label2);
     		this.setSize(100, 100);
      	setVisible(true);
				
		ItemNew.addActionListener(
		 new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {
			label1.setIcon(null);
			label1.setText(null);
			label1.setText("<html> I’m not in this world to live up to your </br> expectations and you’re not in this world <br/> to live up to mine.<html>");
			label2.setIcon(bruce);
			 }
			}
		);
		ItemOpen.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
		    	label2.setText(null);
		    	label2.setIcon(null);
		    	label1.setIcon(scream);
		    	label1.setText(null);
		    }
		   }
		);

		ItemEdit.addActionListener(
				  new ActionListener(){
				    public void actionPerformed(ActionEvent e)
				    {
						JOptionPane.showMessageDialog(null, "User's Name", 
						   "Result", JOptionPane.PLAIN_MESSAGE);
				    }
				   }
				);
		
		ItemExit.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Exit");
			System.exit(0);
		    }
		  }
		);						
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(file);
		bar.add(info);
		
		getContentPane();
		setSize(250, 250);
		setVisible(true);
		
		
		ItemWelcome.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(null, "This Appliction does random things!!!");
					}
				}
			);
		
		ItemAbout.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(null, "Programmer: Ian Hernandez\nVersion: .01");
					}
				}
			);
	}

	
	public static void main(String[] args)
	{
		JavaMenus appMenu = new JavaMenus();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
