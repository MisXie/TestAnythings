package com.xie;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Unit test for simple App.
 */
public class AppTest {
  @Test
  public void shouldAnswerWithTrue() {
    Vector vector = new Vector();
    vector.get(1);
    vector.set(1,"");
    vector.add("");
    ArrayList list = new ArrayList();
    list.add("");
    list.get(1);
    LinkedList link = new LinkedList();
    link.add("");
    link.get(1);
    link.pollFirst();
    link.pop();
    ConcurrentHashMap<String,String> m = new ConcurrentHashMap<>();
    m.get("");
    m.put("","");
  }
}
