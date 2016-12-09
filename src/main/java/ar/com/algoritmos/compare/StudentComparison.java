package ar.com.algoritmos.compare;

import ar.com.algoritmos.Student;

import java.util.Comparator;
import java.util.List;

/**
 * Multiple comparison method throw multiple criteria.
 */
public class StudentComparison {

    public static Comparator<Student> createComparator(final List<StudentComparator> comparators) {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                for (StudentComparator comparator : comparators) {
                    int result = comparator.compare(s1, s2);
                    if (result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };
    }

    public static Comparator<Student> createComparatorWithSortOrder(final SortOrder order, final List<StudentComparator> comparators) {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                for (StudentComparator comparator : comparators) {
                    int result = comparator.compare(s1, s2);
                    if (result != 0) {
                        if (order == SortOrder.ASC) {
                            return result;
                        } else {
                            return result * -1;
                        }
                    }
                }
                return 0;
            }
        };
    }

    public enum SortOrder {
        ASC, DES
    }

    public enum  StudentComparator implements Comparator<Student> {
        NAME {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        },

        AGE {
            public int compare(Student s1, Student s2) {
                return Integer.valueOf(s1.getAge()).compareTo(s2.getAge());
            }
        }
    }
}