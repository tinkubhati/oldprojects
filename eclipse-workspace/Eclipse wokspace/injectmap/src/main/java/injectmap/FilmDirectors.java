package injectmap;

import java.util.List;
import java.util.Map;

public class FilmDirectors {
	
	private Map<Integer,String> directorMap;
	private List<String> directorList;
	private String messgae;
	
	
	public Map<Integer, String> getDirectorMap() {
		return directorMap;
	}
	public void setDirectorMap(Map<Integer, String> directorMap) {
		this.directorMap = directorMap;
	}
	public List<String> getDirectorList() {
		return directorList;
	}
	public void setDirectorList(List<String> directorList) {
		this.directorList = directorList;
	}
	public String getMessgae() {
		return messgae;
	}
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	@Override
	public String toString() {
		return "FilmDirectors [directorMap=" + directorMap + ", directorList=" + directorList + ", messgae=" + messgae
				+ "]";
	}
	
	
	

}
