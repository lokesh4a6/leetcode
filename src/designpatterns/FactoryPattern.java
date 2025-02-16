package designpatterns;

/** 

This is abstract pattern
here we implement some methods for abstract class and
leave extends class to implement some methods as per there needs
use parent class Reference to execute methods  

**/

abstract class  Parser{
	
	public void parser() {
		 readData();
		 processData();
		 writeData();

	}
	
	abstract void readData();
	abstract void processData();
	void writeData() {
		System.out.println("writting the code in the file ");
	}
}


class Xmlparser extends Parser{
	
	 void readData() {
		 System.out.println(" reading xml data");
		 
	 }
	 void processData() {
		 
		 System.out.println("processing the xml data");
		 
	 }
}

class JsonParser extends Parser{
	
	void readData() {
		System.out.println("reading the json data");
	}
	
	void processData()
	{
		System.out.println("processing json data");
	}
}


public class FactoryPattern {

	public static void main(String[] args) {
		

		Parser xmlParser = new Xmlparser();
		xmlParser.parser();
		
		Parser jsonParser = new JsonParser();
		jsonParser.parser();
		
		
	}
}
