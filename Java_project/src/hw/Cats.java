package hw;
// Импортируем библиотеки
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Объявляем класс
public class Cats {
	// Объявляем метод main
    public static void main(String[] args) {
    	// Создаем объект с параметром Murzik типа Cat
    		Cat cat = new Cat("Murzik"); 
    	// Выводим объект на экран, преобразовав его в строку
    		System.out.println(cat.toString());      
    		}

    public static class Cat
    {
    	// Объявляем в классе Cat поля    
    	private String name;   
    	public Cat(String name) {   
    		// конструктор класса       
    		this.name = name;   
    		}   
    	// Выводим имя   
    	public String toString() {
    		return name;    
    		}
    	}
    }


