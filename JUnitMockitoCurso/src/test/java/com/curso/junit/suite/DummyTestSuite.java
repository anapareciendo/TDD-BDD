package com.curso.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.curso.junit.helper.ArraysCompareTest;
import com.curso.junit.helper.ArraysTest;
import com.curso.junit.helper.StringHelperTest;

@RunWith(Suite.class)
@SuiteClasses({ArraysTest.class,StringHelperTest.class, ArraysCompareTest.class})
public class DummyTestSuite {

}
