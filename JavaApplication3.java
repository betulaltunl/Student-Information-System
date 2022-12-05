
package javaapplication3;

/**
 *
 * @author Betül Altunel
 */
public class JavaApplication3 {

    
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Veli Hoca", "0000000", "MAT");
        Teacher t2 = new Teacher("Fatma Hoca", "1111111", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "2222222", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Semih", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,50,50);
        s1.verbalNote(50, 50, 50);
        s1.isPass();

        Student s2 = new Student("Elif", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,100,100);
        s1.verbalNote(100, 100, 100);
        s2.isPass();

        Student s3 = new Student("Kamil", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(10,10,10);
        s1.verbalNote(10, 10, 10);
        s3.isPass();
    }
    
}
