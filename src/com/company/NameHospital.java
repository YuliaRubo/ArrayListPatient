package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameHospital {
    private String nameHospital;
    List<Patient> listPatient = new ArrayList<>();

    public NameHospital(String nameHospital) {
        this.nameHospital = nameHospital;

    }

    void addPatientHospital(Patient patient) {
        listPatient.add(patient);
    }


    List<Patient> listPatientByName() {
        ArrayList<Patient> listByName = new ArrayList<>(listPatient);
        Collections.sort(listByName, new Comparator<Patient>() {

            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }

        });
        return listByName;
    }

    List<Patient> listPenitentiary(String diagnosis){
       List<Patient>listByDiagnosis = new ArrayList<>();
        for(Patient c: listPatient){
            if(diagnosis.equals(c.getDiagnosis())){
            listByDiagnosis.add(c);
            }
        }

        return listByDiagnosis;

        }

        List<Patient> listSortByNumberKart(int numberKartStart, int numberKartEnd){
        List<Patient> listByNumberKart=new ArrayList<>();
        for(Patient p: listPatient){
            if(p.getNumberKart()>=numberKartStart&&p.getNumberKart()<=numberKartEnd){
                listByNumberKart.add(p);
            }
        }
        return listByNumberKart;

        }
       List<Patient>compare(){
        List<Patient>listByNumberSotr = new ArrayList<>(listPatient);
        Collections.sort(listByNumberSotr, new Comparator<Patient>() {
            @Override
            public int compare(Patient t1, Patient t2) {
                if (t1.getNumberKart() == t2.getNumberKart()) {
                    return 0;
                }
                if (t1.getNumberKart() >t2.getNumberKart()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

           return listByNumberSotr;
       }
    List<Patient>compare1(){
        List<Patient>listByNumberSotr1= new ArrayList<>(listPatient);
        Collections.sort(listByNumberSotr1, new Comparator<Patient>() {
            @Override
            public int compare(Patient t1, Patient t2) {
                if (t1.getTelNumber() == t2.getTelNumber()) {
                    return 0;
                }
                if (t1.getTelNumber() >t2.getTelNumber()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });

        return listByNumberSotr1;
    }
}



