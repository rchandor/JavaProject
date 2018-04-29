package com.example.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.example.bean.EmployeeRootContainer;
import com.example.bean.Users;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class JsonServiceImpl implements IJsonService {

	@Override
	public void getJsonResponse() throws IOException {
		Reader reader = new FileReader("src/details.json");
		Gson gson = new Gson();
		EmployeeRootContainer employeeRootContainer = gson.fromJson(reader, EmployeeRootContainer.class);
		System.out.println(employeeRootContainer.toString());
	}

	@Override
	public void getJsonResponseFromUrl() throws IOException {
		String jsonurl = "https://jsonplaceholder.typicode.com/users";

		URL website = new URL(jsonurl);
		URLConnection connection = website.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

		StringBuilder response = new StringBuilder();
		String inputLine;

		while ((inputLine = in.readLine()) != null)
			response.append(inputLine);

		in.close();

		String finalJsonString = response.toString();

		Gson gson = new Gson();
		Type collectionType = new TypeToken<Collection<Users>>(){}.getType();
		Collection<Users> enums = gson.fromJson(finalJsonString, collectionType);
		
		Iterator<Users> it = enums.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Users " +it.next());
			System.out.println();
		}
	}

}
