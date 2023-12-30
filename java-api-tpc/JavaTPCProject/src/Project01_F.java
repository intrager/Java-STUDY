import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project01_F {
	JTextField address;
	JLabel resAddress, resX, resY, jibunAddress, imageLabel;
		
	public void initGUI() {
		JFrame mapView = new JFrame("Map View");
		mapView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container paneContainer = mapView.getContentPane();
		
		imageLabel = new JLabel("��������");
		JPanel clickPanel = new JPanel();
		JLabel addressLbl = new JLabel("�ּ��Է�");
		address = new JTextField(50);
		
		JButton button = new JButton("Ŭ��");
		clickPanel.add(addressLbl);
		clickPanel.add(address);
		clickPanel.add(button);
		
		button.addActionListener(new NaverMap(this));
		
		JPanel mapPanel = new JPanel();
		mapPanel.setLayout(new GridLayout(4, 1));
		
		resAddress = new JLabel("���θ�");
		jibunAddress = new JLabel("�����ּ�");
		resX = new JLabel("�浵");
		resY = new JLabel("����");
		mapPanel.add(resAddress);
		mapPanel.add(jibunAddress);
		mapPanel.add(resX);
		mapPanel.add(resY);
		
		paneContainer.add(BorderLayout.NORTH, clickPanel);
		paneContainer.add(BorderLayout.CENTER, imageLabel);
		paneContainer.add(BorderLayout.SOUTH, mapPanel);
		mapView.setSize(730, 660);
		mapView.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Project01_F().initGUI();
	}
}
