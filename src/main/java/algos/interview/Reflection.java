package algos.interview;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

/**
 * Reflection API
 */
public class Reflection implements Cloneable, Serializable {
    private int number;
    String name;
    protected boolean isClass;
    public LocalDateTime date = LocalDateTime.now();

    public class Inner {
        private int number;
        private String text;

        public Inner() {
        }

        public Inner(int number, String text) {
            this.number = number;
            this.text = text;
        }

        public static Class getDeclaringClassName() {
            return Reflection.Inner.class.getDeclaringClass();
        }
    }

    public Reflection() {
        System.out.println("Constructor no fields");
    }

    public Reflection(int number, String name, boolean isClass, LocalDateTime date) {
        this.number = number;
        this.name = name;
        this.isClass = isClass;
        this.date = date;
        System.out.println("Constructor with fields");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reflection that = (Reflection) o;
        return number == that.number
                && isClass == that.isClass
                && Objects.equals(name, that.name)
                && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, isClass, date);
    }

    public static Class getClassName() {
        return Reflection.class;
    }

    public static Class getDeclaringClassName() {
        return Reflection.class.getDeclaringClass();
    }

    public static Class getEnclosingClassName() {
        return Reflection.class.getEnclosingClass();
    }

    public static Constructor<?>[] getConstructors() {
        return Reflection.class.getConstructors();
    }

    public static Method[] getMethods() {
        return Reflection.class.getDeclaredMethods();
    }

    public static Field[] getFields() {
        return Reflection.class.getFields();
    }

    public static Field[] getDeclaredFields() {
        return Reflection.class.getDeclaredFields();
    }
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Non-Static block");
    }

    public static void main(String[] args) {
        Reflection r = new Reflection();
    }
}
