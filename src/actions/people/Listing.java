package actions.people;

import java.util.List;

import data.Person;

import actions.base.BaseAction;

public class Listing extends BaseAction {
	public String execute() {
		people = services.getPeople();
		return "success";
	}

	List<Person> people;
	public List<Person> getPeople() { return people; }
}
