package HomeTaskL2_Part2;


import java.util.*;

public class Actions {

    private Random r = new Random();
    private ArrayList studentsList = new ArrayList<Students>();
    private HashMap<Integer, Students> stListToMap = new HashMap<>();

    private int generateAge() {
        int minAge = 16;
        int maxAge = 30;
        return r.nextInt(maxAge - minAge + 1) + minAge;
    }

    private int generateStudentID() {

        int max = 150;
        int min = 10;
        int value = r.nextInt(max - min+15) + min;
        return value;
    }

    private Students createStudent() {

        return (new Students(generateStudentID(),
                Students.NamesList.values()[r.nextInt(Students.NamesList.values().length)],
                Students.SurnameList.values()[r.nextInt(Students.SurnameList.values().length)],
                generateAge()));
    }

    public ArrayList generateStudentsList(int value) {

        for (int i = 0; i < value; i++) {
            studentsList.add(createStudent());
        }
        return studentsList;
    }

    public ArrayList getStudentsList() {
        return studentsList;
    }

    public ArrayList sortStudentsByAge() {
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return studentsList;
    }

    public ArrayList filterSurnameByFirstLetter(String letter, ArrayList<Students> studentsList) {

        ArrayList filteredList = new ArrayList<Students>();
        String surname;

        for (Students students : studentsList) {

            surname = students.getSurname().toString();
            char[] str = surname.toCharArray();
            char s = str[0];

            if (s == letter.toUpperCase().charAt(0)) {
                filteredList.add(students);
            }
        }

        return filteredList;
    }


   public double calculateAverageAge(ArrayList<Students> studentsList){

        double averageAge;
        int sumAge=0;

        for (Students students: studentsList){
            sumAge += students.getAge();
                   }
        averageAge = sumAge/studentsList.size();

        return averageAge;
    }

    public HashMap <Integer,Students> convertStudentsListToMap (ArrayList<Students> studentsList){

       for (Students students: studentsList){
           stListToMap.put(r.nextInt(150), students);
       }

       return stListToMap;
    }

    public HashMap<Integer, Students> filterByID(HashMap<Integer, Students> stListToMap) {

        HashMap<Integer, Students> filteredMap = new HashMap<>();

        for (Map.Entry<Integer, Students> pair : stListToMap.entrySet()) {
            int value = pair.getValue().getId();
            if (value >= 100) {
                filteredMap.put(pair.getKey(), pair.getValue());
            }
        }
        return filteredMap;
    }



}
