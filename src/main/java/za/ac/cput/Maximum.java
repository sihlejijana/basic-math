package za.ac.cput;

public class Maximum {

    public int max(int arr[]){

        int m = 0;

        for (int i = 0; i <arr.length ; i++){
            if (arr[i] > m)
                m = arr[i];
        }

        return m;
    }

}
