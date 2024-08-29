package com.neoteric.functiondemo1.function;

public class ExampleDB {



        public static void main(String[] args){
            try{
                StudentService es =(StudentService) Class.forName(
                        "com.neoteric.javadoc.model.Service"
                ).newInstance();
                String objectCreationNewway =es.creatingNewObjectWithNewInstance();
                System.out.println("objectCreationNoway"+objectCreationNewway);

            }catch(ClassNotFoundException e){
                System.out.println("ClassNotFoundException"+e);
            }catch(InstantiationException e){
                System.out.println("InstantiationException"+e);
            }catch(IllegalAccessError e){
                System.out.println("IllegalAccessError"+e);
            }catch(Exception e){
                System.out.println("Exception"+e);
            }
        }
    }


