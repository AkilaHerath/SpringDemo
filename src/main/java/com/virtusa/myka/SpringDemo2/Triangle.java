package com.virtusa.myka.SpringDemo2;

public class Triangle implements Shape {
	
	// This part for Spring tutorial 06
	/*private String type;
	private int height;
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(int height, String type){
		this.height = height;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}*/
	
	/*public void setType(String type) {
		this.type = type;
	}
*/
	// This part for spring tutorial 07
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Drawing Triangle");
		System.out.println("PointA is:" + getPointA().getX() +", " + getPointA().getY());
		System.out.println("PointB is:" + getPointB().getX() +", " + getPointB().getY());
		System.out.println("PointC is:" + getPointC().getX() +", "+ getPointC().getY());
	}

}
