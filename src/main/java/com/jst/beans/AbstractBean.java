package com.jst.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Arnaud
 */
public interface AbstractBean extends Serializable  {
    ArrayList get();
    boolean add();
    //public void update();
}