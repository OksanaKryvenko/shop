
public class Mobile extends Device {
	private double screen;
	private int core;
	private double memory;
	private int camera;
	private int price;
	private String name;
	private String system;

	public Mobile (String name, double screen, int core, double memory, int camera, int price, String system) {
		this.name = name;
		this.screen = screen;
		this.core = core;
		this.memory = memory;
		this.camera = camera;
		this.price = price;
		this.system = system;
		
	}
	void mobileCharacteristics() {
  		System.out.println();
        System.out.println("Характеристики:\n");
        System.out.println("Модель: " + this.name);
        System.out.println("Диагональ экрана: " + this.screen + "\"");
        System.out.println("Количество ядер: " + this.core);
        System.out.println("Оперативная память: " + this.memory + " Гб");
        System.out.println("Камера: " + this.camera + " Мп");
        System.out.println("Операционная система: " + this.system);
        System.out.println("Цена: " + this.price + " грн.");
	}
}

