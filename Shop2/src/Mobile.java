
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
        System.out.println("��������������:\n");
        System.out.println("������: " + this.name);
        System.out.println("��������� ������: " + this.screen + "\"");
        System.out.println("���������� ����: " + this.core);
        System.out.println("����������� ������: " + this.memory + " ��");
        System.out.println("������: " + this.camera + " ��");
        System.out.println("������������ �������: " + this.system);
        System.out.println("����: " + this.price + " ���.");
	}
}

