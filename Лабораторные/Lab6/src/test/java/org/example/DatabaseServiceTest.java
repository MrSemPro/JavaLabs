package org.example;

import org.testng.annotations.Test;
public class DatabaseServiceTest{
    @Test
    public void test(){
        DatabaseService service = new DatabaseService();
        service.exec();
    }
}