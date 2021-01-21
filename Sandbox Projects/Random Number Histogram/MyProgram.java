public class MyProgram
{
    
    public static void main(String[] args)
    {
        int[] data = new int[25]; //Created an array with 25 elements
        
        
        //for INDEX = 0; if index is less than DATA length; when complete add 1 to INDEX
        for (int i = 0; i < data.length; i++) {
            
            //for element in array, make it equal to random number between 0-9;
            data[i] = Randomizer.nextInt(0, 9);
            //print the number that was generated
            System.out.print(data[i]);
            
        }
    }
}