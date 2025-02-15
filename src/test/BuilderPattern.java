package test;


 class Laptop{
	
	private String brand;
	private Integer ram;
	private Integer storage;
	private double screensize;
	
	public Laptop(LaptopBuilder laptopbuilder) {
		
        this.brand = laptopbuilder.brand;
        this.ram = laptopbuilder.ram;
        this.storage = laptopbuilder.storage;
        this.screensize = laptopbuilder.screensize;
		
	}
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", storage=" + storage + ", screensize=" + screensize + "]";
	}
	
	public static class LaptopBuilder{
		
		public String brand;
		public Integer ram;
		public Integer storage;
		public double screensize;
		
		public LaptopBuilder(String brand) {
			this.brand = brand;
			
		}
		
		public LaptopBuilder setRam(Integer ram) {
			this.ram = ram;
			return this;
		}
		
		public LaptopBuilder setStorage(Integer storage) {
		this.storage = storage;
		return this;
		}
		
		public LaptopBuilder setScreensize(Double screensize) {
			this.screensize = screensize;
			return this;
		}
		
		public Laptop build() {
			return new Laptop(this);
	}
		
	}
	
}

public class BuilderPattern {

	public static void main(String[] args) {
		
		Laptop myLappy = new Laptop.LaptopBuilder("dell").setRam(256).setScreensize(15.6D).setStorage(1096).build();
		System.out.println(myLappy);
		
		
	}
}
