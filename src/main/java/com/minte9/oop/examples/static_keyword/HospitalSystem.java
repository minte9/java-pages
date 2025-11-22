package com.minte9.oop.examples.static_keyword;

public class HospitalSystem {
    public static void main(String[] args) {

        new Hospital.Patient("Ana");
        new Hospital.Patient("Mike");

        Hospital.WaitingRoomScreen.showQueue();  // Patients in queue: 2
    }
}

class Hospital {
    static int patientsInQueue = 0;

    static class Patient {
        String name;

        public Patient(String name) {
            this.name = name;
            patientsInQueue++;
        }
    }

    static class WaitingRoomScreen {
        static void showQueue() {
            System.out.println("Patients in queue: " + patientsInQueue);
        }
    }
}


