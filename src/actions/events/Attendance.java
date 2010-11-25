package actions.events;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import data.*;
import actions.base.BaseAction;

public class Attendance extends BaseAction {
	public String execute() {
		return "success";
	}
	
	int id;
	public void setId(int value) {id = value;}
	public int getId() {return id; }
	
	Event getEvent() {return services.getEventById(id); }
	public String getEventName() { return getEvent().getName(); }
	
	public Set<Person> getAttendees() { return getEvent().getPeople(); }

	// Return a list of people not attending
	public List<Person> getNonAttendees() {
		List<Person> nonAttendees = new ArrayList<Person>();
		for(Person person : services.getPeople()) {
			if (!getAttendees().contains(person))
				nonAttendees.add(person);
		}
		return nonAttendees;
	}
}
