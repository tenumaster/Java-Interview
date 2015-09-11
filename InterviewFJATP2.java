import java.util.ArrayList;

// To execute Java, please define "static void main" on a class named Solution.
// input  = {1,2,2,1,3,2,4,4,5}
// output = {1,2,3,4,5}  
class InterviewFJATP2 {
  public static void main(String[] args) {
    int array1[] = {1,3,2,1,3,2,4,5};
    cleanDuplicates(array1);
    }
  
  // write cleanDuplicates method
  public static void cleanDuplicates(int [] array){
    int i=0;
    int x=0;
    int flag=0;
    int array2[] = new int[array.length];
    for(i=0;i<array.length;i++){
        for(int j=0;j<i;j++){
            if((array[i]==array[j])){
            flag=1;
            }
            
        }
       
        if(flag==1){
            flag=0;
        
        }else{
            array2[x]=array[i];
            x++;
        }
    }
    array=array2;
       System.out.println("El array queda: ");
       for(i=0;i<x;i++){
           System.out.print(array[i]+" ");
       }
       
  }
}