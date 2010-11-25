package actions.people;

import data.Person;
import actions.base.BaseAction;

public class Delete extends BaseAction {
	public String execute() {
		if (isPostBack) {
			services.deletePersonById(id);
			return redirect("Listing.action");
		}
		return "success";
	}
	
	int id;
	public void setId(int value) { id = value; }
	public int getId() { return id; }
	
	boolean isPostBack;
	public void setIsPostBack(boolean value) { isPostBack = value; }
	
	public Person getPerson() { return services.getPersonById(id); }
	public String getPersonName() { return getPerson().getName(); }
}
