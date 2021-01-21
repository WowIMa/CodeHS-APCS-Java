public class MyProgram
{
    
    public static void main(String[] args)
    {
        int[] data = new int[25]; //Created an array with 25 elements
        int[] histogram = new int[10]; //Created an array with 10 elements
        
        System.out.print("Data Contents:\n");
        
        
        /*** Assign random numbers to each element in array ***/

        //for INDEX = 0; if index is less than DATA length; when complete add 1 to INDEX
        for (int i = 0; i < data.length; i++) {
            
            //for element in array, make it equal to random number between 0-9;
            data[i] = Randomizer.nextInt(0, 9);
            System.out.print(data[i]); //print the number that was generated
            
        }
        System.out.print("\n\nHistogram Contents:\n");
        
        /*** Store number of times each number occurs in data ***/
        
        //for INDEX = 0; if INDEX is less than DATA length; when complete add 1 to INDEX
        for (int i = 0; i < histogram.length; i++) {
            
            //This for loop will check each element in data[] and check if the number is equal to index ('i') for each element in histogram
            for (int d = 0; d < data.length; d++) {
                
                //if data value at data 'd' is equal to the index of histogram, then:
                if (data[d] == i){
                    
                    //add +1 at index of histogram for every number equal to index
                    histogram[i] += 1;
                    
                }
            }
            
            System.out.print(i + " - occured " + histogram[i] + " times\n");
        }
    }
}
