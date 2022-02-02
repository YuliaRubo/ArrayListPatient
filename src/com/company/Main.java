package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        NameHospital nameHospital = new NameHospital("Амстердам");
        nameHospital.addPatientHospital(new Patient("Юрьев", "Григорий" , 23402847, 12367, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Петров", "Виктор" , 23402877, 64677, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Сидоров", "Андрей" , 23402675, 64344, "Ветрянка"));
        nameHospital.addPatientHospital(new Patient("Карин", "Мирон" , 23477777, 75747, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Сирн", "Петр" , 23407555, 14568, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Феров", "Василий" , 23402764, 23567, "Ветрянка"));
        nameHospital.addPatientHospital(new Patient("Утилов", "Борис" , 23402867, 12789, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Сабинов", "Федор" , 23402222 , 12999, "Ковид"));
        nameHospital.addPatientHospital(new Patient("Ситков", "Иван" , 23402847, 12387, "ОРВИ"));
        nameHospital.addPatientHospital(new Patient("Иванов", "Кирилл" , 23402847, 12357, "Ковид"));
        nameHospital.addPatientHospital(new Patient("Шишков", "Юрий" , 23402847, 12867, "ОРВИ"));


        System.out.println("Сортировка по имени");
        List<Patient> list = nameHospital.listPatientByName();
        for(Patient p: list){
            System.out.println(p);

        }
        System.out.println("Вывести больных с диагнозом Ковид");
        List<Patient> listSortByDiagnosis = nameHospital.listPenitentiary("Ковид");
        int resultCount=0;
                for(Patient p: listSortByDiagnosis){
                    System.out.println(p);
                    resultCount++;

                }
//        System.out.println("Всего больных Ковидом: " + resultCount);

        System.out.println("Вывести больных с диагнозом Ветрянка");
        List<Patient> listSortByDiagnosis1 = nameHospital.listPenitentiary("Ветрянка");
        int resultCount1=0;
        for(Patient p: listSortByDiagnosis1){
            System.out.println(p);
            resultCount1++;

        }
//        System.out.println("Всего больных Ковидом: " + resultCount1);

        System.out.println("Вывести больных с диагнозом ОРВИ");
        List<Patient> listSortByDiagnosis2 = nameHospital.listPenitentiary("ОРВИ");
        int resultCount2=0;
        for(Patient p: listSortByDiagnosis2){
            System.out.println(p);
            resultCount2++;

        }
        System.out.println("Всего больных ОРВИ: " + resultCount2);
        System.out.println("Всего больных Ветрянкой: " + resultCount1);
        System.out.println("Всего больных Ковидом: " + resultCount);

        System.out.println("Номара карт, сортировка");
        List<Patient> listByNumber = nameHospital.listSortByNumberKart(12367, 75747);
        for (Patient p: listByNumber){
            System.out.println(p);
        }

        System.out.println("Сортировка по номеру карты");
        List<Patient> list3 = nameHospital.compare();
        for(Patient k:list3){
            System.out.println(k);
        }
        System.out.println("Сортировка по номеру телефона");
        List<Patient>list4 = nameHospital.compare1();
        for(Patient g: list4){
            System.out.println(g);
        }

        }
    }

