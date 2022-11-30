package Bai1;

import Bai1.Student.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Student st = new Student();
        st.input();

        System.out.println(st.getiD());
        System.out.println(st.getName());

    }
}
