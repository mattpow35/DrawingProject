package drawing.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import drawing.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel appPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new DrawingPanel(baseController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Drawing");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setResizable(true);
	}
	
	

}
