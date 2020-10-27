package com.sparta.toyin;


import com.sparta.toyin.Model.ReadFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReadFileTest {

    @Test
    @DisplayName("Testing to see if the HashMap is filled and the number of unique records returned")
    void dataMigrationTest(){
        Assertions.assertFalse(ReadFile.readFile().isEmpty());
        System.out.println("Testing to see if the hashMap has been populated with expected number of records (depends on database used)");
        Assertions.assertEquals(9943, ReadFile.readFile().size());
    }

}
