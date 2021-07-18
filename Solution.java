//This works by turning the array into 2 streams that are added together as an intstream and converted back into an array.
class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        return(IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray());
    }
}
