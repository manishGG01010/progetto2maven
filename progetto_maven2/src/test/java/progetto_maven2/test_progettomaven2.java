package progetto_maven2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class test_progettomaven2 {


		
		@Test
		
		void test1()
		{   
			double result=0;
			
			result = progetto_maven2.Sum_operation(3, 6);
			
			assertEquals(result,9);
			
		}

		
	}
	
	



