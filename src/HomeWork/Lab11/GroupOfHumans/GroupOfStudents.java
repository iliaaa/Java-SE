package HomeWork.Lab11.GroupOfHumans;

public class GroupOfStudents {
    private final int groupNumber;
    private int sizeOfGroup;
    private HumanBeing[] arrOfStuds;

    public GroupOfStudents(int groupNumber, int sizeOfGroup) {
        this.groupNumber = groupNumber;
        this.sizeOfGroup = sizeOfGroup;
        arrOfStuds = new HumanBeing[sizeOfGroup];
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getSizeOfGroup() {
        return sizeOfGroup;
    }

    public void setSizeOfGroup(int sizeOfGroup) {
        this.sizeOfGroup = sizeOfGroup;
    }

    public void addStuds(HumanBeing student) throws RuntimeException{
        if (arrOfStuds[sizeOfGroup - 1] != null) {
            throw  new RuntimeException("\n||Impossible to add: Group is full now||\n");
        }
        for (int i = 0; i < sizeOfGroup; i++) {
             if (arrOfStuds[i] == null) {
                arrOfStuds[i] = student;
                 System.out.println("\n==========================" +
                         "\n||STUDENT: " + student + " \nIS ADDED SUCCESSFULLY||" +
                         "\n==========================");
                 break;
            }
        }
    }

    public HumanBeing[] getArrOfStuds() {
        return arrOfStuds;
    }
}
