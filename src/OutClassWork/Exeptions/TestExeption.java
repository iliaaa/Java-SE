package OutClassWork.Exeptions;

public class TestExeption {
    static void doRisly(String test) throws ScaryExeption {
        if("yes".equals(test)) {
            throw new ScaryExeption(test);
        }

        System.out.println("The end of risky method");
    }

    public static void main(String[] args) {
        String test = "yes";

        try {
            System.out.println("Start try");
            doRisly(test);
            System.out.println("End try");
        } catch (ScaryExeption e) {
            System.out.println(e);
        } finally {
            System.out.println("End of main");
        }
    }
}

class ScaryExeption extends Exception {
    String test;

    ScaryExeption(String test) {
        this.test = test;
    }

    public String toString() {
        return "ScaryExeption: \"" + test + "\"";
    }
}
