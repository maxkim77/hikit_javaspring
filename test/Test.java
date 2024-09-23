class Test {
    public static void main(String[] args) {
        int[] arr1 = {11,15,19,21,22,23,24};
        int[] arr2 = {5,16,17,21,22,28};
        int[] output = new int[13]; 
        int i = 0, j = 0, k = 0;
        int lastAdded = -1; 

        while (i < 7 && j < 6) {
            if (arr1[i] < arr2[j]) {
                if (lastAdded != arr1[i]) { 
                    output[k++] = arr1[i];
                    lastAdded = arr1[i]; 
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (lastAdded != arr2[j]) { 
                    output[k++] = arr2[j];
                    lastAdded = arr2[j]; 
                }
                j++;
            } else {
                if (lastAdded != arr1[i]) { 
                    output[k++] = arr1[i];
                    lastAdded = arr1[i]; 
                }
                i++;
                j++;
            }
        }

        while (i < 7) {
            if (lastAdded != arr1[i]) { 
                output[k++] = arr1[i];
                lastAdded = arr1[i]; 
            }
            i++;
        }

        while (j < 6) {0
            if (lastAdded != arr2[j]) { 
                output[k++] = arr2[j];
                lastAdded = arr2[j];
            }
            j++;
        }

        for (int n = 0; n < k; n++) {
            System.out.print(output[n] + " ");
        }
    }
}
