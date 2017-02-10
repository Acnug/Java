package hw;

import java.io.IOException;
import java.util.ArrayList;

/* ��� ����� � �����
1. ������� ����� Human � ������ ��� (String), ��� (boolean), ������� (int), ���� (ArrayList<Human>).
2. ������� ������� � ��������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����.
3. ������� ��� ������� Human �� �����.
*/

public class Children
{
    public static void main(String[] args) throws IOException
    {
        //������ ����� ������� �����
        Human dete1 = new Human("�����", true, 15);
        Human dete2 = new Human("����", true, 22);
        Human dete3 = new Human("������", false, 18);

        //��������� ������� � ������ deti
        ArrayList<Human> deti = new ArrayList<>();
        deti.add(dete1);
        deti.add(dete2);
        deti.add(dete3);
        //������� ����� ������ "����"
        Human otec = new Human("����", true, 53, deti);
        //������� ����� ������ "����"
        Human matb = new Human("����", false, 45, deti);
        //������� ������� 2-� ������� � 2-� ������� � ��������� � ������ �� �����
        ArrayList<Human> ded1Temp = new ArrayList<>();
        ded1Temp.add(otec);
        Human ded1 = new Human("�������", true, 78, ded1Temp);

        ArrayList<Human> ded2Temp = new ArrayList<>();
        ded2Temp.add(matb);
        Human ded2 = new Human("�������", true, 81, ded2Temp);

        ArrayList<Human> babka1Temp = new ArrayList<>();
        babka1Temp.add(otec);
        Human babka1 = new Human("������", false, 75, babka1Temp);

        ArrayList<Human> babka2Temp = new ArrayList<>();
        babka2Temp.add(matb);
        Human babka2 = new Human("�������", false, 77, babka2Temp);
        //������� ������� �� �����
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
        //��������� � ������ Human ���� ���������� ��������
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> deti = new ArrayList<Human>();
        //������� ���������� ��� ��������
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
            this.deti.addAll(deti);//���������� ���� �������� deti � ������
        }

       @Override
        //�������������� �������� � ������
        public String toString()
        {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            int childCount = this.deti.size();
          //���������� ��� ������� ������� � ������
            if (childCount > 0)
            {
                text += ", ����: "+this.deti.get(0).name;

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