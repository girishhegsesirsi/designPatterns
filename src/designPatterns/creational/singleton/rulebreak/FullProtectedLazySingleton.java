package designPatterns.creational.singleton.rulebreak;



	import java.io.Serializable;

	public class FullProtectedLazySingleton extends MyClone implements Serializable {

		private static FullProtectedLazySingleton instance;

		private FullProtectedLazySingleton() {
			if (instance != null) {
				throw new IllegalStateException("object can't be create using reflection");
			}
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
		}

		protected Object readResolve() {
			return instance;
		}

		public static synchronized FullProtectedLazySingleton getInstance() {
			if (instance == null) {
				return instance = new FullProtectedLazySingleton();
			} else {
				return instance;
			}
		}

	
}
