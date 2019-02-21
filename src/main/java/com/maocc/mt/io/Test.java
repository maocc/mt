package com.maocc.mt.io;

import java.io.*;

/**
 * @author maocc
 * @description
 * @date: 2019/1/28 15:43
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*File file = new File("G:\\GitFile\\maocc\\mt");*/
        /*IOUtil.listAllFiles(file);*/

        /*try {
            IOUtil.copyFile("G:\\GitFile\\maocc\\mt\\pom.xml","G:\\GitFile\\maocc\\mt\\hah.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*String fileStr = "G:\\GitFile\\maocc\\mt\\pom.xml";
        IOUtil.readFileContent(fileStr);*/
        A a1 = new A(123, "abc");
        String objectFile = "G:\\GitFile\\maocc\\mt\\src\\main\\java\\com\\maocc\\mt\\io\\objectFile";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
        objectOutputStream.writeObject(a1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(a2);
    }

    private static class A implements Serializable {

        private int x;
        private String y;

        A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x = " + x + "  " + "y = " + y;
        }
    }
}
