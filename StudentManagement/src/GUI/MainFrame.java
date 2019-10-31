package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import Model.Student;
import Model.StudentList;

public class MainFrame {
	private JFrame jFrame;
	private JButton addbtn;
	private JButton delbtn;
	private JButton editbtn;
	private JButton searchbtn;
	private JLabel codelbl;
	private JLabel namelbl;
	private JLabel gradelbl;
	private JLabel birthdaylbl;
	private JLabel addresslbl;
	private JLabel notelbl;
	private JPanel bottomPanel;
	private JPanel centerPanel;
	private JTextField codefield;
	private JTextField namefield;
	private JTextField gradefield;
	private JTextField birthdayfield;
	private JTextField addressfield;
	private JTextField notefield;
	
	public MainFrame() {
		init();
	}
	
	public void init() {
		StudentList list = new StudentList();
		jFrame = new JFrame("Student Management");
		jFrame.setBounds(32, 100, 600, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new BorderLayout());
		jFrame.setDefaultLookAndFeelDecorated(true);
		
		codelbl = new JLabel("Student Code: ");
		codelbl.setPreferredSize(new Dimension(130, 20));
		namelbl = new JLabel("Name: ");
		namelbl.setPreferredSize(new Dimension(130, 20));
		gradelbl = new JLabel("Grade: ");
		gradelbl.setPreferredSize(new Dimension(130, 20));
		addresslbl = new JLabel("Address: ");
		addresslbl.setPreferredSize(new Dimension(130, 20));
		notelbl = new JLabel("Notes: ");
		notelbl.setPreferredSize(new Dimension(130, 20));
		birthdaylbl = new JLabel("Birthday: ");
		birthdaylbl.setPreferredSize(new Dimension(130, 20));
		
		codefield = new JTextField();
		codefield.setPreferredSize(new Dimension(300, 50));
		namefield = new JTextField();
		namefield.setPreferredSize(new Dimension(300, 50));
		gradefield = new JTextField();
		gradefield.setPreferredSize(new Dimension(300, 50));
		addressfield = new JTextField();
		addressfield.setPreferredSize(new Dimension(300, 50));
		notefield = new JTextField();
		notefield.setPreferredSize(new Dimension(300, 50));
		birthdayfield = new JTextField();
		birthdayfield.setPreferredSize(new Dimension(300, 50));
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridBagLayout());
		Border blackBorder = BorderFactory.createLineBorder(Color.black);
		TitledBorder border = BorderFactory.createTitledBorder(
								blackBorder, "Student's Information");
		centerPanel.setBorder(border);
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		centerPanel.add(codelbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		centerPanel.add(codefield, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		centerPanel.add(namelbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		centerPanel.add(namefield, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		centerPanel.add(gradelbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		centerPanel.add(gradefield, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		centerPanel.add(addresslbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		centerPanel.add(addressfield, gbc);
		gbc.gridx = 0;
		gbc.gridy = 4;
		centerPanel.add(notelbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		centerPanel.add(notefield, gbc);
		gbc.gridx = 0;
		gbc.gridy = 5;
		centerPanel.add(birthdaylbl, gbc);
		gbc.gridx = 1;
		gbc.gridy = 5;
		centerPanel.add(birthdayfield, gbc);
		
		bottomPanel = new JPanel();
		addbtn = new JButton("Add");
		addbtn.setPreferredSize(new Dimension(100, 30));
		editbtn = new JButton("Edit");
		editbtn.setPreferredSize(new Dimension(100, 30));
		delbtn = new JButton("Delete");
		delbtn.setPreferredSize(new Dimension(100, 30));
		searchbtn = new JButton("Search");
		searchbtn.setPreferredSize(new Dimension(100, 30));
		
		addbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int code = Integer.parseInt(codefield.getText());
				String name = namefield.getText();
				String address = addressfield.getText();
				String note = notefield.getText();
				double grade = Double.parseDouble(gradefield.getText());
				String birthday = birthdayfield.getText();
				list.addStudent(new Student(code, name, grade, address, note, birthday));
			}
		});
		
		bottomPanel.add(addbtn);
		bottomPanel.add(editbtn);
		bottomPanel.add(searchbtn);
		bottomPanel.add(delbtn);
		jFrame.getContentPane().add(bottomPanel, BorderLayout.PAGE_END);
		jFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame window = new MainFrame();
				window.jFrame.setVisible(true);
			}
		});
	}
}
