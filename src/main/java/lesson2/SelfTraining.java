package lesson2;



public class SelfTraining {

    public static void main(String[] args) {
        SelfTraining equalSlices = new SelfTraining();
        equalSlices.equalSlices(8,3,2);

    }
    public void equalSlices( int totalSlices, int noOfRecipients, int sliceEach){
        boolean result = (sliceEach * noOfRecipients <= totalSlices);{
            System.out.println(result);

        }
    }
}
