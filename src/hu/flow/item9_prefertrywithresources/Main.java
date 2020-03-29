package hu.flow.item9_prefertrywithresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

  public static void main(String[] args) throws IOException {
    //BAD PRACTICE
    InputStream in = new FileInputStream("./fake.txt");
    try {
      OutputStream out = new FileOutputStream("./dest.txt");
      try {
        byte[] buf = new byte[10];
        int n;
        while ((n = in.read(buf)) >= 0) {
          out.write(buf, 0, n);
        }
      } finally {
        out.close();
      }
    } finally {
      in.close();
    }
    //BETTER PRACTICE
    try (InputStream in2 = new FileInputStream("./fake.txt"); OutputStream out2 = new FileOutputStream("./dest.txt")) {
      byte[] buf = new byte[10];
      int n;
      while ((n = in2.read(buf)) >= 0) {
        out2.write(buf, 0, n);
      }
    }
    //BEST PRACTICE
    try (InputStream in2 = new FileInputStream("./fake.txt"); OutputStream out2 = new FileOutputStream("./dest.txt")) {
      byte[] buf = new byte[10];
      int n;
      while ((n = in2.read(buf)) >= 0) {
        out2.write(buf, 0, n);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}