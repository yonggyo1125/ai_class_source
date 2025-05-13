package org.koreait.exam01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class Ex03 {

    @TempDir
    private File tempDir;

    @BeforeEach
    void init() {
        String path = tempDir.getAbsolutePath();
        System.out.println(path);
    }

    @Test
    void test1() {

    }

    @AfterEach
    void clean() {
        tempDir.delete();
    }
}
