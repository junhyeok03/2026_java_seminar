package ch12.sec11.exam02;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 1. Car 클래스의 Class 객체 얻기
        Class clazz = Car.class;

        System.out.println("[생성자 정보]");
        // 모든 생성자 정보 가져오기
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        // 모든 필드(변수) 정보 가져오기
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        // 모든 메소드 정보 가져오기
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
    }

    // 매개변수 정보를 예쁘게 출력하기 위한 보조 메소드
    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getName());
            if (i < (parameters.length - 1)) {
                System.out.print(",");
            }
        }
    }
}