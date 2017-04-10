package com.tea.proxy.virtualproxy;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("unsplash pic Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> pics = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception{
		pics.put("a", "https://images.unsplash.com/photo-1485962398705-ef6a13c41e8f?dpr=1&auto=compress,format&fit=crop&w=1199&h=1799&q=80&cs=tinysrgb&crop=&bg=");
		pics.put("b", "https://images.unsplash.com/photo-1474436799594-1974f1add7ad?dpr=1&auto=compress,format&fit=crop&w=1199&h=829&q=80&cs=tinysrgb&crop=&bg=");
		pics.put("c", "https://images.unsplash.com/photo-1470338745628-171cf53de3a8?dpr=1&auto=compress,format&fit=crop&w=1199&h=1795&q=80&cs=tinysrgb&crop=&bg=");
		pics.put("d", "https://images.unsplash.com/photo-1478025101087-7f1ce4c83156?dpr=1&auto=compress,format&fit=crop&w=1199&h=799&q=80&cs=tinysrgb&crop=&bg=");
		pics.put("e","https://images.unsplash.com/photo-1436124026657-36828b43c7ce?dpr=1&auto=compress,format&fit=crop&w=1199&h=799&q=80&cs=tinysrgb&crop=&bg=");
		pics.put("f","https://images.unsplash.com/photo-1483119624769-b1a73c256500?dpr=1&auto=compress,format&fit=crop&w=991&h=665&q=80&cs=tinysrgb&crop=&bg=");

		URL initialURL = new URL((String) pics.get("b"));
		menuBar = new JMenuBar();
		menu = new JMenu("selection");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = pics.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				frame.repaint();
			});
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL((String) pics.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
