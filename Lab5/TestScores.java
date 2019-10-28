/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class TestScores {
    
    public TestScores(double[] scores) {
		
        System.out.println("Average: " + getAverage(scores));
	}
    
	public double getAverage(double[] inScores)
	{
		double total=0;
		for (int index = 0; index < inScores.length; index++) {
			if(inScores[index]<0 || inScores[index]>100)
			{
				IllegalArgumentException e = new IllegalArgumentException();
				throw e;
			}
			else
			{
				total += inScores[index];
			}
                        
		}
		return total/inScores.length;
	}
	
}
