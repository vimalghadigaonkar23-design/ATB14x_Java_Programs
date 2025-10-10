import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab_1 {

    public static void main(String[] args) {
        int[] mat=new int[3];

        int [] numbers;
        numbers=new int[3];

        int [] numbers1={1,2,3,4};
        System.out.println(numbers1[0]);

        int [] using_for_loop ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int each_loop : using_for_loop){
            System.out.println(each_loop);
        }


        int [] marks={10,20,30,40,50,60};
        for(int i=0;i< marks.length;i++){
            System.out.println("Marks:"+marks[i]);
        }



        int [] sorting_array={1,8,9,4,5,6,7};
        Arrays.sort(sorting_array);
        System.out.println(Arrays.toString(sorting_array));



        }


    }

