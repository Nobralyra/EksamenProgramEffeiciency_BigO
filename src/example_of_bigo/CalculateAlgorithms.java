package example_of_bigo;

import example_of_bigo.algoritms.AlgorithmA;
import example_of_bigo.algoritms.AlgorithmB;
import example_of_bigo.algoritms.AlgorithmC;

public class CalculateAlgorithms
{
    AlgorithmA algorithmA = new AlgorithmA();
    AlgorithmB algorithmB = new AlgorithmB();
    AlgorithmC algorithmC = new AlgorithmC();

    public void displayAlgorithms()
    {
        algorithmA.computingAlgorithmA();
        algorithmB.computingAlgorithmB();
        algorithmC.computingAlgorithmC();
    }
}
