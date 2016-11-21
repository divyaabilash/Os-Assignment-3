package second;

public class MultiResourceBankersAlgorithm {

	public static void main(String[] args) {
		
int [][] assigned ={{3,0,1,1},
					{0,1,0,0},
					{1,1,1,0},
					{1,1,0,1},
					{0,0,0,0}};

int [][] needed={{1,0,2,0},
				 {0,1,1,2},
				 {3,1,0,0},
				 {0,0,1,0},
				 {2,1,1,0}
};

int []total={6,3,4,2};
int []available={1,0,2,0};
int found=0;
for(int[] h:needed){
	for(int i=0;i<h.length;i++){
		if(h[i] == available[i]){
			found++;
		}
		if(found ==4){
			
		}
	}
}

	}

}
