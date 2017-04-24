package drawing.view;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import drawing.controller.DrawingController;

public class DrawingPanel extends JPanel 
{
	private SpringLayout baseLayout;
	private DrawingController baseController;
	
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
