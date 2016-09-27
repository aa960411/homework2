import java.util.Scanner;

public class B05 {
	
		public static void main(String[] args){
			int year;
				int age;
					Scanner s = new Scanner(System.in);
						System.out.println("INPUT YOUR BIRTH  : ");
							year = s.nextInt();
								age = 2016 - year + 1;
									
										if (year < 7)
												System.out.println("BABY");
													else if (year <= 7 && year < 13)
															System.out.println("CHILD");
																else if (year >= 13 && year < 20)
																		System.out.println("YOUTH");
																			else if (year >= 20 && year < 30)
																					System.out.println("YOUNG MAN");
																						else if (year >= 30 && year < 60)
																								System.out.println("MIDDLE AGE");
																									else
																											System.out.println("OLD AGE");
																												

																													}
																													}

