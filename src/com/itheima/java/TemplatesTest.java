package com.itheima.java;
/*
 @author wenhao
 @date 2018-07-23 - 10:54
 IDEA模板位置 live templates/postfix completion
*/

import com.itheima.bean.Customer;

import java.util.ArrayList;

public class TemplatesTest {
    //模板:prsf  可生成private static final
    private static final Customer cust =new  Customer();
    //psf
    public static final int num1=1;
    //psfi
    public static final int num=2;
    //psfs
    public static final String name="hello";

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        //变形拓展：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num=10;
        int num1=20;
        System.out.println("num = " + num);//打印就近的变量
        System.out.println("num1 = " + num1);
        System.out.println(num1);//xxx.sout

        //模板3 ：for i
        String [] arr=new String[]{"tom","jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四:list.for
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        for (Object o : list) {

        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
    public void method(){
        ArrayList list =new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        //模板5:ifn
        if (list == null) {

        }

        //模板6：inn
        if (list != null) {

        }

        //变形：xxx.null/ xxx.nn
        if (list == null) {

        }
        if (list != null) {

        }


    }
}
