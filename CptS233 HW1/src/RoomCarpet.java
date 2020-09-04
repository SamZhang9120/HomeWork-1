

public class RoomCarpet extends RoomDimension {

	RoomDimension size = new RoomDimension(this.getLength(),this.getWidth());
	private double CarpetCost ;
	
	public RoomCarpet() {
		super();
	}
	

	public RoomCarpet(double carpetCost) {
		super();
		CarpetCost = carpetCost;
	}
	
	public RoomCarpet(double length, double width, double carpetCost) {
		super(length, width);
		CarpetCost = carpetCost;
	}


	public double getCarpetCost() {
		return CarpetCost;
	}

	public void setCarpetCost(double carpetCostPer) {
		CarpetCost = carpetCostPer * size.getArea();
	}
	public double getTotalCost()	{
		double totalcost = CarpetCost *size.getArea();
		return totalcost;
	}
	

	@Override
	public String toString() {
		return "RoomCarpet [size=" + size.getArea() + ", CarpetCost=" + CarpetCost + "]";
	}
	
	
	
	


	}

