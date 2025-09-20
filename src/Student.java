public class Student {
    String name;
    int grade;
    int years;
    boolean aktiv;
    double score;
    int isPassing;
   //task 1,2,3 birlesdirmeye calisdim sjsjjsj


    public Student(String name, int grade, int years, boolean aktiv, double score, int isPassing) {
        this.name = name;
        this.grade = grade;
        this.years = years;
        this.aktiv = aktiv;
        this.score = score;
        this.isPassing = isPassing;
    }

    public boolean isPassing() {
        if (score >= 50) {
            System.out.println("İmtahanı kecdiniz");
            return true;
        } else  {
            System.out.println("Imtahanı kecmediniz");
            return false;

        }
    }

        @Override
        public String toString () {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    ", years=" + years +
                    ", aktiv=" + aktiv +
                    ", score=" + score +
                    ", isPassing=" + isPassing +
                    '}';
        }
    }

