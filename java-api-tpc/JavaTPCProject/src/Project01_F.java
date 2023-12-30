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
		
		imageLabel = new JLabel("지도보기");
		JPanel clickPanel = new JPanel();
		JLabel addressLbl = new JLabel("주소입력");
		address = new JTextField(50);
		
		JButton button = new JButton("클릭");
		clickPanel.add(addressLbl);
		clickPanel.add(address);
		clickPanel.add(button);
		
		button.addActionListener(new NaverMap(this));
		
		JPanel mapPanel = new JPanel();
		mapPanel.setLayout(new GridLayout(4, 1));
		
		resAddress = new JLabel("도로명");
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
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
