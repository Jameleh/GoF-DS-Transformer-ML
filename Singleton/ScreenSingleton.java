
import lancs.mobilemedia.core.ui.screens.SelectTypeOfMedia;
public class ScreenSingleton {
	private static ScreenSingleton instance;
	private String currentScreenName;
	private String currentStoreName = "My Photo Album";
	private SelectTypeOfMedia mainscreen;
	public SelectTypeOfMedia getMainMenu(){
		return mainscreen;
	}
	public void setMainMenu(SelectTypeOfMedia screen){
		mainscreen = screen;
	}
	private ScreenSingleton() {
	}
	public static ScreenSingleton getInstance() {
		if (instance == null) instance = new ScreenSingleton();
		return instance;
	}
	public void setCurrentScreenName(String currentScreenName) {
		this.currentScreenName = currentScreenName;
	}
	public String getCurrentScreenName() {
		return currentScreenName;
	}
	public void setCurrentStoreName(String currentStoreName) {
		this.currentStoreName = currentStoreName;
	}
	public String getCurrentStoreName() {
		return currentStoreName;
	}
}
