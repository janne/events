package actions.people;

import actions.base.BaseAction;

public class New extends BaseAction {
	public String execute() {
		if (name != null && name.length() > 0) {
			services.createPerson(name);
			return redirect("Listing.action");
		}
		return "success";
	}
	
	String name;
	public String getName() {return name;}
	public void setName(String value) { name = value; }
}
