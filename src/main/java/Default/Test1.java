package Default;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s1= "java, selenium, maven,jenkins";
		
		String s2="Hi there";
		String[] str1=s2.split(",");
		
		System.out.println(str1);*/
		
		String s1="abc";
		String s2="xyz";
		String s3="pqr";
		
		String str4= s1.concat(s2);
		String str5=str4.concat(s3);
		System.out.println(str5);
		StringBuffer s= new StringBuffer();
		
		s.append(s1);
		//System.out.println(s);
	}

}
