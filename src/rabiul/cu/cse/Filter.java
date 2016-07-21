package rabiul.cu.cse;

import java.util.List;

public class Filter {
	String name;
	String address;
	List<String> contentFilters;

	public Filter(String name, String address, List<String> contentFilters) {
		this.name = name;
		this.address = address;
		this.contentFilters = contentFilters;
	}
}
