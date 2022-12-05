
package javaapplication3;


public class Student {
    String name,stuNo;
    int classes;//Kaçıncı sıhıf olduğu
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {//SINAV NOTLARININ TOPLU BİR ŞEKİLDE HESAPLAYAN METOT

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void verbalNote(int verb_mat, int verb_fizik, int verb_kimya){
        if (verb_mat >= 0 && verb_mat <= 100) {
            this.mat.verbalNote = verb_mat;
        }

        if (verb_fizik >= 0 && verb_fizik <= 100) {
            this.fizik.verbalNote = verb_fizik;
        }

        if (verb_kimya >= 0 && verb_kimya <= 100) {
            this.kimya.verbalNote = verb_kimya;
        }
    }
    public void calcAvarage() {
         
        double fizikAvg = this.fizik.note *0.8 + this.fizik.verbalNote * 0.2;
        double matAvg = this.mat.note *0.8 + this.mat.verbalNote * 0.2;
        double kimyaAvg = this.kimya.note *0.8 + this.kimya.verbalNote * 0.2;
        this.avarage = (fizikAvg + matAvg + kimyaAvg) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("************************");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note+" Matematik Sözlü Notu : "+this.mat.verbalNote);
        System.out.println("Fizik Notu : " + this.fizik.note+" Fizik Sözlü Notu : "+this.fizik.verbalNote);
        System.out.println("Kimya Notu : " + this.kimya.note+" Kimya Sözlü Notu : "+this.kimya.verbalNote);
    }

}
