import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {		
		
		Device device = new Device();
				
		Mobile[] phones = {new Mobile ("Apple iPhone 7", 4.7, 4, 2.0, 12, 13000, "iOS"),
				new Mobile ("Apple iPhone XS", 5.8, 6, 4.0, 24, 27450, "iOS"),
				new Mobile ("Samsung Galaxy A50", 6.4, 8, 4.0, 25, 8500, "Android"),
				new Mobile ("Samsung Galaxy S8", 5.8, 8, 4.0, 12, 16000, "Android"),
				new Mobile ("Samsung Galaxy S10", 5.8, 8, 6.0, 16, 23000, "Android"),
				new Mobile ("Xiaomi Redmi 6A", 5.45, 4, 2.0, 13, 2700, "Android"),
				new Mobile ("Xiaomi Redmi 7", 6.26, 8, 3.0, 12, 4800, "Android")};
		
		Mobile[] tabs = {new Mobile ("Samsung Tablet E", 9.6, 4, 1.5, 5, 4750, "Android"),
				new Mobile ("Samsung Tablet A", 10.1, 8, 2.0, 8, 6000, "Android"),
				new Mobile ("Apple iPad", 9.7, 4, 2, 8, 11200, "iOS"),
				new Mobile ("Lenovo Tablet 4", 10.1, 8, 4.0, 8, 8375, "Android")};
		
		Mobile[] notes = {new Mobile ("Apple MacBook Air", 13.3, 2, 8.0, 1, 22500, "Intel Core i5"),    	
				new Mobile ("Lenovo IdeaPad 330", 15.6, 2, 4.0, 1, 6000, "AMD Dual-Core A6-9225"),
				new Mobile ("HP Dark Ash 250", 15.6, 2, 8.0, 1, 12300, "Intel Core i3"),
				new Mobile ("HP Notebook 15", 15.6, 2, 4.0, 1, 6000, "AMD Dual-Core A4-9120")};
		
		Appliances[] freezers = {new Appliances ("Samsung RB-29", 311.0, "A+", "двухкамерный", 0, 272, '+', 12000),
				new Appliances ("LG GWB-509", 419.0, "A++", "двухкамерный", 0, 270.0, '+', 19000),
				new Appliances ("LG GAB-379", 312.0, "A+", "двухкамерный", 0, 263.0, '+', 14750),
				new Appliances ("Indesit NTS-14", 249.0, "A+", "двухкамерный", 0, 246.0, '-', 5850),
				new Appliances ("Indesit LI-8", 215.0, "A++", "двухкамерный", 0, 253.0, '+', 10300)};
		
		Appliances[] washingMachines = {new Appliances ("LG F2-J3", 6.5, "A+++", null, 1000, 0.68, 'A', 10000),
				new Appliances ("LG F4-J6", 8.0, "A+++", null, 1400, 0.66, 'A', 15000),
				new Appliances ("Indesit IW-SC", 6.0, "A+++", null, 1200, 0.78, 'A', 6700),
				new Appliances ("Indesit E2-SC", 5.0, "A++", null, 100, 0.847, 'A', 5700)};
		
		Appliances[] microwaves = {new Appliances ("Bosh FEM", 25, null, null, 0, 900.0, '\u0000', 7400),
				new Appliances ("Bosh HMT", 17, null, null, 0, 800.0, '\u0000', 3700),   	
				new Appliances ("Delfa AMW", 23, null, null, 0, 800.0, '\u0000', 2000)};
		
		Appliances[] blenders = {new Appliances ("Bosh MSM", 700, null, "погружной", 0, 600.0, '\u0000', 1000),
				new Appliances ("Bosh MMB", 1500, null, "стационарный", 0, 1000.0, '\u0000', 13000),
				new Appliances ("Moulinex DD", 400, null, "погружной", 0, 500.0, '\u0000', 13000)};
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Добро пожаловать в наш магазин бытовой техники и электроники!");
			String[] chart = new String[0];
			try {
				while (true) {
					System.out.println();
					System.out.println("В корзине:" + Arrays.asList(chart));
					device.catalog();
					int categories;
					categories = sc.nextInt();
					int mobiles = 0;
					int appliances = 0;
					int decision = 0;
					while (mobiles != 4 && appliances != 3 && decision != 3) {
						if (categories == 1) {
							device.mobiles();
							mobiles = sc.nextInt();
							int phone = 0;
							int tab = 0;
							int note = 0;
							while (mobiles != 4 && phone != 4 && tab != 4 && note != 4 && decision != 3) {
								if (mobiles == 1) {
									device.phones();
									phone = sc.nextInt();
									int applePhone = 0;
									int samsungPhone = 0;
									int xiaomiPhone = 0;
									while (phone != 4 && applePhone != 3 && samsungPhone != 4 && xiaomiPhone != 3 && decision != 3) {
										if (phone == 1) {
											decision = 0;
											device.applePhones();
											applePhone = sc.nextInt();						
											while (applePhone != 3 && decision != 2 && decision != 3) {
												if (applePhone == 1) {
													phones[0].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Apple iPhone 7";
															chart = tempChart;	
															System.out.println();
															System.out.println("Apple iPhone 7 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (applePhone == 2) {
													phones[1].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Apple iPhone XS";
															chart = tempChart;	
															System.out.println();
															System.out.println("Apple iPhone XS добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;												
												}
											}
										} else if (phone == 2) {
											decision = 0;
											device.samsungPhones();
											samsungPhone = sc.nextInt();						
											while (samsungPhone != 4 && decision != 2 && decision != 3) {
												if (samsungPhone == 1) {
													phones[2].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Samsung Galaxy A50";
															chart = tempChart;
															System.out.println();
															System.out.println("Samsung Galaxy A50 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (samsungPhone == 2) {
													phones[3].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Samsung Galaxy S8";
															chart = tempChart;	
															System.out.println();
															System.out.println("Samsung Galaxy S8 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (samsungPhone == 3) {
													phones[4].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Samsung Galaxy S10";
															chart = tempChart;	
															System.out.println();
															System.out.println("Samsung Galaxy S10 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (phone == 3) {
											decision = 0;
											device.xiaomiPhones();
											xiaomiPhone = sc.nextInt();						
											while (xiaomiPhone != 3 && decision != 2 && decision != 3) {
												if (xiaomiPhone == 1) {
													phones[5].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Xiaomi RedMi 6A";
															chart = tempChart;	
															System.out.println();
															System.out.println("Xiaomi RedMi 6A добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (xiaomiPhone == 2) {
													phones[6].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Xiaomi RedMi 7";
															chart = tempChart;	
															System.out.println();
															System.out.println("Xiaomi RedMi 7 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										}  else {
											System.out.println();
											System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
											break;
										}
									}
								} else if (mobiles == 2) {
									device.tablets();
									tab = sc.nextInt();
									int appleTab = 0;
									int samsungTab = 0;
									int lenovoTab = 0;
									while (tab != 4 && appleTab != 2 && samsungTab != 3 && lenovoTab != 2 && decision != 3) {
										if (tab == 1) {
											decision = 0;
											device.appleTabs();
											appleTab = sc.nextInt();						
											while (appleTab != 2 && decision != 2 && decision != 3) {
												if (appleTab == 1) {
													tabs[2].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Apple iPad";
															chart = tempChart;	
															System.out.println();
															System.out.println("Apple iPad добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (tab == 2) {
											decision = 0;
											device.samsungTabs();
											samsungTab = sc.nextInt();						
											while (samsungTab != 3 && decision != 2 && decision != 3) {
												if (samsungTab == 1) {
													tabs[0].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Samsung Tablet E";
															chart = tempChart;	
															System.out.println();
															System.out.println("Samsung Tablet E добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (samsungTab == 2) {
													tabs[1].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Samsung Tablet A";
															chart = tempChart;	
															System.out.println();
															System.out.println("Samsung Tablet A добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (tab == 3) {
											decision = 0;
											device.lenovoTabs();
											lenovoTab = sc.nextInt();						
											while (lenovoTab != 2 && decision != 2 && decision != 3) {
												if (lenovoTab == 1) {
													tabs[3].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Lenovo Tablet 4";
															chart = tempChart;	
															System.out.println();
															System.out.println("Lenovo Tablet 4 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;													
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else {
											System.out.println();
											System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
											break;
										}
									}
								} else if (mobiles == 3) {
									device.notebooks();
									note = sc.nextInt();
									int appleNote = 0;
									int lenovoNote = 0;
									int hpNote = 0;
									while (note != 4 && appleNote != 2 && lenovoNote != 2 && hpNote != 3 && decision != 3) {
										if (note == 1) {
											decision = 0;
											device.appleNotes();
											appleNote = sc.nextInt();						
											while (appleNote != 2 && decision != 2 && decision != 3) {
												if (appleNote == 1) {
													notes[0].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Apple MacBook Air";
															chart = tempChart;	
															System.out.println();
															System.out.println("Apple MacBook Air добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}	
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (note == 2) {
											decision = 0;
											device.lenovoNotes();
											lenovoNote = sc.nextInt();						
											while (lenovoNote != 2 && decision != 2 && decision != 3) {
												if (lenovoNote == 1) {
													notes[1].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "Lenovo IdeaPad 330";
															chart = tempChart;	
															System.out.println();
															System.out.println("Lenovo IdeaPad 330 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (note == 3) {
											decision = 0;
											device.hpNotes();
											hpNote = sc.nextInt();						
											while (hpNote != 3 && decision != 2 && decision != 3) {
												if (hpNote == 1) {
													notes[2].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "HP Dark Ash 250";
															chart = tempChart;	
															System.out.println();
															System.out.println("HP Dark Ash 250 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else if (hpNote == 2) {
													notes[3].mobileCharacteristics();
													device.decision();
													decision = sc.nextInt();
													while (decision > 0 && decision != 2 && decision != 3) {
														if (decision == 1) {
															String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
															tempChart[chart.length] = "HP Notebook 15";
															chart = tempChart;	
															System.out.println();
															System.out.println("HP Notebook 15 добавлен в корзину!");
															int continueShopping = 0;
															device.contunueShopping();
															continueShopping = sc.nextInt();
															while (decision != 3) {
																if (continueShopping == 1) {
																	decision = 3;
																} else if (continueShopping == 2) {
																	System.out.println();
																	System.out.println("В корзине:" + Arrays.asList(chart));
																	return;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;
																}
															}
														} else if (decision == 2) {
															decision = 2;
														} else if (decision == 3) {
															decision = 3;
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;												
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else {
											System.out.println();
											System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
											break;
										}
									}
								} else {
									System.out.println();
									System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
									break;
								}
							}
						} else if (categories == 2) {
							device.appliances();
							appliances = sc.nextInt();
							int large = 0;
							int small = 0;
							while (appliances != 3 && large != 3 && small != 3 && decision != 3) {
								if (appliances == 1) {
									device.large();
									large = sc.nextInt();
									int freezer = 0;
									int washingMachine = 0;
									while (large != 3 && freezer != 4 && washingMachine != 3 && decision != 3) {
										if (large == 1) {
											device.freezers();
											freezer = sc.nextInt();
											int samsungFreezer = 0;
											int lgFreezer = 0;
											int indesitFreezer = 0;
											while (freezer != 4 && samsungFreezer != 2 && lgFreezer != 3 && indesitFreezer != 3 && decision != 3) {
												if (freezer == 1) {
													decision = 0;
													device.samsungFreezers();
													samsungFreezer = sc.nextInt();																			
													while (samsungFreezer != 2 && decision != 2 && decision != 3) {
														if (samsungFreezer == 1) {
															freezers[0].freezersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Samsung RB-29";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Samsung RB-29 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}	
															}	
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}	
												} else if (freezer == 2) {
													decision = 0;
													device.lgFreezers();
													lgFreezer = sc.nextInt();								
													while (lgFreezer != 3 && decision != 2 && decision != 3) {
														if (lgFreezer == 1) {
															freezers[1].freezersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "LG GWB-509";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("LG GWB-509 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (lgFreezer == 2) {
															freezers[2].freezersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "LG GAB-379";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("LG GAB-379 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else if (freezer == 3) {
													decision = 0;
													device.indesitFreezers();
													indesitFreezer = sc.nextInt();								
													while (indesitFreezer != 3 && decision != 2 && decision != 3) {
														if (indesitFreezer == 1) {
															freezers[3].freezersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Indesit NTS-14";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Indesit NTS-14 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (indesitFreezer == 2) {
															freezers[4].freezersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Indesit LI-8";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Indesit LI-8 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (large == 2) {
											device.washingMachines();
											washingMachine = sc.nextInt();
											int lgWashingMachine = 0;
											int indesitWashingMachine = 0;
											while (washingMachine != 3 && lgWashingMachine != 3 && indesitWashingMachine != 3 && decision != 3) {
												if (washingMachine == 1) {
													decision = 0;
													device.lgWashingMachines();
													lgWashingMachine = sc.nextInt();								
													while (lgWashingMachine != 3 && decision != 2 && decision != 3) {
														if (lgWashingMachine == 1) {
															washingMachines[0].washingMachinesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "LG F2-J3";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("LG F2-J3 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (lgWashingMachine == 2) {
															washingMachines[1].washingMachinesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "LG F4-J6";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("LG F4-J6 добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else if (washingMachine == 2) {
													decision = 0;
													device.indesitWashingMachines();
													indesitWashingMachine = sc.nextInt();								
													while (indesitWashingMachine != 3 && decision != 2 && decision != 3) {
														if (indesitWashingMachine == 1) {
															washingMachines[2].washingMachinesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Indesit IW-SC";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Indesit IW-SC добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (indesitWashingMachine == 2) {
															washingMachines[3].washingMachinesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Indesit E2-SC";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Indesit E2-SC добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else {
											System.out.println();
											System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
											break;
										}
									}					
								} else if (appliances == 2) {
									device.small();
									small = sc.nextInt();
									int microwave = 0;
									int blender = 0;
									while (small != 3 && microwave != 3 && blender != 3 && decision != 3) {
										if (small == 1) {
											device.microwaves();
											microwave = sc.nextInt();
											int boshMicrowave = 0;
											int delfaMicrowave = 0;
											while (microwave != 3 && boshMicrowave != 3 && delfaMicrowave != 2 && decision != 3) {
												if (microwave == 1) {
													decision = 0;
													device.boshMicrowaves();
													boshMicrowave = sc.nextInt();																			
													while (boshMicrowave != 3 && decision != 2 && decision != 3) {
														if (boshMicrowave == 1) {
															microwaves[0].microwavesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Bosh FEM";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Bosh FEM добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (boshMicrowave == 2) {
															microwaves[1].microwavesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Bosh HMT";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Bosh HMT добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else if (microwave == 2) {
													decision = 0;
													device.delfaMicrowaves();
													delfaMicrowave = sc.nextInt();								
													while (delfaMicrowave != 2 && decision != 2 && decision != 3) {
														if (delfaMicrowave == 1) {
															microwaves[2].microwavesCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Delfa AMW";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Delfa AMW добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else if (small == 2) {
											device.blenders();
											blender = sc.nextInt();
											int boshBlender = 0;
											int moulinexBlender = 0;
											while (blender != 3 && boshBlender != 3 && moulinexBlender != 2 && decision != 3) {
												if (blender == 1) {
													decision = 0;
													device.boshBlenders();
													boshBlender = sc.nextInt();								
													while (boshBlender != 3 && decision != 2 && decision != 3) {
														if (boshBlender == 1) {
															blenders[0].blendersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Bosh MSM";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Bosh MSM добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else if (boshBlender == 2) {
															blenders[1].blendersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Bosh MMB";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Bosh MMB добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}	
												} else if (blender == 2) {
													decision = 0;
													device.moulinexBlenders();
													moulinexBlender = sc.nextInt();								
													while (moulinexBlender != 2 && decision != 2 && decision != 3) {
														if (moulinexBlender == 1) {
															blenders[2].blendersCharacteristics();
															device.decision();
															decision = sc.nextInt();
															while (decision > 0 && decision != 2 && decision != 3) {
																if (decision == 1) {
																	String[] tempChart = Arrays.copyOf(chart, chart.length + 1);
																	tempChart[chart.length] = "Moulinex DD";
																	chart = tempChart;	
																	System.out.println();
																	System.out.println("Moulinex DD добавлен в корзину!");
																	int continueShopping = 0;
																	device.contunueShopping();
																	continueShopping = sc.nextInt();
																	while (decision != 3) {
																		if (continueShopping == 1) {
																			decision = 3;
																		} else if (continueShopping == 2) {
																			System.out.println();
																			System.out.println("В корзине:" + Arrays.asList(chart));
																			return;
																		} else {
																			System.out.println();
																			System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																			break;
																		}
																	}
																} else if (decision == 2) {
																	decision = 2;
																} else if (decision == 3) {
																	decision = 3;
																} else {
																	System.out.println();
																	System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
																	break;												
																}
															}
														} else {
															System.out.println();
															System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
															break;
														}
													}
												} else {
													System.out.println();
													System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
													break;
												}
											}
										} else {
											System.out.println();
											System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
											break;
										}
									}
								} else {
									System.out.println();
									System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
									break;
								}
							}
						} else {
							System.out.println();
							System.out.println("Кажется, что-то пошло не так! Попробуйте ещё раз.");
							break;
						}
					} 
				} 
			}
			catch (InputMismatchException e) {
				System.out.println();
				System.out.println("Кажется, что-то пошло не так! Перезапустите программу и попробуйте снова.");
			}
		}
	} 
}