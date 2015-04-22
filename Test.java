import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		String s = "5#9#6#4#6#8#0#7#1#5" ;
		assertTrue("29".equalsIgnoreCase(TestTriangle.validtrianglesum(s))) ;
		
	}
	
	@org.junit.Test
	public void test1() {
		String s = "5#9#6#4#6#8#0#7#1" ;
		assertTrue("Invalid".equalsIgnoreCase(TestTriangle.validtrianglesum(s))) ;
		
	}
	
	@org.junit.Test
	public void test2() {
		String s = "5#9##6#4#6#8#0#7#1#5" ;
		assertTrue("Invalid".equalsIgnoreCase(TestTriangle.validtrianglesum(s))) ;
		
	}
	
	@org.junit.Test
	public void test3() {
		String s = "5#9#6#4#6#4" ;
		assertTrue("20".equalsIgnoreCase(TestTriangle.validtrianglesum(s))) ;
		
	}

	@org.junit.Test
	public void test4() {
		StringBuilder s = new StringBuilder(2500*50001) ;
		for(int i =0 ; i< (1000*2001) ; i++ ) {
			s.append(i);
			s.append("#") ;
		}
		System.out.println(TestTriangle.validtrianglesum(s.toString()));
		assertTrue("1335331999".equalsIgnoreCase(TestTriangle.validtrianglesum(s.toString()))) ;
		
	}
	
	@org.junit.Test
	public void test5() {
		String s = "5#9#6#4#d#4" ;
		assertTrue("Invalid".equalsIgnoreCase(TestTriangle.validtrianglesum(s))) ;
		
	}
}
