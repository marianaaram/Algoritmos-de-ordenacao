package main;

public class Selection_sort {

	//Função da troca de elementos
		public static void Swap(int vet[],int i, int j) {
			int aux = vet[i];
			vet[i]= vet[j];
			vet[j]=aux;
		}
	  
   //Função troca 
   public static void Selectionsort (int vet[]) { 
		
      for(int i=0;i<vet.length;i++) {
         int menor_selec=i;
         for(int j=i+1;j<vet.length;j++) {
           if(vet[j]<vet[menor_selec]) {					 
             menor_selec=j;
           }
         }
         if(i!=menor_selec) {
           Swap(vet,i,menor_selec);					 
         }

       }
   }
  
  //MAIN
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vetor de teste 
		int [] vetor = new int[] {3,5,7,6};
				
		//chando o procedimento
		Selectionsort(vetor);
				
		//Saida do vetor
		System.out.print("Vetor ordenado: \n");
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+"\n");
		}		
				

	}

}
