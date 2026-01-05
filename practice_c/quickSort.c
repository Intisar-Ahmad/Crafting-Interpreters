#include <stdio.h>

// partition function
int partition(int arr[],int st,int end){

    int i = st - 1;
    int j = st;
    while(j < end){
        if(arr[j] < arr[end]){
            int temp = arr[i + 1];
            arr[++i] = arr[j];
            arr[j] = temp;
        }
        j++;
    }

    int temp = arr[i+1];
    arr[++i] = arr[end];
    arr[end] = temp;


    return i;
}


// quickSort
void quickSort(int arr[],int st,int end){
    if(st < end){

        int pivotIdx = partition(arr,st,end);

        // left subarray
        quickSort(arr,st,pivotIdx - 1);


        // right subarray
        quickSort(arr,pivotIdx + 1,end);


    }
}

int main() {
    int arr[] = {-1,-2,-3,-4,-5};

    quickSort(arr,0,4);

    for (int i = 0; i < 5; i++)
    {
        printf("%d ",arr[i]);
    }
    
    printf("\n");

    return 0;
}