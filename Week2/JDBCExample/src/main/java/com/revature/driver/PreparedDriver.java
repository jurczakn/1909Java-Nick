package com.revature.driver;

import java.util.Scanner;

import com.revatue.pojo.User;
import com.revature.dao.UserDAO;

public class PreparedDriver {

	private static UserDAO userDao = new UserDAO();

	public static void main(String[] args) {

		System.out.println("Do you want to create a user or change your password?");

		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();

		if ("create".equals(answer.toLowerCase())) {

			System.out.println("enter your username: ");

			String username = sc.nextLine();

			System.out.println("Enter password");

			String password = sc.nextLine();

			userDao.createUser(new User(-1, username, password));

		} else if ("change".equals(answer.toLowerCase())) {
			System.out.println("enter your username: ");

			String username = sc.nextLine();

			System.out.println("Enter password");

			String password = sc.nextLine();
			
			userDao.preparedUpdatePassword(new User(-1, username, password));

		} else {
			System.out.println("what is your username?");
			String username = sc.nextLine();

		}

	}

}
