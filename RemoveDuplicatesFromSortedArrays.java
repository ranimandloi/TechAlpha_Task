//     TASK - 1
//  JAVA ARRAY PROGRAM TO REMOVE DUPLICATES ELEMENTS FROM AN ARRAY..
//  EXAMPLE :-
//  INPUT :- {1,2,2,3,3,4,5}
//  OUTPUT:- {1,2,3,4,5}

public class RemoveDuplicatesFromSortedArrays {
    public static int removeDuplicates(int arr[])
    {
        int rd =0;
        for(int i= 1;i< arr.length;i++)
        {
            if(arr[rd]!=arr[i])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }
          return rd+1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5};
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        int rd = removeDuplicates(arr);
        System.out.println();
        for(int i=0;i< rd;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
