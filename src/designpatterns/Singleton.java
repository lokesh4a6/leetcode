package designpatterns;


class SingletonClass {
	
	private static SingletonClass singletonClass;
	
	private SingletonClass() {
		
	}
	
	public static synchronized SingletonClass getInstance() {
		
		
		if(singletonClass == null) {
			singletonClass  = new SingletonClass();
		}
		
		return singletonClass;
		
	}	
}

public class Singleton {

	public static void main(String[] args) {
		
		var singletonClass1 = SingletonClass.getInstance();
		var singletonClass2 = SingletonClass.getInstance();
		
		if(singletonClass1.equals(singletonClass2)) {
			
			System.out.println("Created class is singleton");
		}
		
	}
}

