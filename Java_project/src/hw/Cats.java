package hw;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* ������� �����
������: � ������ ����� ���� ���, �����-���� � �����-����. ������� �����, ������� �� �������� ������ ��������.
������� 6 ��������: �������(����� ����), �������(������ ����), ����, ����, ����, ����.
������� �� ���� �� ����� � �������: �������, �������, ����, ����, ���, ����.

������ �����:
������� ����
������� �����
���� �������
���� ��������
��� ������
���� �������

������ ������:
Cat name is ������� ����, no mother, no father
Cat name is ������� �����, no mother, no father
Cat name is ���� �������, no mother, father is ������� ����
Cat name is ���� ��������, mother is ������� �����, no father
Cat name is ��� ������, mother is ���� ��������, father is ���� �������
Cat name is ���� �������, mother is ���� ��������, father is ���� �������
*/


public class Cats {
    public static void main(String[] args) throws IOException
    {
    	//������ � ���������� ����� ������ �������� �����
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������� ������� ������� � ��� ���� �������");
        String grandFaname = reader.readLine();
        System.out.println("������� ������� ������� � ��� ����� �������");
        String grandManame = reader.readLine();
        System.out.println("������� ������� ������� � ��� ���� ����");
        String fatherName = reader.readLine();
        System.out.println("������� ������� ������� � ��� ����� ����");
        String motherName = reader.readLine();
        System.out.println("������� ������� ������� � ��� ���� ����");
        String sonName = reader.readLine();
        System.out.println("������� ������� ������� � ��� ����� �����");
        String daughterName = reader.readLine();

        //������� ������� � ����������� ������� �� ������ �����
        Cat grandFa = new Cat(grandFaname);

        Cat grandMa = new Cat(grandManame);

        Cat catFather = new Cat(fatherName, grandFa, null);

        Cat catMother = new Cat(motherName, null, grandMa);

        Cat catSon = new Cat(sonName, catFather, catMother);

        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        //������� ������� �� �����
        System.out.println(grandFa);
        System.out.println(grandMa);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.print(catDaughter);

    }

    public static class Cat
    {   //��������� � ������ Cat ���� ���������� ��������
        private String name;
        private Cat father;
        private Cat mother;


        Cat(String name)
        {   //������� ���������� ��� �������� � ������ ���������� ������ ��� ����
            this.name = name;
            this.father = null;
            this.mother = null;
        }

        Cat(String name, Cat father,  Cat mother)
        {   //������� ���������� ��� �������� � ������ ����������� ������ ��� ����
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        //�������������� �������� � ������
        public String toString()
        {
            return "Cat name is " + name +
                    ((mother != null) ? ", mother is " + mother.name : ", no mother") + ((father != null) ? ", father is " + father.name : ", no father");
        }

    }

}
