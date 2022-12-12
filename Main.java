import java.util.Arrays;

public class Main {

    public static String[] sortByHeight(String names[],int heights []){
        for (int i=0;i< heights.length-1;i++){
            for(int j=0;j<heights.length;j++){
                if (i+j>= heights.length){
                    break;
                }
                if(heights[i]<heights[i+j]){
                    //swapping values
                    String temp=names[i+j];
                    names[i+j]=names[i];
                    names[i]=temp;

                    int temp_1=heights[i+j];
                    heights[i+j]=heights[i];
                    heights[i]=temp_1;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Bilal","Bahar","Enhar"};
        int[] heights = {185,169,170};
        System.out.println(Arrays.toString(sortByHeight(names,heights)));

        names = new String[]{"Gizem","Ozan","Ege","Meral"};
        heights = new int[]{173,171,178,166};
        System.out.println(Arrays.toString(sortByHeight(names,heights)));

        names = new String[]{"Haitham","Losine"};
        heights = new int[]{181,171};
        System.out.println(Arrays.toString(sortByHeight(names,heights)));
    }
}
