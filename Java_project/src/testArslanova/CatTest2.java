package testArslanova;
//Импортируем библиотеки

	import hw.Cats.Cat;
	import static org.junit.Assert.*;
	import org.junit.Test;
	
	//новый класс для тестов
	public class CatTest2 {
	@Test
	public void testCat() {
		// аннотация @Test говорит сборщику выполнить это до того как программа будет собрана. В случае неудачного прохождения теста процесс сборки будет прерван.
	Cat cat = new Cat("Murzik"); //создадим экземпляр класса Cat
	assertEquals("Murzik", cat.toString()); // вызывается тестируемый метод и сверяется полученный результат с ожидаемым    
	}
	@Test
	public void testCat2() {
	Cat cat = new Cat("Bublik1");
	assertEquals("Bublik", cat.toString());
	}
	}
