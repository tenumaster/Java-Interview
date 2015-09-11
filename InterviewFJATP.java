import java.util.ArrayList;

public class InterviewFJATP {

    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{3,4,5},{6,7,8}};
        int x=matrix.length;
        int y=0;
    	for(int i=0; i<matrix.length; i++){
    		y=matrix[i][i]+y;
    		y=y-matrix[i][matrix.length-i-1];
     
    	}
        System.out.println("El resultado es:"+y);
    }          
    
}