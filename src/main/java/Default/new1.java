package Default;

public class new1 {

	public static void main(String[] args) {
		
		emp e= new emp();
		System.out.println(e.ani(10));
		System.out.println(e.empname);
		System.out.println(e.id);
		for(String s: e.department)
		{
			System.out.println(s);
		}
	}

}
