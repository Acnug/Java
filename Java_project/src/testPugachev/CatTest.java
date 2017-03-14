package testPugachev;
//Импортируем библиотеки
import hw.Cats.Cat;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

//новый класс для тестов
public class CatTest { 
	private Cat cat; Cat cat1; Cat cat2;// берем тестируемый класс  
	// выполнение части кода после аннотации @Before перед тестом
	@Before
public void init() {
	// создадим 3 экземпляра класса Cat
cat = new Cat("Мурзик");  
cat1 = new Cat("Bublik");
cat2 = new Cat("Murzik1");
}
	
	@Test    
	public void testCat() {
		// аннотация @Test говорит сборщику выполнить это до того как программа будет собрана. В случае неудачного прохождения теста процесс сборки будет прерван.
		assertEquals("Мурзик", cat.toString());    // вызывается тестируемый метод и сверяется полученный результат с ожидаемым    
		}    
	@Test    
	public void testCat1() {
		assertEquals("Bublik", cat1.toString());   
	} 
	@Test    
	public void testCat2() {
		assertEquals("Murzik", cat2.toString());   
	} 
		
	}
	
	
