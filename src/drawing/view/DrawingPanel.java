package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.*;
import drawing.controller.DrawingController;
import java.awt.event.ActionEvent;

public class DrawingPanel extends JPanel 
{
	private SpringLayout baseLayout;
	private SpringLayout baseLayout_1;
	private DrawingController baseController;
	private JButton rectangleButton;
	private JButton circleButton;
	private JButton ellipsesButton;
	private JButton triangleButton;
	private JButton polygonButton;
	private JButton resetButton;
	private ShapePanel shapePanel;
	private JButton saveButton;
	private GraphPanel graphPanel;
	private JButton randomArrayButton;
	private JButton sortArrayButton;
	
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		shapePanel = new ShapePanel(baseController);
		rectangleButton = new JButton("Draw rectangles");
		baseLayout_1 = new SpringLayout();
		circleButton = new JButton("Draw Cirlces");
		ellipsesButton = new JButton("Draw Ellipses");
		triangleButton = new JButton("Draw Triangles");
		polygonButton = new JButton("Draw Polygons");
		resetButton = new JButton("Reset Panel");
		saveButton = new JButton("Save");
		graphPanel = new GraphPanel(setupArray());
		randomArrayButton = new JButton("Randomized Array");
		sortArrayButton = new JButton("Sort the Array");
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private int [] setupArray()
	{
		int length = (int) (Math.random() * 10) + 3;
		int [] randomArray = new int[length];
		for(int index = 0; index < length; index ++)
		{
			randomArray [index] = (int) (Math.random() * 50) + 3;
		}
		return randomArray;
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout_1);
		this.setBackground(Color.GRAY);
		this.setMinimumSize(new Dimension(600, 600));
		
		this.add(rectangleButton);
		this.add(circleButton);
		this.add(ellipsesButton);
		this.add(triangleButton);
		this.add(polygonButton);
		this.add(shapePanel);
		this.add(resetButton);
		this.add(saveButton);
		this.add(graphPanel);
		this.add(randomArrayButton);
		this.add(sortArrayButton);
		
	}	
	private void setupLayout()
	{
		baseLayout_1.putConstraint(SpringLayout.NORTH, shapePanel, 10, SpringLayout.NORTH, this);
		baseLayout_1.putConstraint(SpringLayout.NORTH, rectangleButton, 45, SpringLayout.NORTH, this);
		baseLayout_1.putConstraint(SpringLayout.WEST, rectangleButton, 7, SpringLayout.WEST, this);
		baseLayout_1.putConstraint(SpringLayout.NORTH, resetButton, 6, SpringLayout.SOUTH, polygonButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, polygonButton, 6, SpringLayout.SOUTH, ellipsesButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, polygonButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, triangleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.SOUTH, triangleButton, -6, SpringLayout.NORTH, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, ellipsesButton, 6, SpringLayout.SOUTH, circleButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, ellipsesButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, circleButton, 6, SpringLayout.SOUTH, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, circleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, resetButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, sortArrayButton, 14, SpringLayout.SOUTH, randomArrayButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, sortArrayButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, graphPanel, 0, SpringLayout.NORTH, randomArrayButton);
		baseLayout_1.putConstraint(SpringLayout.NORTH, randomArrayButton, 12, SpringLayout.SOUTH, saveButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, randomArrayButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout_1.putConstraint(SpringLayout.WEST, shapePanel, 0, SpringLayout.WEST, graphPanel);
		baseLayout_1.putConstraint(SpringLayout.WEST, graphPanel, 74, SpringLayout.EAST, resetButton);
		baseLayout_1.putConstraint(SpringLayout.SOUTH, graphPanel, -25, SpringLayout.SOUTH, this);
		baseLayout_1.putConstraint(SpringLayout.EAST, graphPanel, -10, SpringLayout.EAST, this);
		baseLayout_1.putConstraint(SpringLayout.SOUTH, shapePanel, 0, SpringLayout.SOUTH, saveButton);
		baseLayout_1.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
		
		
		
	}
	
	private void setupListeners()
	{
		rectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangles();
			}
		});
		
		circleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircles();
			}
		});
		
		polygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygons();
			}
		});
		
		ellipsesButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipses();
			}
		});
		
		triangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangles();
			}
		});
		
		resetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.reset();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.savePanel();
			}
		});
	}
	
	

}
