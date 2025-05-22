
import java.util.Arrays;
import java.util.List;

public class FruitsMaker {
	private final List<String> fruitsList = Arrays.asList("バナナ","リンゴ","ミカン","モモ","ナシ");
	int num = 0;
	private static FruitsMaker singleton = new FruitsMaker();
	
	private FruitsMaker() {
		System.out.println("初期化");
	}
	
	public static FruitsMaker getInstance() {
		return singleton;
	}
	
	public synchronized String getNextFruits() {
		if(num >= fruitsList.size()){
			num = 0;
		}
		return fruitsList.get(num++);
		}
}
