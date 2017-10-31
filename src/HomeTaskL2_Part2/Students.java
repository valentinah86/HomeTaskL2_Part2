package HomeTaskL2_Part2;

public class Students {

    enum NamesList {
        Иван, Евгений, Фёдор, Мария, Жанна, Вера, Пётр, Сергей, Василий, Марк, Александр, Ада, Елена, Марина, Кристина, Инна;
    }

    enum SurnameList {

        Седых, Веллер, Шредингер, Иваненко, Миронян, Шиндлер, Сидоренко, Кац, Тиньков, Кривешко, Павлюченко, Колос, Вассерман, Керо, Федоренко;
    }

    private int Id;
    private NamesList Name;
    private SurnameList Surname;
    private int Age;

    public Students (int Id, NamesList Name, SurnameList Surname, int Age){

        this.Id = Id;
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public NamesList getName() {
        return Name;
    }

    public void setName(NamesList name) {
        Name = name;
    }

    public SurnameList getSurname (){
        return Surname;
    }

    public void setSurname(SurnameList surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return ("Student: Id =" + this.getId() + " | " + this.getName() + " " + this.getSurname() + " | Age - " + this.getAge()+"\n" );
    }

}


