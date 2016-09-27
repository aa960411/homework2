import java.util.Scanner;
 
 public class B02 {
   
   	void temp()
		{
		        Scanner s = new Scanner(System.in);        
			        double t;
					System.out.println("INPUT TEMPERATURE:");
						t = s.nextDouble();
							System.out.println("CHOOSE ONE  C(press 0)   OR  F(press 1)  : ");
								int b = s.nextInt();	
									if ( b == 0 ) {
									        System.out.println(t);   
											  }
											  	else {
												        double tempera = 9/5.0*t + 32;
													        System.out.println(tempera);	
															  }

															  	}
																     
																         public static void main(String[] args) {
																	 		new B02().temp();
																				}
																				    }

