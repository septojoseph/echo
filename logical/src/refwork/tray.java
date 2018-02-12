package refwork;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class tray
{
	public static void main(String args[]) 
	{
		if(!SystemTray.isSupported())
		{
			System.out.println("system tray noot supported");
			return;
		}
		SystemTray systemtray=SystemTray.getSystemTray();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("D:/a.png");
		PopupMenu menu = new PopupMenu();
		MenuItem action = new MenuItem("Action");
		action.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Date date = new Date(0);
				JOptionPane.showMessageDialog(null, date+"Action menu item"+image);
				
			}
		});
		menu.add(action);
		MenuItem close = new MenuItem("Close");
		action.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
				
			}
		});
		
		menu.add(close);
		TrayIcon tryicon =new TrayIcon(image,"tray",menu);
		tryicon.setImageAutoSize(true);
		try
		{
			systemtray.add(tryicon);
		}
		catch(AWTException ex)
		{
			Logger.getLogger(tray.class.getName()).log(Level.SEVERE,null,ex);
		}
		
		
	}
	
}