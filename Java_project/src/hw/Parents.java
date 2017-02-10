package hw;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Семья
Создать класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создать объекты и заполнить их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Parents {
    public static void main(String[] args) throws IOException
    {
        //Вводим с клавиатуры имена и возраст членов семьи
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя первого дедушки");
        String grandFa1name = reader.readLine();
        System.out.println("Введите возраст первого дедушки");
        int grandFa1age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя второго дедушки");
        String grandFa2name = reader.readLine();
        System.out.println("Введите возраст второго дедушки");
        int grandFa2age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя первой бабушки");
        String grandMa1name = reader.readLine();
        System.out.println("Введите возраст первой бабушки");
        int grandMa1age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя второй бабушки");
        String grandMa2name = reader.readLine();
        System.out.println("Введите возраст второй бабушки");
        int grandMa2age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя отца");
        String fatherName = reader.readLine();
        System.out.println("Введите возраст отца");
        int fatherage = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя матери");
        String motherName = reader.readLine();
        System.out.println("Введите возраст матери");
        int motherage = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя ребенка мужского пола");
        String child1Name = reader.readLine();
        System.out.println("Введите возраст ребенка мужского пола");
        int child1age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя ребенка женского пола");
        String child2Name = reader.readLine();
        System.out.println("Введите возраст ребенка женского пола");
        int child2age = Integer.parseInt(reader.readLine());

        System.out.println("Введите имя второго ребенка женского пола");
        String child3Name = reader.readLine();
        System.out.println("Введите возраст второго ребенка женского пола");
        int child3age = Integer.parseInt(reader.readLine());
       
        //Создаем объекты с параметрами каждого из членов семьи
        Human grandFa1 = new Human(grandFa1name, true, grandFa1age);
        Human grandFa2 = new Human(grandFa2name, true, grandFa2age);
        Human grandMa1 = new Human(grandMa1name, false, grandMa1age);
        Human grandMa2 = new Human(grandMa2name, false, grandMa2age);
        Human Father = new Human(fatherName, true, fatherage, grandFa1, grandMa1);
        Human Mother = new Human(motherName, false, motherage, grandFa2, grandMa2);
        Human Child1 = new Human(child1Name, true, child1age, Father, Mother);
        Human Child2 = new Human(child2Name, false, child2age, Father, Mother);
        Human Child3 = new Human(child3Name, false, child3age, Father, Mother);

        //Выводим объекты на экран
        System.out.println(grandFa1);
        System.out.println(grandFa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(Child1);
        System.out.println(Child2);
        System.out.println(Child3);

    }

    public static class Human
    {
        //Объявляем в классе Human типы параметров объектов
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        //Задание параметров для объектов с учётом отсутствия матери или отца
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        //Задание параметров для объектов с учётом присутствия матери или отца
        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override

      //Преобразование объектов в строку
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            //Возвращает имя отца, если он существует
            if (this.father != null)
                text += ", отец: " + this.father.name;
            //Возвращает имя матери, если она существует
            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
