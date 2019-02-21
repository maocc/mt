package com.maocc.mt.nio;// $Id$

import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.Random;

public class UseFloatBuffer {
    static public void main(String args[]) throws Exception {
      floatBufferEG();
      longBufferEG();
    }

  private static void longBufferEG() {
    LongBuffer longBuffer = LongBuffer.allocate(6);
    for (int i = 0; i < longBuffer.capacity(); ++i) {
	  long l = new Random().nextLong();
	  longBuffer.put(l);
	}

    longBuffer.flip();

    while (longBuffer.hasRemaining()) {
	  Long l = longBuffer.get();
	  System.out.println(l);
	}
  }

  private static void floatBufferEG() {
    FloatBuffer buffer = FloatBuffer.allocate(10);

    for (int i = 0; i < buffer.capacity(); ++i) {
		float f = (float) Math.sin((((float) i) / 10) * (2 * Math.PI));
		buffer.put(f);
	}

    buffer.flip();

    while (buffer.hasRemaining()) {
		float f = buffer.get();
		System.out.println(f);
	}
  }
}
