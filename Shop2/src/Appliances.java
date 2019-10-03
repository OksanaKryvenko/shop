
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
        System.out.println("��������������:\n");
        System.out.println("������: " + this.name);
        System.out.println("�����: " + this.volume + " �");
        System.out.println("����� �����������������: " + this.energy);
        System.out.println("���: " + this.type);
        System.out.println("������� ������ ��������������: " + this.power + " ���/���");
        System.out.println("������� ��������������: " + this.level);
        System.out.println("����: " + this.price + " ���.");
	}
	
	void washingMachinesCharacteristics() {
  		System.out.println();
        System.out.println("��������������:\n");
        System.out.println("������: " + this.name);
        System.out.println("�����: " + this.volume + " ��");
        System.out.println("����� �����������������: " + this.energy);
        System.out.println("�������� ������: " + this.speed);
        System.out.println("�����������������: " + this.power + " ���/�");
        System.out.println("����� ������: " + this.level);
        System.out.println("����: " + this.price + " ���.");
	}
	
	void microwavesCharacteristics() {
  		System.out.println();
        System.out.println("��������������:\n");
        System.out.println("������: " + this.name);
        System.out.println("�����: " + this.volume + " �");
        System.out.println("��������: " + this.power + " ��");
        System.out.println("����: " + this.price + " ���.");
	}
	
	void blendersCharacteristics() {
  		System.out.println();
        System.out.println("��������������:\n");
        System.out.println("������: " + this.name);
        System.out.println("�����: " + this.volume + " ��");
        System.out.println("���: " + this.type);
        System.out.println("��������: " + this.power + " ��");
        System.out.println("����: " + this.price + " ���.");
	}
}


