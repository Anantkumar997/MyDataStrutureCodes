package L36_Inheritance;

public class Clint {

	public static void main(String[] args) {
		// Case 1
		P obj1 = new P();
		System.out.println(obj1.d);  //10
		System.out.println(obj1.d1);  //100
		obj1.fun();		// P's fun
		obj1.fun1();	// P's fun 1
		
		// Case 2 
		P obj2 = new C();
		System.out.println(obj2.d); 	//10
		System.out.println(obj2.d1);	//100
		// System.out.println(obj2.d2);		// sara control compiler k paas hota h jo LHS ko dekhata h. jiski bjah se obj2 P type ka ho jata h... Or agar aap ese chalana chahte ho
		System.out.println(((C)obj2).d2);	// to typecast kar dijiye
		obj2.fun();// C's fun
		((P)obj2).fun();// C's fun  // aap agar P ka Fun chahte ho to typecast karoge par function m pahle new class check hoti h agar whan fun h to vhi chalega...
		obj2.fun1();// P's fun 1
//		obj2.fun2();		// nhi kar skhe 
		((C)obj2).fun2();//C's fun 2	// typecast kar dijiye
		
		// Case 3
		
		//C obj3 = new P();  not allowed
		
		// Case 4
		
		C obj4 = new C();
		System.out.println(obj4.d);
		System.out.println(((P)obj4).d);
		System.out.println(obj4.d1);
		System.out.println(obj4.d2);
		obj4.fun();
		((P)obj4).fun();
		obj4.fun1();
		obj4.fun2();
	}

}
