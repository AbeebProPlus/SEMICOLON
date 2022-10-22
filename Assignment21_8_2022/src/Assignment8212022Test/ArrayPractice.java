package Assignment8212022Test;

public class ArrayPractice {
    public int largestNumberInAnArray(int[] arr){
        int largest = arr[0];
        for (int item = 0; item < arr.length; item++){
            if (arr[item] > largest){
                largest = arr[item];
            }
        }
        return  largest;
    }
    public int[] reverseArray(int[] arr){
        int temp = 0;
        for (int element = 0; element < (arr.length/ 2); element++){
            temp = arr[element];
            arr[element] = arr[arr.length - 1 - element];
            arr[arr.length - 1 - element] = temp;
        }
        return arr;
    }
    public boolean checkIfElementIsInArray(int[] arr, int element){
        for (int item = 0; item < arr.length; item++){
            if (arr[item] == element){
                return true;
            }
        }
        return false;
    }
    public void getOddPositionElements(int[] arr){
        for (int item = 0; item < arr.length; item++){
            if (item % 2 != 0){
                System.out.println(arr[item]);
            }
        }
    }
    public void getEvenPositionElements(int[] arr){

        for (int item = 0; item < arr.length; item++){
            if (item % 2 == 0){
                System.out.println(arr[item]);

            }
        }
    }
    public void getRunningTotalOfAnArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            System.out.println(sum += arr[i]);
    }
    public boolean isPalindrome(String word){
        char[] str = word.toCharArray();
        int j = 0;
        int counter = 0;
        while (j < str.length){
            if (str[j] == str[str.length - 1 - j]){
                counter++;
            }
            else
                break;
            j++;
        }
        return counter == str.length;
    }
    public int sumOfArrayItemsWithForLoop(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public int sumOfArrayItemsWithWhileLoop(int[] arr){
        int sum = 0;
        int counter = 0;
        while (counter < arr.length){
            sum += arr[counter];
            counter++;
        }
        return sum;
    }
    public int sumOfArrayItemsWithDoWhileLoop(int[] arr){
        int sum = 0;
        int counter = 0;
        do{
            sum += arr[counter];
            counter++;
        }while(counter < arr.length);
        return sum;
    }
    public int[] arrayConcatenation(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++){
            arr3[arr1.length + j] = arr2[j];
        }
        return arr3;
    }
    public int[] combineTwoArraysAlternatively(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++){
            arr3[k++] = arr1[i];
            arr3[k++] = arr2[i];
        }
        return arr3;
    }
    public int[] listOfDigits(int number){
        int counter = 0;
        int counter2 = 0;
        int rem = 0;
        int num = number;
        while (number != 0){
            number = number / 10;
            counter++;
        }
        int[] arr = new int[counter];

        while (num != 0){
            rem = num % 10;
            arr[arr.length - 1 - counter2] = rem;
            counter2++;
            num /= 10;
        }
        return arr;
    }
}
