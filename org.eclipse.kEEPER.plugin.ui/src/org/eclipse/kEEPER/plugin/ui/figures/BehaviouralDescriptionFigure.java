package org.eclipse.kEEPER.plugin.ui.figures;



import java.util.ArrayList;


//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;

import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import model.BehaviouralDescription;
import model.Happens;
import model.HoldsAt;
import model.HoldsAtBetween;

import org.eclipse.draw2d.Graphics;



public class BehaviouralDescriptionFigure extends Shape{
		private int timeInstants;
		private RectangleFigure r;
		private BehaviouralDescription bd;
		
		private ArrayList<Happens> happensList = new ArrayList<Happens>();
		private ArrayList<HoldsAt> holdsAtList = new ArrayList<HoldsAt>();
		private ArrayList<HoldsAtBetween> holdsAtBetweenList = new ArrayList<HoldsAtBetween>();
		
		/*
		 * Constructor that set the number of time instants of the figure
		 */
		public BehaviouralDescriptionFigure(RectangleFigure r, BehaviouralDescription bd) {
			System.out.println("BehaviouralDescription Constructor!");
			this.r = r;
			this.bd = bd;
			// Input the number of time instants 
			if(bd.getTimeInstants() != 0){
				timeInstants = bd.getTimeInstants();
			}
		}
		
		@Override
	    protected void fillShape(Graphics graphics) {
	        graphics.pushState();       
	        graphics.setFillRule(SWT.FILL_WINDING);
	        graphics.popState();
	    }
		
		@Override
	    protected void outlineShape(Graphics graphics) {  

	        int mainWidth = r.getSize().width();
	        int mainHeight = r.getSize().height();
	        int mainX = r.getLocation().x;
	        int mainY = r.getLocation().y;
	        int length = mainWidth/(bd.getTimeInstants()+1);
	       
	        // Creating title of the behavioural description
	        graphics.setForegroundColor(new Color(null, 0, 0, 0));
	        graphics.setFont(new Font(null, "Arial", 15, 1));
	        if (bd.getName() != null){
        		Point label = new Point(mainX + 6, mainY + 10);
        		graphics.drawString(bd.getName(), label);
	        }
	       
	        // Creating main line
	        graphics.setForegroundColor(new Color(null, 129, 23, 45));
	        for (int i = -2; i < 3; i++){
	        	graphics.drawLine(mainX, mainY+mainHeight/2 +i, r.getLocation().x +r.getSize().width(), mainY+mainHeight/2 +i);
	        }
	        
	        // Creating small lines for the timeline
	        for (int i = 1; i <= bd.getTimeInstants(); i++){
	        	Point p1 = new Point(mainX+length*i, mainY+(mainHeight/2)-10);
	        	Point p2 = new Point(mainX+length*i, mainY+(mainHeight/2)+10);
	      
	        	graphics.drawLine(p1, p2);

	        }
	        graphics.setFont(new Font(null, "Arial", 10, 1));
	        if (!bd.getHappens().isEmpty()){
	        	for (int i = 0; i < bd.getHappens().size(); i++){
	        		graphics.setForegroundColor(new Color(null, 0, 0, 255));
	        		graphics.setBackgroundColor(new Color(null, 0, 0, 255));
	        		Point ovalStartingPoint = new Point(mainX + length*bd.getHappens().get(i).getTime() -3 , mainY + mainHeight/2 - 20);
	        		graphics.drawOval(ovalStartingPoint.x, ovalStartingPoint.y, 6, 6);
	        		Point label = new Point(mainX + length*bd.getHappens().get(i).getTime() -3 -10, mainY + mainHeight/2 - 20 - 10);
	        		graphics.drawString(bd.getHappens().get(i).getEvent().getName(), label);
	        	}
	        	
	        }
	        
	        if (!bd.getHoldsAts().isEmpty()){
		        for (int i = 0; i < bd.getHoldsAts().size(); i++){
		        	
		        	if (bd.getHoldsAts().get(i).isIsHolding())
		        		graphics.setForegroundColor(new Color(null, 50, 205, 50));
		        	else
		        		graphics.setForegroundColor(new Color(null, 255, 0, 0));
		        	
		        	Point ovalStartingPoint = new Point(mainX + length*bd.getHoldsAts().get(i).getTime() -3 , mainY + mainHeight/2 + 20);
		        	graphics.drawOval(ovalStartingPoint.x, ovalStartingPoint.y, 6, 6);
		        	Point label = new Point(mainX + length*bd.getHoldsAts().get(i).getTime() -3 -10, mainY + mainHeight/2 + 20 + 7);
	        		graphics.drawString(bd.getHoldsAts().get(i).getContextRelation().getName(), label);
		        }

	        }
	        
	        if (!bd.getHoldsAtBetweens().isEmpty()){
		        for (int i = 0; i < bd.getHoldsAtBetweens().size(); i++){
		        	
		        	if (bd.getHoldsAtBetweens().get(i).isIsHolding())
		        		graphics.setForegroundColor(new Color(null, 50, 205, 50));
		        	else
		        		graphics.setForegroundColor(new Color(null, 255, 0, 0));
		        	
		        	Point rectangleP1 = new Point(mainX + length*bd.getHoldsAtBetweens().get(i).getInitialTime() , mainY + mainHeight/2 + 40);
		        	Point rectangleP2 = new Point(mainX + length*bd.getHoldsAtBetweens().get(i).getInitialTime() , mainY + mainHeight/2 + 45);
		        	Point rectangleP3 = new Point(mainX + length*bd.getHoldsAtBetweens().get(i).getEndingTime() , mainY + mainHeight/2 + 45);
		        	Point rectangleP4 = new Point(mainX + length*bd.getHoldsAtBetweens().get(i).getEndingTime() , mainY + mainHeight/2 + 40);
		        	PointList points = new PointList();
		        	points.addPoint(rectangleP1);
		        	points.addPoint(rectangleP2);
		        	points.addPoint(rectangleP3);
		        	points.addPoint(rectangleP4);
		        	
		        	graphics.drawPolygon(points);
		        	Point label = new Point(mainX + length*bd.getHoldsAtBetweens().get(i).getInitialTime(), mainY + mainHeight/2 +45 + 7);
	        		graphics.drawString(bd.getHoldsAtBetweens().get(i).getContextRelation().getName(), label);
		        }
	        }   
	    } 

	    @Override
	    public void paintFigure(Graphics graphics) {
	        // TODO Auto-generated method stub
	        super.paintFigure(graphics);        
	    }
	    
	    public void setHappens(Happens newHappens){
	    	System.out.println("I'm in happens");
	    	happensList.add(newHappens);
	    }
	    
	    public void setHoldsAt(HoldsAt newHoldsAt){
	    	System.out.println("I'm in holdsat");
	    	holdsAtList.add(newHoldsAt);

	    }
	    
	    public void setHoldsAtBetween(HoldsAtBetween newHoldsAtBetween){
	    	System.out.println("I'm in holdsatbetween");
	    	holdsAtBetweenList.add(newHoldsAtBetween);

	    }
 
	    public int getTimeInstants(){
	    	return timeInstants;
	    }
	}