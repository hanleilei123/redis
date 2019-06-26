package com.example.demo.AlgorithmPractices;

/**
 * Created by Administrator on 2019/6/10.
 */




    public class Teacher {
        public int div(int a, int b) {
            try {
                return a / b;
            }catch(Exception e){
                System.out.println("Exception");
            } finally {
                System.out.println("finally");
            }
            return 0;
        }
   /* public int div(int a, int b,String d) {
        try {
            return a / b;
        }catch(Exception e){
            System.out.println("Exception");
        }catch(NullPointerException e){
            System.out.println("ArithmeticException");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally");
        }
        return 0;
    }*/
    public static void main(String[] args) {
       new Teacher().div(1,0);
        }



    }