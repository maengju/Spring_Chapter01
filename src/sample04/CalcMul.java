package sample04;

public class CalcMul implements Calc{

	@Override
	public void calculate(int x, int y) {
		System.out.println(x+" x "+y+" = "+(x*y));
		
	}

}
