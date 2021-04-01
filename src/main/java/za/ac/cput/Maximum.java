/**
* Author: Justin Jenecke 215163052
* Details: POJO for maximum function
* Date: 01/04/2021
*/

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
