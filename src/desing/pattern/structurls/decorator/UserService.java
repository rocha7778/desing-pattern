package desing.pattern.structurls.decorator;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	public String getEmail() {
		List<String> emails = new ArrayList<>();
		emails.add("rocha7778@hotmail.com");
		emails.add("paola7778@hotmail.com");
		int index = (int) (Math.random() * 1);
		return emails.get(index);
	}

	public String getPhone() {
		List<String> emails = new ArrayList<>();
		emails.add("316-3341608");
		emails.add("318-4626854");
		int index = (int) (Math.random() * 1);
		return emails.get(index);
	}

}
