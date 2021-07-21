public class Lab8 {
    public static void main(String[] args) {
        int[][] myNum={{1,2,3},{4,5,6}};
        int sum=0;
        for (int i=0; i<myNum.length;i++){
         for(int j=0;j<myNum[i].length;j++){
             System.out.println(myNum[i][j]);
             if(j==myNum[i].length-1){
                 sum+=myNum[i][j];
             }
         }   
        }
        System.out.println(sum);
    }
}
