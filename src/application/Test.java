package application;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		
	user obj1 = new user ();
	if(obj1.getA_id()>=0)
	{
		assertEquals(0, 0);

	}
	}
	
	@org.junit.Test
	public void test2() {
		
		user obj1 = new user();
		if(obj1.getB_id()>=0)
		{
			assertEquals(0, 0);
		}
	}
	@org.junit.Test
		public void test3() {
			
			user obj1 = new user();
			if(obj1.getA_id()>=0)
			{
				assertEquals(0, 0);
			}		
}
		@org.junit.Test
		public void test4() {
			
			user obj1 = new user();
			if(obj1.getAbill()<=0)
			{
				assertEquals(0, 1);
			}		
}
		@org.junit.Test
		public void test5() {
			
			user obj1 = new user();
			if(obj1.getBbill()<=0)
			{
				assertEquals(0, 1);
			}		
}
		
		@org.junit.Test
		public void test6() {
			
			user obj1 = new user();
			if(obj1.getCbill()<=0)
			{
				assertEquals(0, 1);
			}		
}		
	

		@org.junit.Test
		public void test7() {
	
			user obj1 = new user();
			if(obj1.getOtbill()<=0)
			{
				assertEquals(0, 1);
			}		
		}


@org.junit.Test
public void test8() {
	
	user obj1 = new user();
	if(obj1.getOtid()<=0)
	{
		assertEquals(0, 1);
	}		
}
}
