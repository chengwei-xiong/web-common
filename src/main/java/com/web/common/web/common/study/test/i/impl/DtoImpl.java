package meituan.zylproxy.test.i.impl;

import meituan.zylproxy.test.i.Idto;
import meituan.zylproxy.test.i.Idto2;

public class DtoImpl implements Idto, Idto2 {

    @Override
    public void add() {
        System.out.println("add");

    }

    @Override
    public String get() {
        System.out.println("get");
        return "return get";
    }

    @Override
    public void adda() {
        System.out.println("adda");
    }

    @Override
    public String geta() {
        System.out.println("geta");
        return "return geta";
    }

}
