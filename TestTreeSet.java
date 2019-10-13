package cn.test.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet
 * @author dell
 *
 */

public class TestTreeSet {
	public static void main(String[] args) {
		Set<Emp> set=new TreeSet<>();//底层实现就是TreeMap
		 
		set.add(new Emp(1,"aaa",5000));
		set.add(new Emp(2,"bbb",5000));
		set.add(new Emp(1,"ccc",200));
		
		System.out.println(set);
		
	}

}
