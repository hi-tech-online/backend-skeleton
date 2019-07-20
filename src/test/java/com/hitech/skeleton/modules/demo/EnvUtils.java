package com.hitech.skeleton.modules.demo;

import java.util.Map;

public class EnvUtils {
	public static void main(String[] args) {
		Map<String, String> envs = System.getenv();
		System.out.println(envs);
		System.out.println();
		System.out.println(envs.get("JAVA_HOME"));
	}
}
