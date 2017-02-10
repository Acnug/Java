package hw;

import java.io.IOException;
import java.util.ArrayList;

/* Вся семья в сборе
1. Создать класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создать объекты и заполнить их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

public class Children
{
    public static void main(String[] args) throws IOException
    {
        //Создаём новые объекты детей
        Human dete1 = new Human("Гриша", true, 15);
        Human dete2 = new Human("Толя", true, 22);
        Human dete3 = new Human("Марина", false, 18);

        //Добавляем объекты в список deti
        ArrayList<Human> deti = new ArrayList<>();
        deti.add(dete1);
        deti.add(dete2);
        deti.add(dete3);
        //Создаем новый объект "отец"
        Human otec = new Human("Петр", true, 53, deti);
        //Создаем новый объект "мать"
        Human matb = new Human("Надя", false, 45, deti);
        //Создаем объекты 2-х дедушек и 2-х бабушек и добавляем в список их детей
        ArrayList<Human> ded1Temp = new ArrayList<>();
        ded1Temp.add(otec);
        Human ded1 = new Human("Василий", true, 78, ded1Temp);

        ArrayList<Human> ded2Temp = new ArrayList<>();
        ded2Temp.add(matb);
        Human ded2 = new Human("Евгений", true, 81, ded2Temp);

        ArrayList<Human> babka1Temp = new ArrayList<>();
        babka1Temp.add(otec);
        Human babka1 = new Human("Маруся", false, 75, babka1Temp);

        ArrayList<Human> babka2Temp = new ArrayList<>();
        babka2Temp.add(matb);
        Human babka2 = new Human("Татьяна", false, 77, babka2Temp);
        //Выводим объекты на экран
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(otec);
        System.out.println(matb);
        System.out.println(deti);
    }

    public static class Human
    {
        //Объявляем в классе Human типы параметров объектов
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> deti = new ArrayList<Human>();
        //Задание параметров для объектов
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, ArrayList<Human> deti)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.deti.addAll(deti);//Добавление всех объектов deti в список
        }

       @Override
        //Преобразование объектов в строку
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.deti.size();
          //Возвращает имя каждого ребенка в списке
            if (childCount > 0)
            {
                text += ", дети: "+this.deti.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.deti.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}