package prototype;

public class MainWorkPrototype {

    public static void main(String[] args) {
    	
    	int armNum = 2;
    	int armLong = 80;
    	int legNum = 2;
    	int legLong = 113;
    	String skinColor = "white";
    	String headType = "oval";
    	
    	Person basicPerson = new Person(armNum, armLong, legNum, legLong, skinColor, headType);
    	// yukaridaki kisim default olan nesne uretimidir. Asagida ise person1 ile tekaradan kacindik. farklılıklari ise SET ile yapiyoruz.
    	
    	
    	Person person1 = (Person) basicPerson.clone(); // clone ile basicPerson birebir alınmis oldu.
    	person1.setArmNum(1); // person1 'in basicPerson'dan farklılıklari set edilir.
    	
    	
    	// bilgi basmak icin    	
    	System.out.println(basicPerson.toString());
    	System.out.println(person1.toString());
    	
    }
    
}
