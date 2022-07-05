package dbConnect;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CityEntity {

	@Id
	private int index;
	private String cityName;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
