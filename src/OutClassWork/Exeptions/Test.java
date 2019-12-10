package OutClassWork.Exeptions;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        String message = "";
       // System.out.println(stackTraceElements.length);

        if(stackTraceElements.length >= 4) {
            StackTraceElement element = stackTraceElements[3];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            message = className + "#" + methodName;
            return message;
        } else {
            return null;
        }
    }
}
