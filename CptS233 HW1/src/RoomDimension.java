
	  public class RoomDimension {
		 private double Length = 0;
		private double Width = 0;
		   
	
		
		public double getLength() {
			return Length;
		}


		public void setLength(double length) {
			Length = length;
		}


		public double getWidth() {
			return Width;
		}


		public void setWidth(double width) {
			Width = width;
		}


		public String DimensionString() {
			return "RoomDimension [Length=" + Length + ", width=" + Width + "]";
		}


		public RoomDimension() {
			super();
		}
		
		
		public RoomDimension(double length, double width) {
			super();
			setLength(length);
			setWidth(width);
		}


		public double getArea()	{
			double Area = Length * Width;
			return Area;
		}

	}

