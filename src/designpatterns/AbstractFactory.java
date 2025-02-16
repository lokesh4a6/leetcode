package designpatterns;

interface Engine {

	void name();
}

interface Model {

	void year();
}

class BmwEngine implements Engine {

	@Override
	public void name() {
		System.out.println(" bmw engine");
	}
}

class AudiEngine implements Engine {
	@Override
	public void name() {
		System.out.println("audi engine");
	}

}

class BmwModel implements Model {

	@Override
	public void year() {
		System.out.println("2015 bmw model");

	}

}

class AudiModel implements Model {

	@Override
	public void year() {
		System.out.println(" 2020 audi model");

	}

}

interface Car {

	Engine engine();

	Model model();
}

class KiaCar implements Car {

	@Override
	public Engine engine() {

		return new AudiEngine();
	}

	@Override
	public Model model() {
		return new BmwModel();
	}
}

class TataCar implements Car {

	@Override
	public Engine engine() {

		return new BmwEngine();
	}

	@Override
	public Model model() {

		return new AudiModel();
	}

}

public class AbstractFactory {

	public static void main(String[] args) {

		Car kiacar = new KiaCar();

		System.out.println("Kia car engine is ");
		kiacar.engine().name();
		System.out.println("Kia car model is ");
		kiacar.model().year();

	}
}
