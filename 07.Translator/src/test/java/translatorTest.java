import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.citytech.alogorithym.sid23356435.ABCTelephoneTranslator;

public class translatorTest {
	@Test
	//should be false
	@DisplayName("555GET-JAVA")
	void translateTest1()  {
		
		String actual = ABCTelephoneTranslator.translate("555GET-JAVA");
		String expected = "555-438-5282";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("555-GETJAVA")
	void translateTest2()  {
		
		String actual = ABCTelephoneTranslator.translate("555-GETJAVA");
		String expected = "555-438-5282";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be true
	@DisplayName("555-GET-JAVA")
	void translateTest3()  {
		
		String actual = ABCTelephoneTranslator.translate("555-GET-JAVA");
		String expected = "555-438-5282";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be true
	@DisplayName("555-GET-SQL2")
	void translateTest4()  {
		
		String actual = ABCTelephoneTranslator.translate("555-GET-SQL2");
		String expected = "555-438-7752";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be true
	@DisplayName("345-SEE-1NYC")
	void translateTest5()  {
		
		String actual = ABCTelephoneTranslator.translate("345-SEE-1NYC");
		String expected = "345-733-1692";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be true
	@DisplayName("145-LUV-CODE")
	void translateTest6()  {
		
		String actual = ABCTelephoneTranslator.translate("145-LUV-CODE");
		String expected = "145-588-2633";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("800-WE-PAINT")
	void translateTest7()  {
		
		String actual = ABCTelephoneTranslator.translate("800-WE-PAINT");
		String expected = "555-438-5282";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("555GETJAVA")
	void translateTest8()  {
		
		String actual = ABCTelephoneTranslator.translate("555GETJAVA");
		String expected = "555-438-5282";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be true
	@DisplayName("LUV-YOU-CUNY")
	void translateTest9()  {
		
		String actual = ABCTelephoneTranslator.translate("LUV-YOU-CUNY");
		String expected = "588-968-2869";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("LUV-YOU-CUNYS")
	void translateTest10()  {
		
		String actual = ABCTelephoneTranslator.translate("LUV-YOU-CUNYS");
		String expected = "588-968-2869";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("LU-YOU-CUNY")
	void translateTest11()  {
		
		String actual = ABCTelephoneTranslator.translate("LU-YOU-CUNY");
		String expected = "588-968-2869";
		
		assertEquals(expected, actual);
		
	}
	@Test
	//should be false
	@DisplayName("LUV-YO-CUNY")
	void translateTest12()  {
		
		String actual = ABCTelephoneTranslator.translate("LUV-YO-CUNY");
		String expected = "588-968-2869";
		
		assertEquals(expected, actual);
		
	}
}
