package com.greatlearing.Service;

public class MergeSort {

	


	    public void sortArray(int[] inputArray) {
	        sortArray(inputArray, 0, inputArray.length - 1);
	    }

	    private void sortArray(int array[], int l, int r) {
	        if (l < r) {
	            int m = l + (r - l) / 2;
	            sortArray(array, l, m);
	            sortArray(array, m + 1, r);
	            conquerArray(array, l, m, r);
	        }
	    }

	    private void conquerArray(int array[], int l, int m, int r) {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	        for (int i = 0; i < n1; ++i) {
	            L[i] = array[l + i];
	        }
	        for (int j = 0; j < n2; ++j) {
	            R[j] = array[m + 1 + j];
	        }
	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] >= R[j]) {
	                array[k] = L[i];
	                i++;
	            } else {
	                array[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            array[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            array[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    public void printValues(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
