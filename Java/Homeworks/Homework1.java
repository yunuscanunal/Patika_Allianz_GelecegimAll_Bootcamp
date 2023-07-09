import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework1 {

    public static void main(String[] args) {

        ArrayList<String> Class1 = new ArrayList<>();

        Class1.add("Utku Kizilirmak");
        Class1.add("Asya Berker");
        Class1.add("Derya Aksit");
        Class1.add("Berrak Babacan");
        Class1.add("Tutku Zeybek");
        Class1.add("Sabah Sanli");
        Class1.add("Sinem Bulut");
        Class1.add("Sevim Asani");
        Class1.add("Tutku Sasmaz");

        ArrayList<String> Class2 = new ArrayList<>();

        Class2.add("Sidika Inan");
        Class2.add("Oz Ozkul");
        Class2.add("Makbule Sezer");
        Class2.add("Yunuscan Unal");
        Class2.add("Ece Gokmen");
        Class2.add("Muge Saygi");
        Class2.add("Behiye Eroglu");
        Class2.add("Numan Ozek");
        Class2.add("Duyal Ozek");

        ArrayList<String> Class3 = new ArrayList<>();

        Class3.add("Altay Sarica");
        Class3.add("Kamuran Cakir");
        Class3.add("Aysenur Cakir");
        Class3.add("Osman Yucel");
        Class3.add("Bilge Nur Okyay");
        Class3.add("Beyza Can Koc");
        Class3.add("Kerem Kunyeli");
        Class3.add("Ulvi Erkan");
        Class3.add("Altan Sarica");

        Map<String, ArrayList> studentClass = new HashMap<>();

        studentClass.put("Class-1", Class1);
        studentClass.put("Class-2", Class2);
        studentClass.put("Class-3", Class3);

        for (int i = 0; i < studentClass.size(); i++) {
            ArrayList classArr = (studentClass.get("Class-" + (i + 1)));
            for (int j = 0; j < classArr.size(); j++) {
                String names = classArr.get(j).toString();
                String splitName[] = names.split(" ");
                String justName = splitName[splitName.length - 2];
                if (justName.endsWith("an")) {
                    System.out.println(names + " in the Class-" + (i + 1));
                }
            }
        }

    }

}