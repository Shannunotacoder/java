public class array{
    public static void main(String args[]){
        int[] marks= {10,20,30,40,50};
        for(int i=0;i<marks.length;i++){
            System.out.println("Element at "+ i +" index is = "+ marks[i]);
        }
        for(int m:marks){
            System.out.println(m+" ");
        }



        //2D Array
        /*int number[][]={{1,2,3,4,5,6}
                        ,{4,5,6,7}
                        ,{8,9,4,5,6}};
        //System.out.println(number[0][3]);
        for (int i=0;i<number.length;i++){
            for(int j=0;j < number[i].length;j++){
                System.out.println(number[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(array.toString(number[i]));
        }*/


        int a1[]={1,2,4,5,6};
        int tar=4;
        boolean found=false;
        for(int i=0;i<a1.length;i++){
            if(a1[i] == tar){
                found=true;
                System.out.println("Found "+ a1[i]);
                break;
            }

        }

    }
}
