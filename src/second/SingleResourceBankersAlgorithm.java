package second;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SingleResourceBankersAlgorithm {

	public static void main(String[] args) throws IOException {
		int [] [] matrix = {{1,6},
							{1,5},
							{2,4},
							{4,7}};
		int[] neededmatrix =new int[4];
		int free=2;
		int i1=0;
		 File file = new File("/Users/divya/Desktop/OsAssignment3sol.txt");

	      if (file.createNewFile()){
	        System.out.println("File is created!");
	         }else{
	        System.out.println("File already exists.");
	      }
	      PrintWriter writer = new PrintWriter("/Users/divya/Desktop/OsAssignment3sol.txt", "UTF-8");
		     writer.println("File is created!");
		     writer.println("Banker algorithm for Single resource");
		 	System.out.println("");
			writer.println("");
//			calculating the need matrix
		for(int h[]:matrix){			
			int maxneededresource,allocatedresource;
			allocatedresource=h[0];
			maxneededresource=h[1];
			System.out.print("allocatedresource "+allocatedresource);
			System.out.print(" maxneededresource "+maxneededresource);
			writer.print("allocatedresource "+allocatedresource);
			writer.print(" maxneededresource "+maxneededresource);
			neededmatrix[i1]=maxneededresource-allocatedresource;
			i1++;
			System.out.println("");
			writer.println("");
		}
		System.out.println("");
		writer.println("");
		System.out.println("Need Matrix");
		writer.println("Need Matrix");
		for(int j=0;j<neededmatrix.length;j++){
			System.out.println("needed resource  for process "+j +" is "+neededmatrix[j]);
			writer.println("needed resource for process "+j +" is "+neededmatrix[j]);
		}
		for(int k=0;k<neededmatrix.length+1;k++){
//		checking one process against the free resource.
		for(int i=0;i<neededmatrix.length;i++){
			if(neededmatrix[i] == free){
				System.out.println("    ");
				writer.println(" ");
				System.out.println("process "+i+" is Running");
				writer.println("process "+i+" is Running");
//				after running the available resource is equal to the sum of allocated resource 
//				for process + existing free resource.
				int freed=free+matrix[i][0];
				free=freed;
				neededmatrix[i]=0;
				matrix[i][0]=0;
				matrix[i][1]=0;
				
				System.out.println("process "+i+" is completed");
				writer.println("process "+i+" is completed");
				System.out.println("free resource/Available resource "+free);
				writer.println("free resource/Available resource "+free);
				
				System.out.println("Resource matrix after running this process");
				writer.println("Resource matrix after running this process");
				for(int p[]:matrix){
					for(int elem:p){
						System.out.print(elem+ " ");
						writer.print(elem+ " ");
					}
					System.out.println(" ");
					writer.println(" ");
				}
			}else if (neededmatrix[i] >0 && neededmatrix[i] < free){
				System.out.println("    ");
				writer.println(" ");
				System.out.println("process "+i+" is Running");
				writer.println("process "+i+" is Running");
//				after running the available resource is equal to the sum of allocated resource 
//				for process + existing free resource.
				int freed=free+matrix[i][0];
				free=freed;
				neededmatrix[i]=0;
				matrix[i][0]=0;
				matrix[i][1]=0;
				
				System.out.println("process "+i+" is completed");
				writer.println("process "+i+" is completed");
				System.out.println("free resource/Available resource "+free);
				writer.println("free resource/Available resource "+free);
				
				System.out.println("Resource matrix after running this process");
				writer.println("Resource matrix after running this process");
				for(int p[]:matrix){
					for(int elem:p){
						System.out.print(elem+ " ");
						writer.print(elem+ " ");
					}
					System.out.println(" ");
					writer.println(" ");
				}
		
			}

			}
			
		}
		
//		to check the system is in safe state or not . sum all the resources after running , it should be equal to zero.
		int safestate =0;
		for(int p[]:matrix){
			for(int el:p){
				safestate+=el;
			}
		}
		if(safestate==0){
			System.out.println("The System is in Safe State");
			writer.println("The System is in Safe State");
		}
		writer.close();
		
	}

}
