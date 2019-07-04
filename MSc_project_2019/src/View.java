import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class View extends JFrame {
	JPanel panel = new JPanel(new BorderLayout());
	JLabel imgPreview = new JLabel();
	String imgPath;
	ImageIcon image;

	public JLabel introMsg = new JLabel(
			"<html>Welcome to Image Analyzer Tool.<br>Press the browse button to start.<br><br><center>Image Preview</center></html>");
	public JPanel bottomBtns = new JPanel();
	public JButton browseBtn = new JButton("Browse");
	public JLabel status = new JLabel("Waiting");
	public JButton analyzeBtn = new JButton("Analyze");

	View() {

		// this is for the background

//		try {
//			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C://Users//user//git//MSc_Project_2019//MSc_project_2019//src//bgimg.jpg")))));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// initGUI
		// Window title
		this.setTitle("Image Analyzer Tool");
		// Exit on close
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		// Set the size of the window
		setSize(600, 600);
		setVisible(true);

		// intro msg
		introMsg.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		introMsg.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(null, 20));
		panel.add(introMsg, BorderLayout.NORTH);

		// img preview
		imgPreview.setText("Image Preview when selected.");
		imgPreview.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(imgPreview, BorderLayout.CENTER);

		// The panel
		validate();
		panel.setBackground(Color.WHITE);
		getContentPane().add(panel);

		// Bottom panel
		panel.add(bottomBtns, BorderLayout.SOUTH);
		bottomBtns.setBackground(Color.WHITE);
		bottomBtns.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		bottomBtns.add(browseBtn);

		status.setFont(new Font("Segoe UI", Font.BOLD, 14));
		status.setForeground(Color.ORANGE);
		bottomBtns.add(status);

		analyzeBtn.setEnabled(false);
		bottomBtns.add(analyzeBtn);
	}

	// function when you press the button
	void addMainViewListener(ActionListener listenImageButton) {
		browseBtn.addActionListener(listenImageButton);
	}

}
