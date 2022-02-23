package designPatterns.creational.singleton;

public class LazzyInnerClassSingleton {
	private LazzyInnerClassSingleton() {

	}

	private static class SingletonHelper {
		private static final LazzyInnerClassSingleton instance = new LazzyInnerClassSingleton();
	}

	public static LazzyInnerClassSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
