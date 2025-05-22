// This class represents a lazy-initialized singleton design pattern.
public class LazyInitializedSingleton {
    // Private static variable to hold the singleton instance
    private static LazyInitializedSingleton instance;

    // Private constructor to prevent instantiation from outside the class
    private LazyInitializedSingleton(){}

    // Static method to get the singleton instance
    public static LazyInitializedSingleton getInstance() {
        // Check if instance is null and instantiate if it is
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        // Return the singleton instance
        return instance;
    }
}