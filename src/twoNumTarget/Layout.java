package twoNumTarget;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Layout implements ActionListener {
	
	Button btnNums, btnTarget, btnFinder;
	JTextField txtTarget, txtArray;
	Label lblResult;
	private Finder find;  
	int[] nums;
	int target;
	
	public Layout(Finder find) {
		
		this.find = find;
	
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Target Finder");
	
		JPanel panel = new JPanel();
		panel.setLayout(null); 
		f.add(panel);
		
		Label title = new Label("Number Finder");
		title.setBounds(70,30,260,50);
		title.setBackground(Color.YELLOW);
		title.setAlignment(Label.CENTER);
		title.setFont(new Font("Serif",Font.ITALIC, 24));
		panel.add(title);
		
		Label lblNumSet = new Label("Number set:");
		lblNumSet.setBounds(70, 90, 100, 25);
		lblNumSet.setAlignment(Label.LEFT);
		lblNumSet.setFont(new Font("Serif",Font.PLAIN, 14));
		panel.add(lblNumSet);
		
		txtArray = new JTextField();
		txtArray.setFont(new Font("Serif", Font.BOLD, 18));
		txtArray.setHorizontalAlignment(JTextField.LEFT);
		txtArray.setBounds(70, 115, 200, 30);
		txtArray.setVisible(true);
		panel.add(txtArray);
		txtArray.setText(" ");
		
		btnNums = new Button("Numbers");
		btnNums.setBounds(280, 115, 60, 30);
		panel.add(btnNums);
		btnNums.addActionListener(this);
		
		Label lblTarget = new Label("Target Number:");
		lblTarget.setBounds(70, 145, 100, 25);
		lblTarget.setAlignment(Label.LEFT);
		lblTarget.setFont(new Font("Serif",Font.PLAIN, 14));
		panel.add(lblTarget);
		
		txtTarget = new JTextField();
		txtTarget.setFont(new Font("Serif", Font.BOLD, 18));
		txtTarget.setHorizontalAlignment(JTextField.CENTER);
		txtTarget.setBounds(70, 170, 50, 30);
		txtTarget.setVisible(true);
		panel.add(txtTarget);
		txtTarget.setText(" ");
		
		btnTarget = new Button("Target");
		btnTarget.setBounds(130, 170, 60, 30);
		panel.add(btnTarget);
		btnTarget.addActionListener(this);
		
		btnFinder = new Button("Find");
		btnFinder.setBounds(70, 220, 260, 40);
		panel.add(btnFinder);
		btnFinder.addActionListener(this);
		
		lblResult = new Label();
		lblResult.setBounds(70, 260, 270, 50);
		lblResult.setAlignment(Label.LEFT);
		lblResult.setFont(new Font("Serif",Font.PLAIN, 22));
		panel.add(lblResult);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == btnNums) {
			
			int random = (int)(Math.random() * 6 + 3);  // random number between 3 and 8
			nums = new int[random];
			for(int i = 0; i < nums.length; i++) {
				int x = (int)(Math.random() * 10 + 1);  // random number between 1 and 10
				nums[i] = x;
			}
			String numLine = "";
			for(int x : nums) {
				numLine = numLine + x + ", ";
			}
			numLine = numLine.substring(0, numLine.length()-2);  // delete last comma and space
			txtArray.setText(numLine);
		}
		
		if(event.getSource()== btnTarget) {
			target = (int)(Math.random() * 16 + 3);    // random number between 3 and 18
			txtTarget.setText(Integer.toString(target));			
		}
		
		if(event.getSource() == btnFinder) {
			
			boolean out;
			String text = "";
			
			if(find.search(nums,target)) {
				text = "The target can be reached";
			}else {
				text = "We cannot make that target";
			}
			lblResult.setText(text);
		}	
		
	}
}
