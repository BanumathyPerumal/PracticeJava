package javaproject;

public class revArray {
    public static int[] reverseArraay(int[] array){

        for(int i=0; i<array.length/2; i++){
        array[i]=array[i]+array[array.length-1-i];  // array[1]  = 3+7; 
        array[array.length-1-i] = array[i]- array[array.length-1-i];   //array[2] = 10-7
        array[i] = array[i]- array[array.length-1-i]; // array[1] = 10 - 3
        }
        return array;
    }


        public static void main(String[] args){
            int[] array = {1,3,7,9,10};
            array = reverseArraay(array);
           for(int num: array) System.out.println(num);
        }
    
}
