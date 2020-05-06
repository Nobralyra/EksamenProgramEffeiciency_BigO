package example_of_bigo.algoritms;

public class AlgorithmC
{
    private int sum = 0;
    private int n = 5;

    /**
     * Gaussian sum - O(1) operationer
     */
    public void computingAlgorithmC()
    {
        sum = (n * (n+1)) /2;
        System.out.println("C: " + sum);
    }
}
