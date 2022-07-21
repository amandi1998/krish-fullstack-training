 
public class Main
{
    // Function to find the number
  // of the drops that come out of the
  // pipe
  static int drops(int length, int[] position, int[] speed, int n)
  {
    // stores position and time
    // taken by a single
    // drop to reach the end as a pair
    Pair m[] = new Pair[n];
    int i;
    for (i = 0; i < n; i++)
    {
  
      // calculates distance needs to be
      // covered by the ith drop
      int p = length - position[i];
  
      // inserts initial position of the
      // ith drop to the pair
      // inserts time taken by ith
      // drop to reach
      // the end to the pair
      m[i] = new Pair(position[i], p / speed[i]);
    }
  
    // sorts the pair according to increasing
    // order of their positions
    Compare obj = new Compare();
    obj.compare(m, n);
    int k = 0; // counter for no of final drops
    int curr_max = (int)(m[n - 1].y);
  
    // we traverse the array demo
    // right to left
    // to determine the slower drop
    for (i = n - 2; i >= 0; i--)
    {
  
      // checks for next slower drop
      if (m[i].y > curr_max)
      {
        k++;
        curr_max = (int)(m[i].y);
      }
    }
  
    // calculating residual
    // drops in the pipe
    k++;
    return k;
  }
   
    public static void main(String[] args) {
        // length of pipe
        int length = 12;
      
        // position of droplets
        int[] position = { 10, 8, 0, 5, 3 };
      
        // speed of each droplets
        int[] speed = { 2, 4, 1, 1, 3 };
        int n = speed.length;
        System.out.println(drops(length, position, speed, n));
    }
}
 
// This code is contributed by decode2207.