package com.ealrlysense;

/**
 * Created by Evegeny on 14/11/2016.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
