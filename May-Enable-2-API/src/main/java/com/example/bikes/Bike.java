package com.example.bikes;

public class Bike {


		private int id;
		private String brand;
		private String colour;
		private String type;
		

		public Bike() {
			super();

		}

		public Bike(int id, String brand, String colour, String type) {
			super();
			this.id = id;
			this.brand = brand;
			this.colour = colour;
			this.type = type;

		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "Bike [id=" + id + ", brand=" + brand + ", colour=" + colour + ", type=" + type + "]";
		}
		
		
		
		
		
		
}
