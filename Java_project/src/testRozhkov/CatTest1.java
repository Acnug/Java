package testRozhkov;
//Импортируем библиотеки

import hw.Cats.Cat;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

//новый класс для тестов
public class CatTest1 { 
	private Cat cat1; 
			Cat cat2;// берем тестируемый класс  
	// выполнение части кода после аннотации @Before перед тестом
	@Before
public void init() {
	// создадим 2 экземпляра класса Cat
cat1 = new Cat("Котофей");  
cat2 = new Cat("Барсик");
}
	
	@Test    
	public void testCat() {
		// аннотация @Test говорит сборщику выполнить это до того как программа будет собрана. В случае неудачного прохождения теста процесс сборки будет прерван.
		assertEquals("Котофей", cat1.toString());    // вызывается тестируемый метод и сверяется полученный результат с ожидаемым    
		}    
	@Test    
	public void testCat1() {
		assertEquals("Барсик", cat2.toString());   
	} 

	}