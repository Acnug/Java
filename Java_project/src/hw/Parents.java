package hw;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* �����
������� ����� Human � ������ ���(String), ���(boolean),�������(int), ����(Human), ����(Human). ������� ������� � ��������� �� ���, ����� ����������: ��� �������, ��� �������, ����, ����, ���� �����. ������� ������� �� �����.
����������:
���� �������� ���� ����� String toString() � ������ Human, �� ������ �� ����� �������������� ��� ������ ������� �� �����.
������ ������:
���: ���, ���: �������, �������: 21, ����: �����, ����: ����
���: ����, ���: �������, �������: 55
���: �����, ���: �������, �������: 2, ����: ������, ����: ���
�
*/

public class Parents {
    public static void main(String[] args) throws IOException
    {
        //������ � ���������� ����� � ������� ������ �����
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������� ��� ������� �������");
        String grandFa1name = reader.readLine();
        System.out.println("������� ������� ������� �������");
        int grandFa1age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������� �������");
        String grandFa2name = reader.readLine();
        System.out.println("������� ������� ������� �������");
        int grandFa2age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������ �������");
        String grandMa1name = reader.readLine();
        System.out.println("������� ������� ������ �������");
        int grandMa1age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������ �������");
        String grandMa2name = reader.readLine();
        System.out.println("������� ������� ������ �������");
        int grandMa2age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ����");
        String fatherName = reader.readLine();
        System.out.println("������� ������� ����");
        int fatherage = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������");
        String motherName = reader.readLine();
        System.out.println("������� ������� ������");
        int motherage = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������� �������� ����");
        String child1Name = reader.readLine();
        System.out.println("������� ������� ������� �������� ����");
        int child1age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������� �������� ����");
        String child2Name = reader.readLine();
        System.out.println("������� ������� ������� �������� ����");
        int child2age = Integer.parseInt(reader.readLine());

        System.out.println("������� ��� ������� ������� �������� ����");
        String child3Name = reader.readLine();
        System.out.println("������� ������� ������� ������� �������� ����");
        int child3age = Integer.parseInt(reader.readLine());
       
        //������� ������� � ����������� ������� �� ������ �����
        Human grandFa1 = new Human(grandFa1name, true, grandFa1age);
        Human grandFa2 = new Human(grandFa2name, true, grandFa2age);
        Human grandMa1 = new Human(grandMa1name, false, grandMa1age);
        Human grandMa2 = new Human(grandMa2name, false, grandMa2age);
        Human Father = new Human(fatherName, true, fatherage, grandFa1, grandMa1);
        Human Mother = new Human(motherName, false, motherage, grandFa2, grandMa2);
        Human Child1 = new Human(child1Name, true, child1age, Father, Mother);
        Human Child2 = new Human(child2Name, false, child2age, Father, Mother);
        Human Child3 = new Human(child3Name, false, child3age, Father, Mother);

        //������� ������� �� �����
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
        //��������� � ������ Human ���� ���������� ��������
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        //������� ���������� ��� �������� � ������ ���������� ������ ��� ����
        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        //������� ���������� ��� �������� � ������ ����������� ������ ��� ����
        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override

      //�������������� �������� � ������
        public String toString()
        {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;
            //���������� ��� ����, ���� �� ����������
            if (this.father != null)
                text += ", ����: " + this.father.name;
            //���������� ��� ������, ���� ��� ����������
            if (this.mother != null)
                text += ", ����: " + this.mother.name;

            return text;
        }
    }

}
