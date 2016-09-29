import java.util.*;
  import java.io.*;
   class B04{
            public void input(){
	                     Scanner s = new Scanner(System.in);
			                      System.out.print("Kor Grade:"); 
					                       int kor = s.nextInt();
							                        System.out.print("Eng Grade:");
										                 int eng = s.nextInt();
												                  System.out.print("Math Grade:");
														                   int math = s.nextInt();
																                   int total = kor+eng+math;
																		                    double avg = (double)total/3;
																				                    System.out.println("Total :  "+total );
																						                    System.out.println("Avg is "+avg );         
																								             
																									     		if (kor > 90) {
																														System.out.println("Korea Score is good");
																																		}
																																				if (eng > 90) {
																																							System.out.println("English Score is good");
																																											}
																																													if (math > 90) {
																																																System.out.println("Math Score is good");
																																																				}

																																																				                 
																																																						          }
																																																							           public static void main(String [] args) throws IOException{

																																																								                   System.out.print("============================\n");
																																																										                    new B04().input();
																																																												    		 
																																																														          }
																																																															   }

