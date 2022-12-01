package main;

public class Bubble_sort {

	//Função de troca do elemento
	public static void Swap(int vet[],int i, int j) {
			int aux = vet[i];
			vet[i]= vet[j];
			vet[j]=aux;
		}
	  
	  
	  //Função bubblesort
		public static void Bubble (int[]vet) { 
			for(int i=vet.length-1;i>0;i--) {
	        	for(int j=0;j<i;j++) {
	        		if(vet[j]>vet[j+1]) {
	        			Swap(vet,j,j+1);
	        		} 
	        	}		
			}
		}
	

	//MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vetor de teste 
		int [] vetor = new int[] {3,5,7,6};
				
		//chamando o procedimento
		Bubble(vetor);
				
		//Saida do vetor
		System.out.print("Vetor ordenado: \n");
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+"\n");
		}		
				

	}

}
