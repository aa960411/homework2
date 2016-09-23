mport java.util.*;
  import java.io.*;
   class B02{
            void input(){
	                     Scanner s = new Scanner(System.in);
			                      System.out.print("Kor Grade:"); 
					                       int kor = s.nextInt();
							                        System.out.print("Eng Grade:");
										                 int eng = s.nextInt();
												                  System.out.print("Math Grade:");
														                   int math = s.nextInt();
																                   int total = kor+eng+math;
																		                    double avg = (double)total/3.0;
																				                    print("Total :  "+total );
																						                     print("Avg is "+avg );
																								              }
																									               void print(String str){
																										       		if (kor > 90) {
																															System.out.print("Korea Score is good");
																																			}
																																			                 System.out.println(str);
																																					          }
																																						           public static void main(String [] args) throws IOException{

																																							                   System.out.print("============================\n");
																																									                    new B02().input();
																																											             }
																																												      }

