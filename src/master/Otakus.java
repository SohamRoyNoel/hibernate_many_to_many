package master;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Otakus {
	@Id
	@Column(length=3)
	int otaku_id;
	@Column(length=20)
	String otaku_name;
	
	@ManyToMany
	@JoinTable(
				name="Anime_otaku",
				joinColumns=@JoinColumn(name="otaku_id"),
				inverseJoinColumns=@JoinColumn(name="anime_id")
			)
	
	List<Animes> animes =  new ArrayList<>();
	
	
	public int getOtaku_id() {
		return otaku_id;
	}
	public void setOtaku_id(int otaku_id) {
		this.otaku_id = otaku_id;
	}
	
	
	public List<Animes> getAnimes() {
		return animes;
	}
	public void setAnimes(List<Animes> animes) {
		this.animes = animes;
	}
	public String getOtaku_name() {
		return otaku_name;
	}
	public void setOtaku_name(String otaku_name) {
		this.otaku_name = otaku_name;
	}
	
	
}
