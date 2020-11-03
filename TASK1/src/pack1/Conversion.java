package pack1;

public class Conversion {
	double d1;
	Integer meth1(double d){
	float myFloat;
	int myInt;
	myFloat=(float)d;
	myInt=(int)myFloat;
	Integer I=Integer.valueOf(myInt);
	return I;
	}
	float meth2(Integer I){
		int k=I.intValue();
		float f=k;
		return f;
	}
		public static void main(String[] args) {
			Conversion c=new Conversion();
			Integer I=c.meth1(2.0);
			System.out.println(I);
			float f=c.meth2(I);
			System.out.println(f);
		}
}
