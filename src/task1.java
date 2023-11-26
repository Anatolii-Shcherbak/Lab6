import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int Array1[] = {10,9,8,7,6,5,4,3,2,1};
        int Array[] = {1,2,3,4,5,6,7,8,9,10};
        int counter=0, temp;
        boolean toSort = true;

        for (int i = 1; i<Array.length && toSort; i++)
        {
            counter++;
            toSort = false;

            for (int j = 0; j<Array.length - i; j++)
            {
                counter++;
                if(Array[j] > Array[j+1])
                {
                    counter++;
                    temp = Array[j+1];
                    Array[j+1] = Array[j];
                    Array[j] = temp;
                    toSort = true;
                }
            }
        }
            System.out.println(Arrays.toString(Array));
        System.out.println("Ections " + counter);
    }
}
