package hw;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Кошачья семья
Задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс, который бы описывал данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/


public class Cats {
    public static void main(String[] args) throws IOException
    {
    	//Вводим с клавиатуры имена членов кошачьей семьи
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите степень родства и имя кота дедушки");
        String grandFaname = reader.readLine();
        System.out.println("Введите степень родства и имя кошки бабушки");
        String grandManame = reader.readLine();
        System.out.println("Введите степень родства и имя кота папы");
        String fatherName = reader.readLine();
        System.out.println("Введите степень родства и имя кошки мамы");
        String motherName = reader.readLine();
        System.out.println("Введите степень родства и имя кота сына");
        String sonName = reader.readLine();
        System.out.println("Введите степень родства и имя кошки дочки");
        String daughterName = reader.readLine();

        //Создаем объекты с параметрами каждого из членов семьи
        Cat grandFa = new Cat(grandFaname);

        Cat grandMa = new Cat(grandManame);

        Cat catFather = new Cat(fatherName, grandFa, null);

        Cat catMother = new Cat(motherName, null, grandMa);

        Cat catSon = new Cat(sonName, catFather, catMother);

        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        //Выводим объекты на экран
        System.out.println(grandFa);
        System.out.println(grandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);

    }

    public static class Cat
    {   //Объявляем в классе Cat типы параметров объектов
        private String name;
        private Cat father;
        private Cat mother;


        Cat(String name)
        {   //Задание параметров для объектов с учётом отсутствия матери или отца
            this.name = name;
            this.father = null;
            this.mother = null;
        }

        Cat(String name, Cat father,  Cat mother)
        {   //Задание параметров для объектов с учётом присутствия матери или отца
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        //Преобразование объектов в строку
        public String toString()
        {
            return "Cat name is " + name +
                    ((mother != null) ? ", mother is " + mother.name : ", no mother") + ((father != null) ? ", father is " + father.name : ", no father");
        }

    }

}
