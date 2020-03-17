package ExceptionExamplesAssessment;

public class ExcpetionCondition1 {

	public void Eaf(int num) throws Exception1Method,Exception1Method2
	{
		if(num>0||num<0)
		{
		throw new	Exception1Method(num);
		}
		else throw new Exception1Method2();
	}
}
