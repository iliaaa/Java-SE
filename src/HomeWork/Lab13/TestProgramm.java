package HomeWork.Lab13;

import HomeWork.Lab13.work.Dell;
import HomeWork.Lab13.work.Employee;
import HomeWork.Lab13.work.GetBrains;
import HomeWork.Lab13.work.TSystems;

public class TestProgramm {
    public static void main(String[] args) {
        TSystems tSystems = new TSystems();
        Employee tEmp1 = new Employee("ras", "positionras", 1);
        Employee tEmp2 = new Employee("dva", "positiondva", 2);
        Employee tEmp3 = new Employee("tri", "positiontri", 3);

        tSystems.setEmployee(tEmp1).setEmployee(tEmp2).setEmployee(tEmp3);

        GetBrains getBrains = new GetBrains();
        Employee gbEmp1 = new Employee("chetire", "positionchetire", 4);
        Employee gbEmp2 = new Employee("pyat", "positionpyat", 5);
        Employee gbEmp3 = new Employee("shest'", "positionshest'", 6);

        getBrains.setEmployee(gbEmp1).setEmployee(gbEmp2).setEmployee(gbEmp3);

        Dell dell = new Dell();
        Employee dEmp1 = new Employee("sem'", "positionsem'", 7);
        Employee dEmp2 = new Employee("vosem'", "positionvosem'", 8);
        Employee dEmp3 = new Employee("devyat'", "positiondevyat'", 9);

        dell.setEmployee(dEmp1).setEmployee(dEmp2).setEmployee(dEmp3);
    }
}
