public class Smalletandlargest {
    public static void main(String[] args) {
        int[] number={12,23,24,65,15,3};
        int min=number[0];
        int max=number[0];
        for(int i=1;i<number.length;i++){
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("smallest value:"+ min);
        System.out.println("largest value:"+max);
    }
    
}
