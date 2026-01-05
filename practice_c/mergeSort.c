#include <stdio.h>

// merge
void merge(int arr[],int st,int mid,int end){
    int i = st; // index where left subarray starts
    int j = mid + 1; // index where right subarray starts
    int temp[end - st + 1];// temporary array where all the sorted elements will be stored
    int k = 0; // index that will track elements in temp


    while(i <= mid && j <= end){ // using two pointers to see which element is smaller and then putting it in the temp array
        if(arr[i] < arr[j]){
            temp[k++] = arr[i++];
        }
        else{
            temp[k++] = arr[j++];
        }
    }

    while(i<=mid){ // check to see if there are any elements left in the left subarray
        temp[k++] = arr[i++];
    }


    while(j<=end){ // check to see if there are any elements left in the right subarray
        temp[k++] = arr[j++];
    }

    // filling up the original array
    i = st;
    j = 0;
    while(i<=end && j < k){
        arr[i++] = temp[j++];
    }
}


// mergeSort
void mergeSort(int arr[],int st,int end){
    if(st < end){

        int mid = st + (end-st)/2;
        
        
        // left subarray
        mergeSort(arr,st,mid);

        // right subarray
        mergeSort(arr,mid+1,end);


        // merging both arrays
        merge(arr,st,mid,end);

    }
}


int main() {
    int arr[] = {3,2,5,4,1};

    mergeSort(arr,0,4);

    for (int i = 0; i < 5; i++)
    {
        printf("%d ",arr[i]);
    }
    
    

    return 0;
}