class Singleton
{
	private static Singleton instance;
	private Singleton(){}
	public static Singleton getInstance()
	{
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}
class SingletonDriver
{
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}
}