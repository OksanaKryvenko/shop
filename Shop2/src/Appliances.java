
public class Appliances extends Device {

	private double volume;
	private String energy;
	private String type;
	private int speed;
	private double power;
	private int price;
	private char level;
	private String name;

	public Appliances (String name, double volume, String energy, String type, int speed, double power,	char level, int price) {
		this.name = name;
		this.level = level;
		this.volume = volume;
		this.energy = energy;
		this.type = type;
		this.speed = speed;
		this.power = power;
		this.price = price;
	}
	
	void freezersCharacteristics() {
  		System.out.println();
        System.out.println("Характеристики:\n");
        System.out.println("Модель: " + this.name);
        System.out.println("Объём: " + this.volume + " л");
        System.out.println("Класс энергопотребления: " + this.energy);
        System.out.println("Тип: " + this.type);
        System.out.println("Годовой расход электроэнергии: " + this.power + " кВт/год");
        System.out.println("Система размораживания: " + this.level);
        System.out.println("Цена: " + this.price + " грн.");
	}
	
	void washingMachinesCharacteristics() {
  		System.out.println();
        System.out.println("Характеристики:\n");
        System.out.println("Модель: " + this.name);
        System.out.println("Объём: " + this.volume + " кг");
        System.out.println("Класс энергопотребления: " + this.energy);
        System.out.println("Скорость отжима: " + this.speed);
        System.out.println("Энергопотребление: " + this.power + " кВт/ч");
        System.out.println("Класс стирки: " + this.level);
        System.out.println("Цена: " + this.price + " грн.");
	}
	
	void microwavesCharacteristics() {
  		System.out.println();
        System.out.println("Характеристики:\n");
        System.out.println("Модель: " + this.name);
        System.out.println("Объём: " + this.volume + " л");
        System.out.println("Мощность: " + this.power + " Вт");
        System.out.println("Цена: " + this.price + " грн.");
	}
	
	void blendersCharacteristics() {
  		System.out.println();
        System.out.println("Характеристики:\n");
        System.out.println("Модель: " + this.name);
        System.out.println("Объём: " + this.volume + " мл");
        System.out.println("Тип: " + this.type);
        System.out.println("Мощность: " + this.power + " Вт");
        System.out.println("Цена: " + this.price + " грн.");
	}
}


