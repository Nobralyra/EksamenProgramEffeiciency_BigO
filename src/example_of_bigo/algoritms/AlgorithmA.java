package example_of_bigo.algoritms;

public class AlgorithmA
{
    private int sum = 0;
    private int n = 5;

    /**
     * For loop that loops until n - O(n) operationer
     */
    public void computingAlgorithmA()
    {
        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("A: " + sum);
    }
}
