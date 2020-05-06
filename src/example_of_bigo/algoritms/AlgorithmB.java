package example_of_bigo.algoritms;

public class AlgorithmB
{
    private int sum = 0;
    private int n = 5;

    /**
     * Two nested loops with both loop until n - O(n^2) operationer
     */
    public void computingAlgorithmB()
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                sum = sum + 1;
            }
        }
        System.out.println("B: " + sum);
    }
}
