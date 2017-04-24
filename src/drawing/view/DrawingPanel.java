package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import drawing.controller.DrawingController;

public class DrawingPanel extends JPanel 
{
	private SpringLayout baseLayout;
	private SpringLayout baseLayout_1;
	private DrawingController baseController;
	private JButton rectangleButton;
	private ShapePanel shapePanel;
	
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		shapePanel = new ShapePanel(baseController);
		rectangleButton = new JButton("Draw rectangles");
		baseLayout_1 = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout_1);
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(500, 500));
		
		this.add(rectangleButton);
		this.add(shapePanel);
	}
	
	private void setupLayout()
	{
		baseLayout_1.putConstraint(SpringLayout.NORTH, rectangleButton, 0, SpringLayout.NORTH, shapePanel);
		baseLayout_1.putConstraint(SpringLayout.WEST, rectangleButton, 10, SpringLayout.WEST, this);
		baseLayout_1.putConstraint(SpringLayout.WEST, shapePanel, 216, SpringLayout.WEST, this);
		baseLayout_1.putConstraint(SpringLayout.SOUTH, shapePanel, 490, SpringLayout.NORTH, this);
		baseLayout_1.putConstraint(SpringLayout.NORTH, shapePanel, 10, SpringLayout.NORTH, this);
		baseLayout_1.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}

}
