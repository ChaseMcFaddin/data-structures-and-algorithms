package challenges.challenges;

public class ArrayShift {
    public int[] arrayShift(int[] original, int num){

        int[] newArray = new int[original.length +1];
        int middleIndex = 0;
        int j=0;

        if(original.length % 2 == 0){
            middleIndex = original.length/2;
        }else{
            middleIndex = original.length/2+1;
        }

        for(int i = 0; i< newArray.length; i++){

            if(i == middleIndex){
                newArray[i]= num;
            }else{
                newArray[i]= original[j];
                j++;
            }
        }
        return newArray;
    }
}