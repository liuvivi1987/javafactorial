package algoTest;

public class testDo {
	public static int outresult(int n) {
		int Nresult;
		if(n == 1)
			Nresult=1;
		else {
			Nresult = outresult(n-1);
		}
		return Nresult*n;
	}
		
}
