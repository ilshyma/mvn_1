package api;

/**
 * Created by user on 24.11.2015.
 */
public class SchoolClass {

        private String nameClass;
        private int amountStudents;

        SchoolClass(String nameClass, int amountStudents){
            this.nameClass = nameClass;
            this.amountStudents = amountStudents;
        }

        public String getNameClass() {
            return nameClass;
        }
        public void setNameClass(String nameClass) {
            this.nameClass = nameClass;
        }

        public int getAmountStudents() {
            return amountStudents;
        }
        public void setAmountStudents(int amountStudents) {
            this.amountStudents = amountStudents;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SchoolClass that = (SchoolClass) o;

            if (amountStudents != that.amountStudents) return false;
            return !(nameClass != null ? !nameClass.equals(that.nameClass) : that.nameClass != null);
        }

        @Override
        public int hashCode() {
            int result = nameClass != null ? nameClass.hashCode() : 0;
            result = 31 * result + amountStudents;
            return result;
        }

}
